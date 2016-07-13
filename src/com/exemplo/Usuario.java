package com.exemplo;

/**
 * Classe de Usuario a ser utilizada como dado para esse exemplo
 * @author lucasrez
 *
 */
public class Usuario {

	private String usuario;
	private String senha;
	private int numAcessos;
	
	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		this.numAcessos = 0;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumAcessos() {
		return numAcessos;
	}

	public void setNumAcessos(int numAcessos) {
		this.numAcessos = numAcessos;
	}
	
}
