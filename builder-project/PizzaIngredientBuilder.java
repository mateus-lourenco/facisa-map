public interface PizzaIngredientBuilder {

	public Dough buildDough();

	public Sauce buildSauce();

	public Cheese buildCheese();

	public Veggies[] buildVeggies();

	public Clams buildClam();
	
	public PizzaProduct getPizza();
}
