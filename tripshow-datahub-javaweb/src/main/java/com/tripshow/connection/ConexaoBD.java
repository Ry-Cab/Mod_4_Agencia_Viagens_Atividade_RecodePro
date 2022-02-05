package com.tripshow.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
	
	private static final String url = "jdbc:sqlserver://localhost;databaseName=TripShow_RyanCabral_BD;integratedSecurity=true";
	private static final String driverBD = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static Connection conexao = null;
	
	private ConexaoBD(){
		
	}
	
	private static void inicializarBD() throws Exception{
		Class.forName(driverBD);	
		conexao = DriverManager.getConnection(url);
	}
	
	public static Connection getConexao() throws Exception {
		if(conexao==null) {
			inicializarBD();
		}
		
		return conexao;
		
	}
	
}
