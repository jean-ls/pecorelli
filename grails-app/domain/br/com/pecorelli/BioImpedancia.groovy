package br.com.pecorelli

class BioImpedancia {
    String peso, gordura, retencaoAgua, musculo, ossea
    Paciente paciente
    Date date

    static constraints = {
        peso nullable: true, blank: true
        gordura nullable: true, blank: true
        retencaoAgua nullable: true, blank: true
        musculo nullable: true, blank: true
        ossea nullable: true, blank: true
        paciente nullable: false
        date nullable: false
    }
}
