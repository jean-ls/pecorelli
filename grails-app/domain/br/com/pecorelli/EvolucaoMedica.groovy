package br.com.pecorelli

class EvolucaoMedica {
    Date data
    String evolucao
    Paciente paciente

    static constraints = {
        data nullable: false, blank: false
        evolucao nullable: false, blank: false, maxSize: 65000
        paciente nullable: false, blank: false
    }
}
