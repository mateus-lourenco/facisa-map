package br.edu.unifacisa.entities;

public class Pessoa {
	private String nome;
	private Endereco endereco;

	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return this.endereco.getRua();
	}

	public void setRua(String rua) {
		this.endereco.setRua(rua);
	}

	public String getCidade() {
		return this.endereco.getCidade();
	}

	public void setCidade(String cidade) {
		this.endereco.setCidade(cidade);
	}

	public String getUf() {
		return this.endereco.getUf();
	}

	public void setUf(String uf) {
		this.endereco.setUf(uf);
	}

	public String toString() {
		return "Nome: " + getNome() + "\nRua: " + getRua() 
		+ "\nCidade: " + getCidade() + "\nUf: " + getUf();
	}
}
