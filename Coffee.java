
public class Coffee extends Beverage{
	
	Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup){
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	private boolean extraShot;
	private boolean extraSyrup;
	private final double SHOT_COST = .50;
	private final double SYRUP_COST = .50;
	
	
	
	
	
	public double calcPrice() {
		double p;
		p = super.getBasePrice();
		p += addSizePrice();

		if(extraShot) {
			
			p += SHOT_COST;
		}
		
		if(extraSyrup) {
			
			p += SYRUP_COST;
		}
		
		return p;
	}
	
	public boolean equals(Coffee anotherBev) {
		
		if(super.equals(anotherBev) && 
				extraShot == anotherBev.getExtraShot() && 
				extraSyrup == anotherBev.getExtraSyrup()) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	
	public String toString() {
		
		String s = getBevName() +", " +getSize();
		
		if (extraShot) {
			s += " Extra shot";
		}
		
		if (extraSyrup) {
			s += " Extra syrup";
		}
		
		s += ", $" + calcPrice();
		
		return s;
	}
	
}
