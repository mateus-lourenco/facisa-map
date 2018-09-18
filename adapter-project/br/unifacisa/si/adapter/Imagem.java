package br.unifacisa.si.adapter;

public interface Imagem {
	
	public void desenhar(int pontoX, int pontoY, int altura, int largura);

	public String carregar(String arquivo, String extensao);

}
