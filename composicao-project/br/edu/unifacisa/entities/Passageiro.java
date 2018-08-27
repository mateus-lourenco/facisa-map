package br.edu.unifacisa.entities;

public class Passageiro {
	private int numeroSmiles;
	private Pessoa pessoa;

	public Passageiro(Pessoa pessoa, int numeroSmiles) {
		this.pessoa = pessoa;
		this.numeroSmiles = numeroSmiles;
	}

	public int getNumeroSmiles() {
		return numeroSmiles;
	}

	public void setNumeroSmiles(int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
	}

	public String getNome() {
		return this.pessoa.getNome();
	}

	public void setNome(String nome) {
		this.pessoa.setNome(nome);

	}
	
	public String toString() {
		return "Numero de Smiles : "+getNumeroSmiles();
	}
}