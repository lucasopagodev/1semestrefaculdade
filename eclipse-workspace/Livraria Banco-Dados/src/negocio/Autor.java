package negocio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import persistencia.BancoDeDados;

public class Autor extends Entidade {
	private String nome = "";

	public Autor() {
		super();
	}

	public Autor(int id, String nome) {
		super(id);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Collection<Autor> getTodosAutores () throws Exception {
		ArrayList<Autor> retorno = new ArrayList<Autor>();
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		ResultSet resultadoPesquisa = objBanco.executarPesquisa("SELECT * FROM AUTOR ORDER BY NOME");
		while (resultadoPesquisa.next()) {
			retorno.add(new Autor(resultadoPesquisa.getInt(1), resultadoPesquisa.getString(2)));
		}
		objBanco.desconectar();
		
		return retorno;
	}
}
