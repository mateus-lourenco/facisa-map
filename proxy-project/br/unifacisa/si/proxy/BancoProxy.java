package br.unifacisa.si.proxy;

public class BancoProxy implements BancoService {

	protected String usuario, senha;
	private BancoUsuarios bancoUser;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public Integer getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return bancoUser.getNumeroDeUsuarios();
		}
		return null;
	}

	public Object getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return bancoUser.getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}