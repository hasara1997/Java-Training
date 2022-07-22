package factory;
import java.util.ArrayList;
import factory.Ingredient;

public abstract class KoththuCategory {
	
	protected ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
	
	public KoththuCategory() {
		makeKoththu();
	}

	protected abstract void makeKoththu();
	
	public String toString() {
		return "Dear Customer your koththu has ["+ingredientList+"]";
	}
	
}
