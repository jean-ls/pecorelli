<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title></title>
    <style>
        sup{
            margin-left: 4px;
            top: 2px;
            display: inline;
            padding: 0;
            color: crimson;
            font-size: 14px;
        }
    </style>
</head>

<body>
<div class="page-content-wrapper">
    <div class="page-content">
        <ul class="page-breadcrumb breadcrumb">
            <li>
                <a href="${createLink(uri: "/")}">Home</a>
                <i class="fa fa-circle"></i>
            </li>
            <li>
                <a href="${createLink(action: 'index')}">Pacientes</a>
                <i class="fa fa-circle"></i>
            </li>
            <li>
                <span class="active">Create</span>
            </li>
        </ul>
        <div class="portlet light bordered">
            <div class="portlet-title">
                <div class="caption font-dark">
                    <i class="icon-user font-dark"></i>
                    <span class="caption-subject bold uppercase"> Pacientes</span>
                </div>
            </div>
            <div class="portlet-body">
                <div class="table-toolbar">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="btn-group">
                                <a href="${createLink(action: 'create')}"><button id="sample_editable_1_new" class="btn sbold green"> Adicionar novo
                                    <i class="fa fa-plus"></i>
                                </button></a>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="btn-group pull-right">
                                <button class="btn green  btn-outline dropdown-toggle" data-toggle="dropdown">Ferramentas
                                    <i class="fa fa-angle-down"></i>
                                </button>
                                <ul class="dropdown-menu pull-right">
                                    <li>
                                        <a href="javascript:;">
                                            <i class="fa fa-print"></i> Imprimir </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                <g:form useToken="true" resource="${paciente}" method="post">
                    <div class="form-body">
                        <g:render template="form" model="[paciente: paciente]"/>
                    </div>
                    <g:render template="/commom/btnsalvarcancelar"/>
                </g:form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>