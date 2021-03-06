package com.tripshow.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tripshow.models.Cliente;

public class DAOCliente {
	//TripShow_RyanCabral_BD
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
	
	public DAOCliente() throws Exception{
		conexao = ConexaoBD.getConexao();
	}
	
	public void incluirCliente(Cliente cliente) throws Exception{
		final String instrucao_sql = "INSERT INTO Cliente (nome_cliente,email_cliente,data_nascimento,estado_cliente,cidade_cliente,data_ida,data_volta) VALUES(?,?,?,?,?,?,?)";
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, cliente.getNome_cliente());
		preparedStatement.setString(2, cliente.getEmail_cliente());
		preparedStatement.setString(3, cliente.getData_nascimento());
		preparedStatement.setString(4, cliente.getEstado_cliente());
		preparedStatement.setString(5, cliente.getCidade_cliente());
		preparedStatement.setString(6, cliente.getData_ida());
		preparedStatement.setString(7, cliente.getData_volta());
		
		preparedStatement.executeUpdate();
	}
	
	public void alterarCliente(Cliente cliente) throws Exception{
		final String instrucao_sql = "UPDATE Cliente SET nome_cliente = ?, email_cliente = ?, data_nascimento = ?, estado_cliente = ?, cidade_cliente = ?, data_ida = ?, data_volta = ? WHERE id_cliente = ?";
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, cliente.getNome_cliente());
		preparedStatement.setString(2, cliente.getEmail_cliente());
		preparedStatement.setString(3, cliente.getData_nascimento());
		preparedStatement.setString(4, cliente.getEstado_cliente());
		preparedStatement.setString(5, cliente.getCidade_cliente());
		preparedStatement.setString(6, cliente.getData_ida());
		preparedStatement.setString(7, cliente.getData_volta());
		preparedStatement.setInt(8, cliente.getId_cliente());
		
		preparedStatement.executeUpdate();
	}	
	
	public Cliente consultarCliente(Cliente cliente) throws Exception{
		final String intrucao_sql = "SELECT * FROM Cliente WHERE id_cliente = ?";
		
		preparedStatement = conexao.prepareStatement(intrucao_sql);
		preparedStatement.setInt(1, cliente.getId_cliente());
		
		ResultSet resultSet =  preparedStatement.executeQuery();
		
		while(resultSet.next()) {
		
			
			cliente.setId_cliente(resultSet.getInt("id_cliente"));
			 cliente.setNome_cliente(resultSet.getString("nome_cliente"));
			 cliente.setEmail_cliente(resultSet.getString("email_cliente"));
			 cliente.setData_nascimento(resultSet.getString("data_nascimento"));
			 cliente.setEstado_cliente(resultSet.getString("estado_cliente"));
			 cliente.setCidade_cliente(resultSet.getString("cidade_cliente"));
			 cliente.setData_ida(resultSet.getString("data_ida"));
			 cliente.setData_volta(resultSet.getString("data_volta"));
			
			
		}
		
		return cliente;
	}
	
	public void excluirCliente(Cliente cliente) throws Exception{
		final String instrucao_sql = "DELETE FROM Cliente WHERE id_cliente = ?";
		
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		
		preparedStatement.setInt(1, cliente.getId_cliente());
		
		preparedStatement.executeUpdate();
	}
	 
	
	

}
