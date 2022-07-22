package factory;

public class KoththuFactory {
	
	public static KoththuCategory orderKoththu(KoththuCode kCode) {
		
		switch (kCode) {
		case VEG:
			return new VegetableKoththu();
			
		case ChICKEN:
			return new ChickenKoththu();
			
		case CHEESY:
			return new CheeseKoththu();
			

		default:
			return null;
			
		}
		
		
	}

}
