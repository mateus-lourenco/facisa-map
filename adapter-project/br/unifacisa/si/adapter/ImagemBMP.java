package br.unifacisa.si.adapter;

public class ImagemBMP implements Imagem {

	public void desenhar(int pontoX, int pontoY, int altura, int largura) {

	}

	public String carregar(String arquivo, String extensao) {
		extensao = "bmp";
		return "esta eh uma imagem." + "extensao";

	}
}
