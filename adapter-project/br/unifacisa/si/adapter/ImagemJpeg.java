package br.unifacisa.si.adapter;

public class ImagemJpeg implements Imagem {

	
	public void desenhar(int pontoX, int pontoY, int altura, int largura) {
		
	}

	public String carregar(String arquivo, String extensao) {
		extensao = "jpg";
		return "esta eh uma imagem."+"extensao";

	}


}
