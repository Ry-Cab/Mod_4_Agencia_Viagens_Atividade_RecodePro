<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<main class="container">

 <h1>Consultar</h1>
 
 <form action="Passagem.Read" method="get">
 <div class="form-group">
 	<label>Digite o Id do Cliente: </label>
	<input class="form-control" type="text" name="txtIdPas"/>
 </div>
 	
 	<input class="btn btn-primary" type="submit" value="Atualizar"/>
 	<input class="btn btn-primary" type="reset" value="Apagar Campos"/>
 </form>
 </main>

</body>
</html>