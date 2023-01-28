
public class Smoothie extends Beverage {
	Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein){
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}

	
	private int numOfFruits;
	private boolean addProtein;
	private final double FRUIT_COST = 0.50;
	private final double PROTEIN_COST = 1.50;
	
	public boolean equals(Smoothie anotherBev) {
		if(super.equals(anotherBev) && 
				numOfFruits == anotherBev.getNumOfFruits() && 
				addProtein == anotherBev.getAddProtein()) {
			
			return true;
		
		}else {
			return false;
		}
	}
	
	public String toString() {
		String s = getBevName() +", " + getSize() +" " + 
	getNumOfFruits() +" Fruits";
		
		if (addProtein) {
			s += " Protein powder";
		}
		
		s += ", $" + calcPrice();
		
		return s;
	}
	
		
	
	
	
	public boolean getAddProtein() {
		return addProtein;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
public double calcPrice() {
		
		double p = 0.0;
		p = super.getBasePrice();
		p += addSizePrice();
		p += numOfFruits * FRUIT_COST;
		
		if(addProtein) {
			p += PROTEIN_COST;
		}
		
		return p;
	
	}
	
	
}
