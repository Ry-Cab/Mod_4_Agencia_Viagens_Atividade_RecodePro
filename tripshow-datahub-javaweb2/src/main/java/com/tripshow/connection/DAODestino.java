package com.tripshow.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tripshow.models.Cliente;
import com.tripshow.models.Destino;

public class DAODestino {
	//TripShow_RyanCabral_BD
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
	
	public DAODestino() throws Exception{
		conexao = ConexaoBD.getConexao();
	}
	
	public void incluirDestino(Destino destino) throws Exception{
		final String instrucao_sql = "insert into Destino(cidade_destino, estado_destino, preco_destino) values (?,?,?)";
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, destino.getCidade_destino());
		preparedStatement.setString(2, destino.getEstado_destino());
		preparedStatement.setDouble(3, destino.getPreco_destino());
		
		
		preparedStatement.executeUpdate();
	}
	
	public void alterarDestino(Destino destino) throws Exception{
		final String instrucao_sql = "UPDATE Destino SET cidade_destino = ?, estado_destino = ?, preco_destino = ? WHERE id_destino = ?";
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, destino.getCidade_destino());
		preparedStatement.setString(2, destino.getEstado_destino());
		preparedStatement.setDouble(3, destino.getPreco_destino());
		preparedStatement.setInt(4, destino.getId_destino());
		
		preparedStatement.executeUpdate();
	}	
	
	public Destino consultarDestino(Destino destino) throws Exception{
		final String intrucao_sql = "SELECT * FROM Destino WHERE id_destino = ?";
		
		preparedStatement = conexao.prepareStatement(intrucao_sql);
		preparedStatement.setInt(1, destino.getId_destino());
		
		ResultSet resultSet =  preparedStatement.executeQuery();
		
		while(resultSet.next()) {
		
			destino.setId_destino(resultSet.getInt("id_destino"));
			destino.setCidade_destino(resultSet.getString("cidade_destino"));
			destino.setEstado_destino(resultSet.getString("estado_destino"));
			
			
			
		}
		
		return destino;
	}
	
	public void excluirDestino(Destino destino) throws Exception{
		final String instrucao_sql = "DELETE FROM Destino WHERE id_destino = ?";
		
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		
		preparedStatement.setInt(1, destino.getId_destino());
		
		preparedStatement.executeUpdate();
	}
	 
	
	

}