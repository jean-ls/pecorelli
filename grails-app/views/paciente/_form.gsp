<div class="col-sm-12">
    <div class="form-group">
        <div class="form-line">
            <input required type="text" name="nome" value="${paciente?.nome}" class="form-control">
            <label class="form-label">Nome Completo<sup>*</sup></label>
        </div>
    </div>
</div>
<div class="col-sm-6">
    <div class="form-group">
        <div class="form-line">
            <input type="text" name="endereco" required value="${paciente?.endereco}" class="form-control"/>
            <label class="form-label">Endereço<sup>*</sup></label>
        </div>
    </div>
</div>
<div class="col-sm-2">
    <div class="form-group">
        <div class="form-line">
            <input type="text" name="numero" required value="${paciente?.numero}" class="form-control"/>
            <label class="form-label">Número<sup>*</sup></label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.bairro}" required name="bairro" class="form-control"/>
            <label class="form-label">Bairro<sup>*</sup></label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.cidade}" name="cidade" required class="form-control"/>
            <label class="form-label">Cidade<sup>*</sup></label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.cep}" name="cep" class="form-control"/>
            <label class="form-label">CEP</label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" required value="${paciente?.email}" name="email" class="form-control"/>
            <label class="form-label">Email<sup>*</sup></label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" required value="${paciente?.dataNascimento}" name="dataNascimento" class="form-control"/>
            <label class="form-label">Data Nascimento<sup>*</sup></label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.telefone}" name="telefone" class="form-control"/>
            <label class="form-label">Telefone</label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.celular}" name="celular" class="form-control"/>
            <label class="form-label">Celular</label>
        </div>
    </div>
</div>

<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.ocupacao}" name="ocupacao" class="form-control"/>
            <label class="form-label">Ocupação</label>
        </div>
    </div>
</div>

<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" required value="${paciente?.cpf}" name="cpf" class="form-control"/>
            <label class="form-label">CPF</label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.nascionalidade}" name="nascionalidade" class="form-control"/>
            <label class="form-label">Nacionalidade</label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <div class="form-line">
            <input type="text" value="${paciente?.cor}" name="cor" class="form-control"/>
            <label class="form-label">Cor</label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <label>Estado Civil</label>
        <div class="mt-radio-inline">
            <label class="mt-radio">
                <input type="radio" name="estadoCivil" id="solteiro" value="Solteiro" checked> Solteiro
                <span></span>
            </label>
            <label class="mt-radio">
                <input type="radio" name="estadoCivil" id="casado" value="Casado"> Casado
                <span></span>
            </label>
            <label class="mt-radio">
                <input type="radio" name="estadoCivil" id="divorciado" value="Divorciado"> Divorciado
                <span></span>
            </label>
            <label class="mt-radio">
                <input type="radio" name="estadoCivil" id="viuvo" value="Viúvo"> Viúvo
                <span></span>
            </label>
        </div>
    </div>
</div>
<div class="col-sm-4">
    <div class="form-group">
        <label>Sexo</label>
        <div class="mt-radio-inline">
            <label class="mt-radio">
                <input type="radio" name="sexo" id="masculino" value="Masculino" checked> Masculino
                <span></span>
            </label>
            <label class="mt-radio">
                <input type="radio" name="sexo" id="feminino" value="Feminino"> Feminino
                <span></span>
            </label>
        </div>
    </div>
</div>