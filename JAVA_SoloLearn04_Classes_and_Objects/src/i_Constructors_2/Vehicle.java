package i_Constructors_2;

public class Vehicle {
	
	private String color;
	
	Vehicle() {
		this.setColor("Red");
	}
	
	Vehicle(String c) {
		this.setColor(c);
	}
	
	
	// Setter
	public void setColor(String c) {
		this.color = c;
	}

}
