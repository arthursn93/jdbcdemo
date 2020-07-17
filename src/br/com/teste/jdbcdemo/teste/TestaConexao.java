package br.com.teste.jdbcdemo.teste;

import java.sql.*;
import java.util.Calendar;

import br.com.teste.jdbcdemo.ConnectionFactory;
import br.com.teste.jdbcdemo.modelo.Contato;
import br.com.teste.jdbcdemo.modelo.ContatoDao;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
//		Connection con = new ConnectionFactory().getConnection();
//		System.out.println("Conexão aberta!");
//		con.close();
		
		Contato contato = new Contato();
		contato.setNome("Arthur");
		contato.setEmail("arthurnunes@brq.com");
		contato.setEndereco("R. Panati, 231 - Bairro Olímpico");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}

}
