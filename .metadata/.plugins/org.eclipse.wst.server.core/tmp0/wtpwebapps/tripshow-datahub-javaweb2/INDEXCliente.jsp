<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TS - Data Hub</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Clientes</h1>
   </div>
</div>
<main class="container">
<nav>
<a class="btn btn-success" href="CREATECliente.jsp">Cadastrar</a>
<a class="btn btn-primary" href="UPDATECliente.jsp">Atualizar</a>
<a class="btn btn-primary" href="READCliente.jsp">Consultar</a>
<a class="btn btn-danger" href="DELETECliente.jsp">Excluir</a>
</nav>
</main>

</body>
</html>