package com.tripshow.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tripshow.models.Destino;
import com.tripshow.models.Passagem;

public class DAOPassagem {
	//TripShow_RyanCabral_BD
		private Connection conexao = null;
		private PreparedStatement preparedStatement = null;
		
		public DAOPassagem() throws Exception{
			conexao = ConexaoBD.getConexao();
		}
		
		public void incluirPassagem(Passagem passagem) throws Exception{
			final String instrucao_sql = "INSERT INTO Passagem(data_compra, FK_id_cliente, FK_id_destino) VALUES(?, ?, ?);";
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, passagem.getData_compra());
			preparedStatement.setInt(2, passagem.getFK_id_cliente());
			preparedStatement.setInt(3, passagem.getFK_id_destino());
			
			
			preparedStatement.executeUpdate();
		}
		
		public void alterarPassagem(Passagem passagem) throws Exception{
			final String instrucao_sql = "UPDATE Passagem SET data_compra = ?, FK_id_cliente = ?, FK_id_destino = ? WHERE id_passagem = ?;";
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, passagem.getData_compra());
			preparedStatement.setInt(2, passagem.getFK_id_cliente());
			preparedStatement.setInt(3, passagem.getFK_id_destino());
			preparedStatement.setInt(4, passagem.getId_passagem());
			
			preparedStatement.executeUpdate();
		}	
		
		public Passagem consultarPassagem(Passagem passagem) throws Exception{
			final String intrucao_sql = "SELECT * FROM Passagem WHERE id_passagem = ?";
			
			preparedStatement = conexao.prepareStatement(intrucao_sql);
			preparedStatement.setInt(1, passagem.getId_passagem());
			
			ResultSet resultSet =  preparedStatement.executeQuery();
			
			while(resultSet.next()) {
			
				passagem.setId_passagem(resultSet.getInt("id_passagem"));
				passagem.setData_compra((resultSet.getString("data_compra")));
				passagem.setFK_id_cliente((resultSet.getInt("FK_id_cliente")));;
				passagem.setFK_id_destino((resultSet.getInt("FK_id_destino")));;
				
				
				
				
			}
			
			return passagem;
		}
		
		public void excluirPassagem(Passagem passagem) throws Exception{
			final String instrucao_sql = "DELETE FROM Passagem WHERE id_passagem = ?";
			
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			
			preparedStatement.setInt(1, passagem.getId_passagem());
			
			preparedStatement.executeUpdate();
		}
}
