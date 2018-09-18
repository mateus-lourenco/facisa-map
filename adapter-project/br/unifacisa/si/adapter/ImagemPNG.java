package br.unifacisa.si.adapter;

public class ImagemPNG implements Imagem {

	public void desenhar(int pontoX, int pontoY, int altura, int largura) {

	}

	public String carregar(String arquivo, String extensao) {
		extensao = "png";
		return "esta eh uma imagem." + "extensao";

	}
}
