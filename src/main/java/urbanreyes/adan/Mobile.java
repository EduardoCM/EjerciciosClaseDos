package urbanreyes.adan;

public class Mobile {
	private String model;
	private float version;
	private String operativeSystem;
	private double price;
	private boolean freed;
	private String number;
	
	public Mobile() {
		
	}
	
	public Mobile(String model, float version, double price) {
		this.model = model;
		this.version = version;
		this.price = price;
		operativeSystem = "Android 7.1";
		freed = false;
	}
	
	public void setOperativeSystem(String operativeSystem) {
		this.operativeSystem = operativeSystem;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setFree() {
		freed = true;
	}
	
	public void turnOn() {
		System.out.println((operativeSystem.startsWith("Android")) ? "Welcome Androide" : "You must use Android" );
	}
	
	public void turnOff() {
		System.out.println("Turning off");
	}
	
	@Override
	public String toString(){
		return "Mobile: " + model + " " + version;
	}
	
}
