package factory;
//import factory.Vegetables;


public class VegetableKoththu extends KoththuCategory {

	@Override
	protected void makeKoththu() {
		ingredientList.add(new Vegetables());
		
	}

	
}
