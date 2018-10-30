public class BarraObserver implements DadosObserver {
	private DadosSubject dados;
	public BarraObserver(DadosSubject dados) {
		this.dados = dados;
	}

	@Override
	public void update() {
		String barraA = "", barraB = "", barraC = "";

		for (int i = 0; i < dados.getState().valorA; i++) {
			barraA += '=';
		}

		for (int i = 0; i < dados.getState().valorB; i++) {
			barraB += '=';
		}

		for (int i = 0; i < dados.getState().valorC; i++) {
			barraC += '=';
		}

		System.out.println("Barras:\n Valor A: " + barraA + "\nValor B: "
				+ barraB + "\nValor C: " + barraC);
	}

}