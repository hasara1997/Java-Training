package factory;
//import factory.Vegetables;
//import factory.Chicken;
//import factory.Cheese;

public class ChickenKoththu extends KoththuCategory {

	@Override
	protected void makeKoththu() {
		
		ingredientList.add(new Vegetables());
		ingredientList.add(new Chicken());
	}

}
