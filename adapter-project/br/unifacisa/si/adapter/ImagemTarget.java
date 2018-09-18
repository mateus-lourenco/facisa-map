package br.unifacisa.si.adapter;

public interface ImagemTarget {

	void desenharImagem(int pontoX, int pontoY, int altura, int largura);

	String carregarImagem(String arquivo);

}
