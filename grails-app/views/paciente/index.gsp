<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title></title>
    <link href="${request.contextPath}/assets/global/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
    <link href="${request.contextPath}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />
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
                <span class="active">Lista</span>
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
                <table class="table table-striped table-bordered table-hover table-checkable order-column" id="sample_1">
                    <thead>
                    <tr>
                        <th> #ID </th>
                        <th> Nome </th>
                        <th> Telefones </th>
                        <th> Celular </th>
                        <th> Ações </th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${pacientes}" var="paciente">
                        <tr class="odd gradeX">
                            <td> ${paciente?.id} </td>
                            <td>
                                ${paciente?.nome}
                            </td>
                            <td>
                                ${paciente?.telefone} | ${paciente?.celular}
                            </td>
                            <td class="center"> 12 Jan 2012 </td>
                            <td>
                                <div class="btn-group">
                                    <button class="btn btn-xs green dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-left" role="menu">
                                        <li>
                                            <a href="javascript:;">
                                                <i class="glyphicon glyphicon-edit"></i> Editar </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <i class="glyphicon glyphicon-remove"></i> Remover </a>
                                        </li>
                                    </ul>
                                </div>
                            </td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<g:render template="/commom/datatables"/>
</body>
</html>