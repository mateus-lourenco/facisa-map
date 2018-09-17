package br.unifacisa.si.proxy;

public class BancoUsuarios implements BancoService {
	private int quantidadeDeUsuarios;
	private int usuariosConectados;

	public BancoUsuarios() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}

	public Integer getNumeroDeUsuarios() {
		return quantidadeDeUsuarios;
	}

	public Object getUsuariosConectados() {
		return new String("Usuários conectados: " + usuariosConectados);
	}
}