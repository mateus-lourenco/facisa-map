import java.text.DecimalFormat;

public class PorcentoObserver implements DadosObserver {
	private DadosSubject dados;
	public PorcentoObserver(DadosSubject dados) {
		this.dados = dados;
	}

	@Override
	public void update() {
		int somaDosValores = dados.getState().valorA + dados.getState().valorB
				+ dados.getState().valorC;
		DecimalFormat formatador = new DecimalFormat("#.##");
		String porcentagemA = formatador.format((double) dados.getState().valorA
				/ somaDosValores);
		String porcentagemB = formatador.format((double) dados.getState().valorB
				/ somaDosValores);
		String porcentagemC = formatador.format((double) dados.getState().valorC
				/ somaDosValores);
		System.out.println("Porcentagem:\nValor A: " + porcentagemA
				+ "%\nValor B: " + porcentagemB + "%\nValor C: " + porcentagemC
				+ "%");
	}

}