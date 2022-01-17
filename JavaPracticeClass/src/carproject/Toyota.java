package carproject;

public class Toyota extends Car {
	
	protected String make="Toyota";
	protected String model="Camry";
	protected int year=2015;
	protected double price=14000;

	public Toyota() {
		
		
	}

	

	public Toyota(String model, int year, double price) {
		super(model, year, price);
		this.model = model;
		this.year = year;
		this.price = price;
	}



	@Override
	String carMake() {
	
		return "Car Make: " +this.make;
	}

	@Override
	String carModel() {
		
		return  "Car Model: " +this.model;
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
