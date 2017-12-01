package testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;

import principal.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		
		String sql = "insert into contatos" + " (nome,email,endereco,nascimento)" + " values (?,?,?,?)";
		java.sql.PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "Vinicius");
		stmt.setString(2, "vinicius.jorge.silva@ccc.ufcg.edu.br");
		stmt.setString(3, "R. Maria José Bezerra de Carvalho 936A");
		stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
		stmt.execute();
		stmt.close();
		
		System.out.println("Gravado!");
		conexao.close();
	}
}
