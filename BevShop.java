import java.util.ArrayList;

//come back
public class BevShop implements BevShopInterface {
	private int numOfAlcoholInOrder;
	private int currentIdx;
	private ArrayList<Order> allOrders = new ArrayList<Order>();
	
	public BevShop() {};
	
	
	public int findOrder(int orderNo) {
		
		for (int i = 0; i < allOrders.size(); i++) {
			
			if (allOrders.get(i).getOrderNo() == orderNo) {
				
				return i;
			}
		}
		return -1;
	}
	
	
	public Order getCurrentOrder() {
		return allOrders.get(currentIdx);
	}
	
	
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}
	
	
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	
	public int getNumOfAlcoholDrink() {
		return numOfAlcoholInOrder;
	}
	
	
	public Order getOrderAtIndex(int index) {
		return allOrders.get(index);
	}
	
	
	public boolean isEligibleForMore() {
		
		if(numOfAlcoholInOrder < getMaxOrderForAlcohol()) {
			return true;
			
		}else {
			return false;
		
		}
	}
	
	public boolean isMaxFruit(int numOfFruits) {
		
		if(numOfFruits > getMaxNumOfFruits()) {
			return true;
			
		}else {
			return false;
		
		}
	}
	
	public boolean isValidAge(int age) {
		
		if(age >=  getMinAgeForAlcohol()) {
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public boolean isValidTime(int time) {
		
		if(time >= MIN_TIME && time <= MAX_TIME) {
			
			return true;
			
		}else {
			return false;
		}
	}
	
	public void processAlcoholOrder(String bevName, Size size) {
		
		allOrders.get(currentIdx).addNewBeverage(bevName, size);
		
		numOfAlcoholInOrder++;
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		
		allOrders.get(currentIdx).addNewBeverage(bevName, size, extraShot, extraSyrup);
	
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		
		allOrders.get(currentIdx).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	
	
	public void sortOrders() {
		
		for (int i = 0; i < allOrders.size()-1; i++) {
			int m = i;
			
			for (int j = i+1; j < allOrders.size(); j++) {
				
				if (allOrders.get(j).getOrderNo() < allOrders.get(m).getOrderNo()) {
					
					m = j;
				}
			}
			
			Order temp = allOrders.get(m);
			
			allOrders.set(m, allOrders.get(i));
			
			allOrders.set(i, temp);
			
		}
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		numOfAlcoholInOrder = 0;
		
		Customer customer = new Customer(customerName, customerAge);
		
		Order order = new Order(time, day, customer);
		
		allOrders.add(order);
		
		currentIdx = allOrders.indexOf(order);
	}
	
	public String toString() {
		String s = "Monthly Orders\n";
		
		for (Order j : allOrders) {
			s += j.toString();
		}
		s += "Total Sale: " +totalMonthlySale();
		
		return s;
	}
	
	public double totalMonthlySale() {
		double totalSale = 0;
		
		
		for (Order o : allOrders) {
			for (Beverage b : o.getBeverages()) {
				totalSale += b.calcPrice();
			}
		}
		return totalSale;
	}
	
	public int totalNumOfMonthlyOrders() {
		return allOrders.size();
	}
	
	public double totalOrderPrice(int orderNo) {
		double os = 0;
		
		for (Order i : allOrders) {
			
			if (i.getOrderNo() == orderNo) {
				
				for (Beverage j : i.getBeverages()) {
					
					os += j.calcPrice();
				}
			}
		}
		return os;
	}
	

}
