package br.edu.unifacisa.entities;

public class Agente {
	private int idAgente;
	private Pessoa pessoa;

	public Agente(Pessoa pessoa, int idAgente) {
		this.pessoa = pessoa;
		this.idAgente = idAgente;
	}

	public int getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

	public String getNome() {
		return this.pessoa.getNome();
	}

	public void setNome(String nome) {
		this.pessoa.setNome(nome);
	}
	
	public String toString() {
		return "Id Agente: "+getIdAgente();
	}
	
}