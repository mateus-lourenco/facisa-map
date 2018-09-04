package br.edu.unifacisa.factory;

class PizzaStoreAF {

	public interface PizzaIngredientFactory {

		public Dough createDough();

		public Sauce createSauce();

		public Cheese createCheese();

		public Veggies[] createVeggies();

		public Clams createClam();

	}

	// Concrete Factory
	public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

		public Dough createDough() {
			return new ThinCrustDough();
		}

		public Sauce createSauce() {
			return new MarinaraSauce();
		}

		public Cheese createCheese() {
			return new ReggianoCheese();
		}

		public Veggies[] createVeggies() {
			Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
			return veggies;
		}

		public Clams createClam() {
			return new FreshClams();
		}
	}

	public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

		public Dough createDough() {
			return new ThickCrustDough();
		}

		public Sauce createSauce() {
			return new PlumTomatoSauce();
		}

		public Cheese createCheese() {
			return new MozzarellaCheese();
		}

		public Veggies[] createVeggies() {
			Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
			return veggies;
		}

		public Clams createClam() {
			return new FrozenClams();
		}
	}

	// Parts of Pizza
	public interface Clams {
		public String toString();
	}

	public interface Cheese {
		public String toString();
	}

	public interface Sauce {
		public String toString();
	}

	public interface Dough {
		public String toString();
	}

	public interface Pepperoni {
		public String toString();
	}

	public interface Veggies {
		public String toString();
	}

	public class FreshClams implements Clams {

		public String toString() {
			return "Fresh Clams from Long Island Sound";
		}
	}

	public class FrozenClams implements Clams {

		public String toString() {
			return "Frozen Clams from Long Island Sound";
		}
	}

	public class ReggianoCheese implements Cheese {

		public String toString() {
			return "Reggiano Cheese";
		}
	}

	public class MozzarellaCheese implements Cheese {

		public String toString() {
			return "Mozzarella Cheese";
		}
	}

	public class MarinaraSauce implements Sauce {
		public String toString() {
			return "Marinara Sauce";
		}
	}

	public class PlumTomatoSauce implements Sauce {
		public String toString() {
			return "Plum Tomato Sauce";
		}
	}

	public class ThinCrustDough implements Dough {
		public String toString() {
			return "Thin Crust Dough";
		}
	}

	public class ThickCrustDough implements Dough {
		public String toString() {
			return "Thick Crust Dough";
		}
	}

	public class BlackOlives implements Veggies {
		public String toString() {
			return "Black Olives";
		}
	}

	public class Spinach implements Veggies {
		public String toString() {
			return "Spinach";
		}
	}

	public class Eggplant implements Veggies {
		public String toString() {
			return "Eggplant";
		}
	}

	public class VeggiesClass implements Veggies {
		public String toString() {
			return "Veggies Pizzas are horribles!";
		}

	}
}