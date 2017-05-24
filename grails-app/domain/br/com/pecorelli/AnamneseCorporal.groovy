package br.com.pecorelli

class AnamneseCorporal {
    Paciente paciente
    Date dataCadastro, dataAtualizacao
    //Hábitos Diários (hd)
    Boolean hdTratamentoEsteticoAnterior, hdUtilizacaoCosmetico, hdExposicaoSol, hdTabagismoQual, hdBebidaAlcoolica, hdQualidadeSonoQual,
    hdAtividadeFisica, hdAnticoncepcional, hdGestante, hdGestacoes
    String hdTratamentoEsteticoAnteriorQual, hdUtilizacaoCosmeticoQual, hdTabagismo, hdBebidaAlcoolicaQual, hdFuncionamentoIntestinal,
    hdQualidadeSono, hdIngestaoAgua, hdAlimentacao, hdPreferenciaAlimentar, hdObs, hdAlimentoPreferencia, hdAtividadeFisicaTipo,
    hdAtividadeFisicaFreq, hdAnticoncepcionalQual, hdDataPrimeirodiaMenstrucacao, hdGestacoesQtd, hdGestacoesTempo, hdAnotacoes


    //Histórico Clínico (hc)
    boolean hcTratamentoMedicoAtual, hcAntecedenteAlergico, hcMarcaPasso, hcAlteracaoCardiaca, hcDisfuncaoArterial,
            hcDisturbioCirculatorio, hcDisturbioRenal, hcDisturbioHormonal, hcDisturbioGastroIntestinal, hcEpilepsia, hcEstresse,
            hcAnemia, hcDiabetes, hcAlgumTipoDoenca
    String hcMedicamentoUso, hcAntecedenteAlergicoQual, hcAlteracaoCardiacaQual, hcDisturbioCirculatorioQual, hcDisturbioRenalQual,
            hcDisturbioHormonalQual, hcDisturbioGastroIntestinalQual, hcEpilepsiaQual, hcEstresseQual, hcAnemiaQual, hcDiabetesQual,
            hcAlgumTipoDoencaQual

    //Tratamento da medicina estética e cirurgica (tm)
    boolean tmTratamentoDermEstetic, tmCirurgiaPlasticaEstetica, tmCirurgiaReparadora
    String tmTratamentoDermEsteticQual, tmCirurgiaPlasticaEsteticaQual, tmCirurgiaReparadoraQual

    //Avaliação Corporal (ac)
    String acHldgTipo, acHldgGrau, acHldgLocalizacao, acGordura, acDistribuicaoGordura, acLocalizacao, acPeso, acAltura, acEstriasCor,
    acEstriasLargura, acEstriasTipo, acEstriasQtd, asEstriasRegiao
    boolean acPresencaDorPalpacao

    String tratamentoProposto

    static constraints = {
        paciente nullable: false
        dataCadastro nullable: false
        dataAtualizacao nullable: false
        hdTratamentoEsteticoAnterior nullable: false
        hdUtilizacaoCosmetico nullable: false
        hdExposicaoSol nullable: false
        hdTabagismoQual nullable: false
        hdBebidaAlcoolica nullable: false
        hdQualidadeSonoQual nullable: false
        hdAtividadeFisica nullable: false
        hdAnticoncepcional nullable: false
        hdGestante nullable: false
        hdGestacoes nullable: false
        hdTratamentoEsteticoAnteriorQual nullable: true, blank: true
        hdUtilizacaoCosmeticoQual nullable: true, blank: true
        hdTabagismo nullable: true, blank: true
        hdBebidaAlcoolicaQual nullable: true, blank: true
        hdFuncionamentoIntestinal nullable: true, blank: true
        hdQualidadeSono nullable: true, blank: true
        hdIngestaoAgua nullable: true, blank: true
        hdAlimentacao nullable: true, blank: true
        hdPreferenciaAlimentar nullable: true, blank: true
        hdObs nullable: true, blank: true
        hdAlimentoPreferencia nullable: true, blank: true
        hdAtividadeFisicaTipo nullable: true, blank: true
        hdAtividadeFisicaFreq nullable: true, blank: true
        hdAnticoncepcionalQual nullable: true, blank: true
        hdDataPrimeirodiaMenstrucacao nullable: true, blank: true
        hdGestacoesQtd nullable: true, blank: true
        hdGestacoesTempo nullable: true, blank: true
        hdAnotacoes nullable: true, blank: true

        hcTratamentoMedicoAtual nullable: false
        hcAntecedenteAlergico nullable: false
        hcMarcaPasso nullable: false
        hcAlteracaoCardiaca nullable: false
        hcDisfuncaoArterial nullable: false
        hcDisturbioCirculatorio nullable: false
        hcDisturbioRenal nullable: false
        hcDisturbioHormonal nullable: false
        hcDisturbioGastroIntestinal nullable: false
        hcEpilepsia nullable: false
        hcEstresse nullable: false
        hcAnemia nullable: false
        hcDiabetes nullable: false
        hcAlgumTipoDoenca nullable: false
        hcMedicamentoUso nullable: true, blank: true
        hcAntecedenteAlergicoQual nullable: true, blank: true
        hcAlteracaoCardiacaQual nullable: true, blank: true
        hcDisturbioCirculatorioQual nullable: true, blank: true
        hcDisturbioRenalQual nullable: true, blank: true
        hcDisturbioHormonalQual nullable: true, blank: true
        hcDisturbioGastroIntestinalQual nullable: true, blank: true
        hcEpilepsiaQual nullable: true, blank: true
        hcEstresseQual nullable: true, blank: true
        hcAnemiaQual nullable: true, blank: true
        hcDiabetesQual nullable: true, blank: true
        hcAlgumTipoDoencaQual nullable: true, blank: true

        tmTratamentoDermEstetic nullable: false
        tmCirurgiaPlasticaEstetica nullable: false
        tmCirurgiaReparadora nullable: false
        tmTratamentoDermEsteticQual nullable: true, blank: true
        tmCirurgiaPlasticaEsteticaQual nullable: true, blank: true
        tmCirurgiaReparadoraQual nullable: true, blank: true

        acHldgTipo nullable: true, blank: true
        acHldgGrau nullable: true, blank: true
        acHldgLocalizacao nullable: true, blank: true
        acGordura nullable: true, blank: true
        acDistribuicaoGordura nullable: true, blank: true
        acLocalizacao nullable: true, blank: true
        acPeso nullable: true, blank: true
        acAltura nullable: true, blank: true
        acEstriasCor nullable: true, blank: true
        acEstriasLargura nullable: true, blank: true
        acEstriasTipo nullable: true, blank: true
        acEstriasQtd nullable: true, blank: true
        asEstriasRegiao nullable: true, blank: true
        acPresencaDorPalpacao nullable: false

        tratamentoProposto nullable: true, blank: true
    }
}
