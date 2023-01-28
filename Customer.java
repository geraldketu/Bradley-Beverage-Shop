
public class Customer {
	Customer(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Customer(Customer c){
		name = c.name;
		age = c.age;
	}
	
	
	private String name;
	private int age;
	
	
	
	public int getAge() {
		return age;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return name + ", " + age;
	}
	
	
}
