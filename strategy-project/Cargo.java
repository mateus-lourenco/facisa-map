
public enum Cargo implements Gratificacao {

	GERENTE {

		@Override
		public double calcularGratificacao(int nivel, double salario) {
			return (nivel == 2) ? salario * 1.45 : salario * 1.30;
		}

	},

	DESENVOLVEDOR {

		@Override
		public double calcularGratificacao(int nivel, double salario) {
			return (nivel == 2) ? salario * 1.25 : salario * 1.15;
		}

	},

	DBA {

		@Override
		public double calcularGratificacao(int nivel, double salario) {
			return (nivel == 2) ? salario * 1.25 : salario * 1.15;
		}

	},

	LIDER {

		@Override
		public double calcularGratificacao(int nivel, double salario) {
			return (nivel == 2) ? salario * 1.35 : salario * 1.25;
		}

	}

}
