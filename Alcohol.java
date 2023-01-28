
public class Alcohol extends Beverage{
	
	public Alcohol(String bevName, Size size, boolean isWeekend){
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	private boolean isWeekend;
	private final double WEEKEND_FEE = 0.60;
	
	
	public double calcPrice() {
		double p = 0.0;
		p = super.getBasePrice();
		
		p += addSizePrice();
			
		if(isWeekend) {
			p += WEEKEND_FEE;
		}
		
		return p;
	
	}
	
	public boolean equals(Alcohol anotherBev) {
		if(super.equals(anotherBev) && 
			isWeekend == anotherBev.isWeekend()) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	public String toString() {
		
		String s = getBevName() +", " +getSize();
		
		if (isWeekend) {
			s += " Weekend";}
		
		s += ", $" +calcPrice();
			return s;
	}
	
	
	

	
}
