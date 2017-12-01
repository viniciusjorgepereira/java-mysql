package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import principal.ConnectionFactory;
import principal.Contato;
import principal.ContatoDao;

public class TestaInsere {

	public static void main(String[] args) throws SQLException {

		Contato contato = new Contato();
		contato.setNome("Jorge");
		contato.setEmail("vinicius.jorge.silva@ccc.ufcg.edu.br");
		contato.setEndereco("R. Vergueiro 3185");
		contato.setNascimento(Calendar.getInstance());

		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");
	}
}
