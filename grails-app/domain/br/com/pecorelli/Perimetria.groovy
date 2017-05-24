package br.com.pecorelli

class Perimetria {
    String bcEsquerdo, bcDireito, abdmSuperior, abdmMedio, abdmInferior, coxaEsq, coxaDir
    Date date
    Paciente paciente

    static constraints = {
        bcEsquerdo nullable: true, blank: true
        bcDireito nullable: true, blank: true
        abdmInferior nullable: true, blank: true
        abdmMedio nullable: true, blank: true
        abdmSuperior nullable: true, blank: true
        coxaDir nullable: true, blank: true
        coxaEsq nullable: true, blank: true
        date  nullable: false
        paciente nullable: false
    }
}
