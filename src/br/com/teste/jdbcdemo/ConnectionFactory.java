package br.com.teste.jdbcdemo;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/jdbcdemo?useTimezone=true&serverTimezone=America/Sao_Paulo","arthur","some_pass");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
/* 
 *"jdbc:mysql://localhost/jdbcdemo?useTimezone=true&serverTimezone=UTC","arthur","some_pass");
 * 
 */
