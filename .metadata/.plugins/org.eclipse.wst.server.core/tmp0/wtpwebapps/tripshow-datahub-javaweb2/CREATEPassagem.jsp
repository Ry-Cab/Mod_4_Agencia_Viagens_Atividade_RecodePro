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
	<form name="form1" action="Passagem.Create" method="get">
 	<div class="form-group">
 	<label>Data da compra:</label>
	<input class="form-control" type="text" name="txtDataPas"/>
 	</div>
 	<div class="form-group">
	<label>ID do Cliente:</label>
 	<input class="form-control" type="text" name="txtIdCliPas"/>
 	</div>
 	<div class="form-group">
  	<label>ID do Destino:</label>
 	<input class="form-control" type="text" name="txtIdDesPas"/>
 	</div>
 	
 	<input class="btn btn-primary" type="submit" value="Registrar"/>
 	<input class="btn btn-primary" type="reset" value="Apagar Campos"/>
 </form>
 </main>
</body>
</html>