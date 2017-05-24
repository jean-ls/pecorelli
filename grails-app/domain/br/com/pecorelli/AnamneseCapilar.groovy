package br.com.pecorelli

class AnamneseCapilar {
    Paciente paciente
    Date dataCadastro, dataAtualizacao
    //Paciente
    String queixaPaciente, areaAcometida, acometeOutrasAreas, quantoTempo, nivelDoenca,
    mudancaCaracteristica, mudancaCorCabelo, finoCrespo, dificilPentear, oleosoCrespo,
    alteracaoCouroCabeludo, outrasCrises, tipoQueda, qtdFiosCaemDiariamente, cabelosPerdidosRepostos,
    momentoQuedaCabelo, amigosPercebeQueda, alteracaoPeleEtc, manipulacaoCabelos, puxaCabelos,
    ultimasDoencas, doencaAtual, criseEmocional, profissao, problemas, drogas, anticoncepcional,
    alergia, filhos, gravidez, alteracaoMenstrual, problemaEndocrinologico, pelosCorpo, frioCalor,
    alimentacao, contatoPessoasAnimaisQuedaCabelo, radiacao, cremesCabelo, frequenciaUso, quimica,
    gel, tintura, clareadores, estiloCabelo, perucas

    //Medico
    String hf, historicoDrogas, exameFisicoCabCouro, exameFisicoGeral, estudoTricologico,
    examesComplementares, condulta
    static constraints = {
        paciente nullable: false
        dataCadastro nullable: false
        dataAtualizacao nullable: false
        queixaPaciente nullable: true, blank: true
        areaAcometida nullable: true, blank: true
        acometeOutrasAreas nullable: true, blank: true
        quantoTempo nullable: true, blank: true
        nivelDoenca nullable: true, blank: true
        mudancaCaracteristica nullable: true, blank: true
        mudancaCorCabelo nullable: true, blank: true
        finoCrespo nullable: true, blank: true
        dificilPentear nullable: true, blank: true
        oleosoCrespo nullable: true, blank: true
        alteracaoCouroCabeludo nullable: true, blank: true
        outrasCrises nullable: true, blank: true
        tipoQueda nullable: true, blank: true
        qtdFiosCaemDiariamente nullable: true, blank: true
        cabelosPerdidosRepostos nullable: true, blank: true
        momentoQuedaCabelo nullable: true, blank: true
        amigosPercebeQueda nullable: true, blank: true
        alteracaoPeleEtc nullable: true, blank: true
        manipulacaoCabelos nullable: true, blank: true
        puxaCabelos nullable: true, blank: true
        ultimasDoencas nullable: true, blank: true
        doencaAtual nullable: true, blank: true
        criseEmocional nullable: true, blank: true
        profissao nullable: true, blank: true
        problemas nullable: true, blank: true
        drogas nullable: true, blank: true
        anticoncepcional nullable: true, blank: true
        alergia nullable: true, blank: true
        filhos nullable: true, blank: true
        gravidez nullable: true, blank: true
        alteracaoMenstrual nullable: true, blank: true
        problemaEndocrinologico nullable: true, blank: true
        pelosCorpo nullable: true, blank: true
        frioCalor nullable: true, blank: true
        alimentacao nullable: true, blank: true
        contatoPessoasAnimaisQuedaCabelo nullable: true, blank: true
        radiacao nullable: true, blank: true
        cremesCabelo nullable: true, blank: true
        frequenciaUso nullable: true, blank: true
        quimica nullable: true, blank: true
        gel nullable: true, blank: true
        tintura nullable: true, blank: true
        clareadores nullable: true, blank: true
        estiloCabelo nullable: true, blank: true
        perucas nullable: true, blank: true
        hf nullable: true, blank: true
        historicoDrogas nullable: true, blank: true
        exameFisicoCabCouro nullable: true, blank: true
        exameFisicoGeral nullable: true, blank: true
        estudoTricologico nullable: true, blank: true
        examesComplementares nullable: true, blank: true
        condulta nullable: true, blank: true
    }
}
