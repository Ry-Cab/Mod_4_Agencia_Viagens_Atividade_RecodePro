<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.tripshow.models.Cliente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TS - Data Hub</title>
</head>
<body>
<%@include file="header.jsp" %>
<% Cliente cliente = (Cliente) request.getAttribute("cliente"); %>


<main class="container">
<h1>Dados do cliente</h1>
	<table class="table">
	<tr>
		<th>ID:</th>
		<td><%= cliente.getId_cliente() %></td>
	</tr>
	<tr>
		<th>Nome:</th>
		<td><%= cliente.getNome_cliente() %></td>
	</tr>
	<tr>
		<th>Email:</th>
		<td><%= cliente.getEmail_cliente() %></td>
	</tr>
	<tr>
		<th>Data de nascimento</th>
		<td><%= cliente.getData_nascimento() %></td>
	</tr>
	<tr>
		<th>Estado:</th>
		<td><%= cliente.getEstado_cliente() %></td>
	</tr>
	<tr>
		<th>ID:</th>
		<td><%= cliente.getCidade_cliente() %></td>
	</tr>
	<tr>
		<th>ID:</th>
		<td><%= cliente.getData_ida() %></td>
	</tr>
	<tr>
		<th>ID:</th>
		<td><%= cliente.getData_volta() %></td>
	</tr>
	
</table>

</main>
</body>
</html>