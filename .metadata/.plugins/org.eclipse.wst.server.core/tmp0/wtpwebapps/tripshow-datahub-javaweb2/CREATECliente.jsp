<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TS - Data Hub</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<main class="container">
	<h1>Cadastrar</h1>
	<form name="form1" action="Cliente.Create" method="get">
 	<div class="form-group">
 	<label>Nome do Cliente: </label>
	<input class="form-control" type="text" name="txtNomeCli"/>
 	</div>
 	<div class="form-group">
	<label>E-mail do Cliente: </label>
 	<input class="form-control" type="text" name="txtEmailCli"/>
 	</div>
 	<div class="form-group">
  	<label>Data nascimento do Cliente: </label>
 	<input class="form-control" type="text" name="txtDataNascCli"/>
 	</div>
 	<div class="form-group">
  	<label>Estado de origem do Cliente: </label>
 	<input class="form-control" type="text" name="txtEstadoCli"/>
 	</div>
 	<div class="form-group">
  	<label>Cidade de origem do Cliente: </label>
 	<input class="form-control" type="text" name="txtCidadeCli"/>
 	</div>
 	<div class="form-group">
  	<label>Data de Ida: </label>
 	<input class="form-control" type="text" name="txtDataIdaCli"/>
 	</div>
 	<div class="form-group">
  	<label>Data de volta: </label>
 	<input class="form-control" type="text" name="txtDataVoltaCli"/>
 	</div>
 	<input class="btn btn-primary" type="submit" value="Registrar"/>
 	<input class="btn btn-primary" type="reset" value="Apagar Campos"/>
 </form>
 </main>
</body>
</html>