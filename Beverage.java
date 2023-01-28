
public abstract class Beverage {
	
	Beverage(String bevName, Type type, Size size){
		name = bevName;
		this.type = type;
		this.size = size;
	}
	
	private String name;
	private Type type;
	private Size size;
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1.0;

	
	public double addSizePrice() {
		double np;
		
		np = size.ordinal() * SIZE_PRICE;
		
		return np;
	}
	
	public abstract double calcPrice();
	
	public boolean equals(Beverage anotherBev) {
		
		if(name.equals(anotherBev.getBevName())&& 
				type == anotherBev.getType() && 
				size == anotherBev.getSize()) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public double getBasePrice() {
		return BASE_PRICE;
	}
	
	public String getBevName() {
		return name;
	}
	
	public Size getSize() {
		return size;
	}
	
	public Type getType() {
		return type;
	}
	
	public String toString() {
		return name + "," + size;
	}
	
	
}
