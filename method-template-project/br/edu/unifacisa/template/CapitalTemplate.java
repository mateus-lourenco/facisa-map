package br.edu.unifacisa.template;

public abstract class CapitalTemplate {

	public abstract double capital(Loan loan);
	
	public double capitalLoan(Loan loan) {
		return capital(loan) * duration(loan) * riskFactorFor(loan);
	}

	public double duration(Loan loan) {
		return 1.0;
	}

	protected double riskFactorFor(Loan loan) {
		return 2.0;
	}

}
