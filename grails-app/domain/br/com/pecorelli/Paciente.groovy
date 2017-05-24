package br.com.pecorelli

import grails.databinding.BindingFormat

class Paciente {
    String nome, endereco, ocupacao, cidade, bairro, telefone, celular, email, nascionalidade,
            sexo, cpf, cep, numero, dataNascimento, estadoCivil, cor
    @BindingFormat("dd/MM/yyyy HH:mm:ss")
    Date dataCadastro, dataAtualizacao

    static constraints = {
        nome nullable: false, blank: false
        endereco nullable: true, blank: true
        cidade nullable: true, blank: true
        bairro nullable: true, blank: true
        cep nullable: true, blank: true
        numero nullable: true, blank: true
        email nullable: true, blank: true, email: true
        sexo nullable: true, blank: true
        dataNascimento nullable: true, blank: true
        dataCadastro nullable: false
        ocupacao nullable: true, blank: true
        telefone nullable: true, blank: true
        dataAtualizacao nullable: false
        celular nullable: true, blank: true
        nascionalidade nullable: true, blank: true
        cor nullable: true, blank: true
        cpf nullable: true, blank: true
        estadoCivil nullable: true, blank: true
    }
}
