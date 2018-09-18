package br.unifacisa.si.cliente;

import br.unifacisa.si.adapter.ImagemAdapter;
import br.unifacisa.si.adapter.ImagemTarget;

public class Cliente {

	public static void main(String[] args) {
		ImagemTarget im = new ImagemAdapter();
		im.desenharImagem(0, 0, 0, 0);
		System.out.println(im.carregarImagem("imagem.jpg"));
		System.out.println(im.carregarImagem("imagem.png"));
		System.out.println(im.carregarImagem("imagem.bmp"));

	}
}
