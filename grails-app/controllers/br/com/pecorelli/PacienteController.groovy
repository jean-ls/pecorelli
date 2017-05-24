package br.com.pecorelli

import grails.transaction.Transactional
import org.springframework.dao.DataIntegrityViolationException

class PacienteController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index() {
        return [pacientes: Paciente.list()]
    }

    def create(){
        return [paciente: new Paciente(params)]
    }

    def edit(Paciente paciente){
        if(!paciente){
            redirect(uri: '/404')
        }else {
            return [paciente: paciente]
        }
    }

    @Transactional
    def save(Paciente paciente){
        withForm {
            paciente.withTransaction { status ->
                try{
                    paciente.dataAtualizacao = paciente.dataCadastro = new Date()
                    paciente.estadoCivil = params?.estadoCivil
                    paciente.sexo = params?.sexo
                    println params
                    if(!paciente.validate()){
                        status.setRollbackOnly()
                        respond paciente.errors, view:'create'
                        return
                    }
                    paciente.save(flush: true)
                    flash.message = "Registro inserido com sucesso"
                    redirect action:'index'
                }catch (Exception e){
                    e.printStackTrace()
                    status.setRollbackOnly()
                    flash.message = "Falha ao inserir o arquivo"
                    flash.level = "danger"
                    redirect action: 'index'
                }
            }
        }.invalidToken {
            redirect action: 'create'
        }
    }

    @Transactional
    def delete(Paciente paciente){
        withForm {
            if(!paciente){
                redirect(uri: '/404')
                return
            }
            paciente.withTransaction { status ->
                try{
                    paciente.delete(flush: true)
                    flash.message = "Registro removido com sucesso"
                    redirect action:'index'
                }catch (DataIntegrityViolationException e){
                    status.setRollbackOnly()
                    flash.message = "Falha ao remover o arquivo"
                    flash.level = 'danger'
                    redirect action: 'index'
                }
            }
        }.invalidToken {
            redirect action: 'index'
        }
    }

    @Transactional
    def update(Paciente paciente){
        withForm {
            if(!paciente){
                flash.message = "Registro não encontrado"
                redirect(uri: '/notFound')
                return
            }
            paciente.withTransaction { status ->
                try{
                    paciente.dataAtualizacao = new Date()
                    if(!paciente.validate()){
                        status.setRollbackOnly()
                        respond paciente.errors, view:'edit'
                        return
                    }
                    paciente.save(flush: true)
                    flash.message = "Registro atualizado com sucesso"
                    redirect action:'index'
                }catch (Exception e){
                    e.printStackTrace()
                    status.setRollbackOnly()
                    flash.message = "Falha ao atualizar o arquivo"
                    flash.level = 'danger'
                    redirect action: 'index'
                }
            }
        }.invalidToken {
            redirect action: 'create'
        }
    }
}
