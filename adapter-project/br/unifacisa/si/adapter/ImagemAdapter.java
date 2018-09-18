package br.unifacisa.si.adapter;

public class ImagemAdapter implements ImagemTarget {
	Imagem imagem;

	@Override
	public void desenharImagem(int pontoX, int pontoY, int altura, int largura) {
		imagem.desenhar(pontoX, pontoY, altura, largura);
	}

	@Override
	public String carregarImagem(String arquivo) {
		String ext = new String();
		ext.substring(arquivo.indexOf("."), (arquivo.length() - 1));

		if (ext.equals("jpg")) {
			imagem = new ImagemJpeg();
			return imagem.carregar(arquivo, ext);
		} else if (ext.equals("png")) {
			imagem = new ImagemPNG();
			return imagem.carregar(arquivo, ext);
		} else {
			imagem = new ImagemBMP();
			return imagem.carregar(arquivo, ext);
		}

	}

}
