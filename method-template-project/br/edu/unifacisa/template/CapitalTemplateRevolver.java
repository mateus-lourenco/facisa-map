package br.edu.unifacisa.template;

public class CapitalTemplateRevolver extends CapitalTemplate{

	@Override
	public double capital(Loan loan) {
		// TODO Auto-generated method stub
		return capitalLoan(loan) * loan.outstandingRiskAmount()
				+ (loan.unusedRiskAmount() * duration(loan) * unusedRiskFactor(loan));
	}

	private int unusedRiskFactor(Loan loan) {
		return 0;
	}

}
