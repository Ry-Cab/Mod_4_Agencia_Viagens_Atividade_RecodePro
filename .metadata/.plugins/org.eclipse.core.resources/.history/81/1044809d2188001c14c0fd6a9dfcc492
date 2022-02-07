<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.tripshow.models.Passagem" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<% Passagem passagem = (Passagem) request.getAttribute("passagem"); %>


<main class="container">
<h1>Dados da Passagem</h1>
	<table class="table">
	<tr>
		<th>ID:</th>
		<td><%= passagem.getId_passagem() %></td>
	</tr>
	<tr>
		<th>Data da compra:</th>
		<td><%= passagem.getData_compra() %></td>
	</tr>
	<tr>
		<th>ID do cliente:</th>
		<td><%= passagem.getFK_id_cliente() %></td>
	</tr>
	<tr>
		<th>ID do destino:</th>
		<td><%= passagem.getFK_id_destino() %></td>
	</tr>
	
	
</table>

</main>
</body>
</html>