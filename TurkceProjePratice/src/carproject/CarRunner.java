package carproject;

public class CarRunner {

	public static void main(String[] args) {
		
		Car honda= new Car();
		honda.setMotor(1300);
		honda.setModel("Civic");
		honda.setYear(2021);
		honda.getModel();
		System.out.println(honda.getYear());
		
		
		Car volvo = new Car("xc90", "beyaz",2000, 2020);
		
		Car ww = new Car("passat", "kirmizi",1600, -2021);
		
		System.out.println(ww.getYear());
		
		System.out.println("you pick volvo" + " yili:" +volvo.getYear()+ "renk:"+volvo.getRenk());
		System.out.println("you pick ww" + " yili:" +ww.getYear()+ "renk:"+ww.getRenk());
	}

}
