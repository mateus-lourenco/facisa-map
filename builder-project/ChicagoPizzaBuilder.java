public class ChicagoPizzaBuilder implements PizzaIngredientBuilder {

	public Dough buildDough() {
		return new ThinCrustDough();
	}

	public Sauce buildSauce() {
		return new MarinaraSauce();
	}

	public Cheese buildCheese() {
		return new ReggianoCheese();
	}

	public Clams buildClam() {
		return new FreshClams();
	}

	public Veggies[] buildVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;

	}

	@Override
	public PizzaProduct getPizza() {
		return new PizzaProduct();
	}
}
