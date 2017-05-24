package br.com.pecorelli

class AnamneseFacial {
    //Analise da pele
    boolean comedao, milium, papula, pustula, microcisto, nodulo, queratose, nervo, telangiectasia,
    papiloma, dermatose, acrocordon

    //Biotipo cutaneo
    boolean peleNormal, peleMista, peleOleosa, peleSeca

    //Desequilibrios
    boolean peleDesidratada, peleSensivel, peleReativa, peleAcne, acneInflamatoria, acneNaoInflamatoria,
    peleManchas, manchasDifusas, melasma
    //Procedimentos Médicos recentes
    boolean peelingComAcido, preenchimento, cirurgiaPlastica, aplicacaoLaser
    String pmrOutros

    //Pesença de rugas
    boolean prRugasExpressao, prRugasEstaticas, prRugasGravitacionais, prRugasCompostas, rugaSuave,
    rugaModerada, rugaAvancada, rugaSevera

    //Fototipo
    boolean ftUm, ftDois, ftTres, ftQuatro, ftCinco, ftSeis

    //Antecedentes Pessoais
    boolean apSensibilidadeAlergica, apHipertensao, apDiabetes, apUsoMedicamentos, apTratMedAnteriores
    String apInfoAdicionais

    //Cosmeticos de uso habitual
    boolean chLeiteLocaoLimpeza, chSabonetePeelings, chHidratanteFPS, chNutritivo, chProdOlhos, chMaskBeleza

    //Motivo  da procura por tratamento
    boolean ptLimpezaPele, ptTratamentoAcne, ptHidratacao, ptRejuvecimento, ptClareamentoManchas,
    ptPrePosCirurgiaPlastica
    String ptOutros

    //Tratamento Indicado
    String tratamentoEsteticoIndicado

    String higienizacao, hidratacao, especifico, nutricao

    //Cuidado
    boolean cuAreaOlhos, cuPeelingEnzimatico, cuPeelingFacial, cuMascaraFacial, cuCremeHidratante
    String cuOutros
    static constraints = {
        comedao nullable: false
        milium nullable: false
        papula nullable: false
        pustula nullable: false
        microcisto nullable: false
        nodulo nullable: false
        queratose nullable: false
        nervo nullable: false
        telangiectasia nullable: false
        papiloma nullable: false
        dermatose nullable: false
        acrocordon nullable: false

        peleNormal nullable: false
        peleMista nullable: false
        peleOleosa nullable: false
        peleSeca nullable: false

        peleDesidratada nullable: false
        peleSensivel nullable: false
        peleReativa nullable: false
        peleAcne nullable: false
        acneInflamatoria nullable: false
        acneNaoInflamatoria nullable: false
        peleManchas nullable: false
        manchasDifusas nullable: false
        melasma nullable: false

        peelingComAcido nullable: false
        preenchimento nullable: false
        cirurgiaPlastica nullable: false
        aplicacaoLaser nullable: false
        pmrOutros nullable: true, blank: true

        prRugasExpressao nullable: false
        prRugasEstaticas nullable: false
        prRugasGravitacionais nullable: false
        prRugasCompostas nullable: false
        rugaSuave nullable: false
        rugaModerada nullable: false
        rugaAvancada nullable: false
        rugaSevera nullable: false

        ftUm nullable: false
        ftDois nullable: false
        ftTres nullable: false
        ftQuatro nullable: false
        ftCinco nullable: false
        ftSeis nullable: false

        apSensibilidadeAlergica nullable: false
        apHipertensao nullable: false
        apDiabetes nullable: false
        apUsoMedicamentos nullable: false
        apTratMedAnteriores nullable: false
        apInfoAdicionais nullable: true, blank: true

        chLeiteLocaoLimpeza nullable: false
        chSabonetePeelings nullable: false
        chHidratanteFPS nullable: false
        chNutritivo nullable: false
        chProdOlhos nullable: false
        chMaskBeleza nullable: false

        ptLimpezaPele nullable: false
        ptTratamentoAcne nullable: false
        ptHidratacao nullable: false
        ptRejuvecimento nullable: false
        ptClareamentoManchas nullable: false
        ptPrePosCirurgiaPlastica nullable: false
        ptOutros nullable: true, blank: true

        tratamentoEsteticoIndicado nullable: true, blank: true

        higienizacao nullable: true, blank: true
        hidratacao nullable: true, blank: true
        especifico nullable: true, blank: true
        nutricao nullable: true, blank: true

        cuAreaOlhos nullable: false
        cuPeelingEnzimatico nullable: false
        cuPeelingFacial nullable: false
        cuMascaraFacial nullable: false
        cuCremeHidratante nullable: false
        cuOutros nullable: true, blank: true
    }
}
