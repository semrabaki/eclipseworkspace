package carproject;

public class CarRunner {

	public static void main(String[] args) {
		
		
	
		Car car = new Honda("Civic", 2021, 6000);  //I cannot have Car() here because it is abstracr class
		
//		System.out.println(car.make);//null
//		System.out.println(car.carMake());//Car Make: Honda
		
		
		System.out.println("==============Honda======================");
//		
		System.out.println(car.model);//Civic
		
		System.out.println(car.carModel());//Car Model:Civic
		System.out.println(car.carMake());
		System.out.println(car.carYear());
		System.out.println(car.carPrice());
		
		System.out.println("==============Honda======================");
		
		Car car2= new Toyota();
		
		System.out.println(car2.carMake());
		System.out.println(car2.carModel());
		System.out.println(car2.carYear());
		System.out.println(car2.carPrice());
		

	}

}
