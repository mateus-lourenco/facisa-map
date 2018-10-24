package br.edu.unifacisa.template;

public class CapitalTemplateTermLoan extends CapitalTemplate {

	@Override
	public double capital(Loan loan) {
		return loan.getCommitment() * capitalLoan(loan);
	}	

}
