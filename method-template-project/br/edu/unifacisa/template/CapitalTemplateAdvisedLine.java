package br.edu.unifacisa.template;

public class CapitalTemplateAdvisedLine extends CapitalTemplate {

	@Override
	public double capital(Loan loan) {
		// TODO Auto-generated method stub
		return loan.getCommitment() * capitalLoan(loan) * loan.getUnusedPercentage();
	}

}
