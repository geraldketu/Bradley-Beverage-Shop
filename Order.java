//come back
	import java.util.ArrayList;
	import java.util.Random;

	public class Order implements OrderInterface, Comparable<Order> {
		public Order(int orderTime, Day orderDay, Customer customer) {
			
			
			orderNo = generateOrder();
			this.orderTime = orderTime;
			this.orderDay = orderDay;
			this.customer = customer;
			beverages = new ArrayList<>();
		}
		
		private int orderNo;
		private int orderTime;
		private Day orderDay;
		private Customer customer;
		private ArrayList<Beverage> beverages;
		
		
		
		public void addNewBeverage(String bevName, Size size) {
			boolean isW = true;
			if(orderDay != Day.SATURDAY || orderDay != Day.SUNDAY) {
				isW = false;
			}
			
			Alcohol alc = new Alcohol(bevName, size, isW);
			
			beverages.add(alc);
			
		}
		
		public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
			Coffee coff = new Coffee(bevName, size, extraShot, extraSyrup);
			
			beverages.add(coff);
	
		
		}
		
		public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
			Smoothie smooth = new Smoothie(bevName, size, numOfFruits, addProtein);
			
			beverages.add(smooth);
		
		}
		
		public double calcOrderTotal() {
			double ot = 0;
			

			for(int i = 0; i < beverages.size(); i++) {
				
				ot += beverages.get(i).calcPrice();
			}
		
			return ot;
		}
		
		
		public int compareTo(Order anotherOrder) {
			
			if(orderNo == anotherOrder.getOrderNo()) {
				
				return 0;
				
			}else if(orderNo > anotherOrder.getOrderNo()) {
				
				return 1;
				
			}else {
				
				return -1;
				
			}
		}
		
		public int findNumOfBeveType(Type type) {
			
			int c = 0;
			
			for(Beverage i : beverages) {
				
				if(i.getType() == type) {
					c++;
				}
			} 
			return c;
			
		}
		
		public int generateOrder() {
			
			Random r = new Random();
			
			int rNum = r.nextInt(90000 - 10000) + 10000;
			
			return rNum;
		}
		
		public Beverage getBeverage(int itemNo) {
			return beverages.get(itemNo);
		}
		
		
		public Customer getCustomer() {
			
			return new Customer(customer);
			
		}
		
		public Day getDay() {
			return orderDay;
			
		}
		
		public Day getOrderDay() {
			return orderDay;
			
		}
		
		public int getOrderNo() {
			return orderNo;
			
		}
		public int getOrderTime() {
			return orderTime;
			
		}
		
		public int getTotalItems() {
			return beverages.size();
			
		}
		
		public boolean isWeekend() {
			if(orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
				return true;
			
			}
			return false;
			
		}
		
		public String toString() {
			String s = "__________________________" +orderDay.toString() +", " +
		orderTime
					   +"\n" +customer.toString() +" Order Num: " +orderNo;
			
			for (Beverage bev : beverages) {
				s += "\n" +bev.toString();
				
			}
			s += "\n Order Total: " +calcOrderTotal();
			
			return s;
		}
	
		
		public ArrayList<Beverage> getBeverages() {
			return beverages;
		}
}
