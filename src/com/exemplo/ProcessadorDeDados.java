package com.exemplo;

import java.util.ArrayList;

public class ProcessadorDeDados{

	//Lista com todos os Usuarios
	private ArrayList<Usuario> usuarios;

	public ProcessadorDeDados() {
		usuarios = new ArrayList<>();
	}
	//Busca usuarios de uma base de dados e retorna o array
	public void buscaUsuarios() {
		usuarios.add(new Usuario("usuario", "senha"));
		usuarios.add(new Usuario("senha", "usuario"));
		usuarios.add(new Usuario("Ednaldo Pereira", "Ednaldo Pereira"));
		usuarios.add(new Usuario("Alexandre", "senha1"));
		usuarios.add(new Usuario("Lucas", "senhalongapracaraiomeldels"));	}
	
	//Imprime todos os usuarios no terminal
	public void imprimeDados() {
		for (Usuario usuario : usuarios) {
			System.out.println("Usuario: " + usuario.getUsuario());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println("Numero de acessos: " + usuario.getNumAcessos());
			System.out.println("=========================================================");
		}
	}
	
	//Incrementa o numero de acessos de todos os usuarios
	public void processaDados() {
		for (Usuario usuario : usuarios) {
			usuario.setNumAcessos(usuario.getNumAcessos() + 1);
		}
	}
}
