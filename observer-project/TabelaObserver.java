public class TabelaObserver implements DadosObserver {
	private DadosSubject dados;
	public TabelaObserver(DadosSubject dados) {
		this.dados = dados;
	}

	@Override
	public void update() {
		System.out.println("Tabela:\nValor A: " + dados.getState().valorA
				+ "\nValor B: " + dados.getState().valorB + "\nValor C: "
				+ dados.getState().valorC);
	}

}