<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.tripshow.models.Destino" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TS - Data Hub</title>
</head>
<body>
<%@include file="header.jsp" %>
<% Destino destino = (Destino) request.getAttribute("destino"); %>


<main class="container">
<h1>Dados do Destino</h1>
	<table class="table">
	<tr>
		<th>ID:</th>
		<td><%= destino.getId_destino() %></td>
	</tr>
	<tr>
		<th>Cidade:</th>
		<td><%= destino.getCidade_destino() %></td>
	</tr>
	<tr>
		<th>Estado:</th>
		<td><%= destino.getEstado_destino() %></td>
	</tr>
	
</table>

</main>
</body>
</html>