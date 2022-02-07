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
	<form name="form1" action="Destino.Create" method="get">
 	<div class="form-group">
 	<label>Cidade de destino:</label>
	<input class="form-control" type="text" name="txtCidadeDes"/>
 	</div>
 	<div class="form-group">
	<label>Estado de destino:</label>
 	<input class="form-control" type="text" name="txtEstadoDes"/>
 	</div>
 	<div class="form-group">
  	<label>Preço do destino:</label>
 	<input class="form-control" type="text" name="txtPrecoDes"/>
 	</div>
 	
 	<input class="btn btn-primary" type="submit" value="Registrar"/>
 	<input class="btn btn-primary" type="reset" value="Apagar Campos"/>
 </form>
 </main>
</body>
</html>