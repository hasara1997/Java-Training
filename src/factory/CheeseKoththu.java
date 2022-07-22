package factory;

public class CheeseKoththu extends KoththuCategory {

	@Override
	protected void makeKoththu() {

		ingredientList.add(new Vegetables());
		ingredientList.add(new Chicken());
		ingredientList.add(new Cheese());
		
	}

}
