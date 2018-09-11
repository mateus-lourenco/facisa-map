public class PizzaDirector {
	protected PizzaIngredientBuilder pizzaBuilder;

	public PizzaDirector(PizzaIngredientBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}

	public void buildPizza() {
		pizzaBuilder.buildClam();
		pizzaBuilder.buildCheese();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildVeggies();
	}

	public PizzaProduct getPizza() {
		PizzaProduct pizzaProduct = new PizzaProduct();
		return pizzaProduct.getPizzaProduct();
	}

}
