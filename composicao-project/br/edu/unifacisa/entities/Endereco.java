package br.edu.unifacisa.entities;

public class Endereco {
	private String rua;
	private String cidade;
	private String uf;

	public Endereco(String rua, String cidade, String uf) {
		this.rua = rua;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
