package br.com.pecorelli

class AnamneseGeral {
    Paciente paciente
    Date dataCadastro, dataAtualizacao
    String queixaPaciente, antecedenteClinico, antecedenteCirurgico, alergicoMedicamentos, alergicoAlimentos,
            alergicoOutros, ginecologicoG, ginecologicoP, ginecologicoA, ginecologicoD, ginecologicoI, ginecologicoF,
            ginecologicoDUM, ginecologicoDescricao, historiaDoencaAtual, hdaOutrasDoencas, usoMedicamentos, umReposicaoHormonal, umPsicotropicos, umOutros,
            afQual, afFrequencia, efDescricao, hd, tratamentoProposto, hpEtilismo
    BigDecimal efPeso, efAltura, efIMC, efPA, efMMHG, efFC, efSPO2

    boolean hdahipertencaoArterial, hdaDiabetes, hdaHipotireoidismo, hdaHipertireoidismo, hdaSindromePanico, hdaDepressao, hdaColagenoses
    boolean umAntiDepressivos, umIsotretinoinaOral, umAAS
    boolean hpTabagismo
    static constraints = {
        dataCadastro nullable: false
        dataAtualizacao nullable: false
        paciente nullable: false, blank: false
        queixaPaciente nullable: true, blank: true
        antecedenteClinico  nullable: true, blank: true
        antecedenteCirurgico nullable: true, blank: true
        alergicoMedicamentos nullable: true, blank: true
        alergicoAlimentos nullable: true, blank: true
        alergicoOutros nullable: true, blank: true
        ginecologicoG nullable: true, blank: true
        ginecologicoP nullable: true, blank: true
        ginecologicoA nullable: true, blank: true
        ginecologicoDUM nullable: true, blank: true
        ginecologicoD nullable: true, blank: true
        ginecologicoI nullable: true, blank: true
        ginecologicoF nullable: true, blank: true
        ginecologicoDescricao nullable: true, blank: true
        historiaDoencaAtual nullable: true, blank: true
        hdahipertencaoArterial nullable: true, blank: true
        hdaDiabetes nullable: true, blank: true
        hdaHipotireoidismo nullable: true, blank: true
        hdaHipertireoidismo nullable: true, blank: true
        hdaSindromePanico nullable: true, blank: true
        hdaDepressao nullable: true, blank: true
        hdaColagenoses nullable: true, blank: true
        hdaOutrasDoencas nullable: true, blank: true
        usoMedicamentos nullable: true, blank: true
        umReposicaoHormonal nullable: true, blank: true
        umAntiDepressivos nullable: true, blank: true
        umIsotretinoinaOral nullable: true, blank: true
        umPsicotropicos nullable: true, blank: true
        umAAS nullable: true, blank: true
        umOutros nullable: true, blank: true
        hpTabagismo nullable: false, blank: false
        hpEtilismo nullable: false, blank: false
        afQual nullable: true, blank: true
        afFrequencia nullable: true, blank: true
        efPeso nullable: true, blank: true
        efAltura nullable: true, blank: true
        efIMC nullable: true, blank: true
        efPA nullable: true, blank: true
        efFC nullable: true, blank: true
        efMMHG nullable: true, blank: true
        efSPO2 nullable: true, blank: true
        efDescricao nullable: true, blank: true
        hd nullable: true, blank: true
        tratamentoProposto nullable: true, blank: true
    }
}
