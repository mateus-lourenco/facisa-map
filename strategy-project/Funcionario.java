/* Exemplo inspirado no exemplo do Marcos Brizeno 
 * https://brizeno.wordpress.com/category/padroes-de-projeto/strategy/
 */
public class Funcionario {

	protected double salarioBase;
	protected int cargo;
	protected int nivel;
	protected Gratificacao estrategiaDeGratificacao;

	public Funcionario(int cargo, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;

	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public int getNivel() {
		return nivel;
	}
}