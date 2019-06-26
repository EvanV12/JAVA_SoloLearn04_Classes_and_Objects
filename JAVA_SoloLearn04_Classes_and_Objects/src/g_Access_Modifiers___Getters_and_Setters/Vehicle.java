package g_Access_Modifiers___Getters_and_Setters;

public class Vehicle {
	
	private int maxSpeed;
	private int wheels;
	private String color;
	private double fuelCapacity;
	
	
	
	
	// Getter
	public String getColor() {
		return color;
	}
	
	// Setter
	public void setColor(String c) {
		this.color = c;
		
		
	}
	
	
	public void horn() {
		System.out.println("Beep!");
	}

}
