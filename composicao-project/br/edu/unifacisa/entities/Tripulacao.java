package br.edu.unifacisa.entities;

public class Tripulacao {
	private int idTripulacao;
	private Pessoa pessoa;
	
	public Tripulacao(Pessoa pessoa, int idTripulacao) {
		this.pessoa = pessoa;
		this.idTripulacao = idTripulacao;
	}

	public int getIdTripulacao() {
		return idTripulacao;
	}

	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}

	public void setNome(String nome) {
		this.pessoa.setNome(nome);
	}

	public String getNome() {
		return this.pessoa.getNome();
	}
	
	public String toString() {
		return pessoa.toString()+"\n"+"Faz parte da tripulacao: "+ getIdTripulacao();
	}

}