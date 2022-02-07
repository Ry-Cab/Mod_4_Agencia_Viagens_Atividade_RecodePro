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
 <h1>Atualizar</h1>
 <form action="Destino.Update" method="get">

  	<div class="form-group">
 	<label>Digite o Id do Destino: </label>
	<input class="form-control" type="text" name="txtIdDes"/>
 	</div>
 	<div class="form-group">
 	<label>Cidade de destino:</label>
	<input class="form-control" type="text" name="txtCidadeDes"/>
 	</div>
 	<div class="form-group">
	<label>Estado de destino:</label>
 	<input class="form-control" type="text" name="txtEstadoDes"/>
 	</div>
 	<div class="form-group">
  	<label>Pre�o do destino:</label>
 	<input class="form-control" type="text" name="txtPrecoDes"/>
 	</div>
 	<input class="btn btn-primary" type="submit" value="Atualizar"/>
 	<input class="btn btn-primary" type="reset" value="Apagar Campos"/>
 </form>
 </main>
</body>
</html>