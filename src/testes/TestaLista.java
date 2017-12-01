package testes;

import java.util.List;

import principal.Contato;
import principal.ContatoDao;

public class TestaLista {

	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getList();

		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i).toString());
		}
	}
}
