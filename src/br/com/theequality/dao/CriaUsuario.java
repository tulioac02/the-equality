package br.com.theequality.dao;

import br.com.theequality.modelo.Usuario;

public class CriaUsuario {

	public static void main(String[] args) {

		DAO<Usuario> dao = new DAO<Usuario>(Usuario.class);
		Usuario usuario = new Usuario ("tulio@alves.com", "123", "tulio");
		dao.adiciona(usuario);
	}
}
