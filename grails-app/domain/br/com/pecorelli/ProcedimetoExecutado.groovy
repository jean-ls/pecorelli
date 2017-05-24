package br.com.pecorelli

class ProcedimetoExecutado {
    Date date, retorno
    String procedimento
    Paciente paciente
    static constraints = {
        procedimento nullable: false, blank: false
        date nullable: false
        retorno nullable: true
        paciente nullable: false
    }
}
