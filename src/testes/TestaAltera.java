package testes;

import java.util.Calendar;

import principal.Contato;
import principal.ContatoDao;

public class TestaAltera {
	
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		contato.setId(1L);
		contato.setNome("Vinicius");
		contato.setEmail("vinicius@jorge.com");
		contato.setEndereco("R. Varguinhos 234");
		contato.setNascimento(Calendar.getInstance());
		dao.altera(contato);
		System.out.println("Alterado!");
	}
}
