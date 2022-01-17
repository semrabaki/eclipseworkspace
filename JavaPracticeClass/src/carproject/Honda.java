package carproject;

public class Honda extends Car {
	
	protected String make="Honda";
	protected String model="Accord";
	protected int year=2012;
	protected double price=8000;

	public Honda() {
		
	}

	public Honda(String model, int year, double price) {
		super(model, year, price);//this is assigning new values inside the car class
		this.model = model;
		this.year = year;
		this.price = price;
	}
	static
	{
		System.out.println("Honda is on the way!");
		
		//initializer
	}

	@Override
	String carMake() {
		
		return "Car Make: " +this.make;
	}

	@Override
	String carModel() {
		
		return "Car Model:"  +this.model;
	}

	@Override
	int carYear() {
		
		return this.year;
	}

	@Override
	double carPrice() {
		
		return this.price;
	}

	
	
	
}
