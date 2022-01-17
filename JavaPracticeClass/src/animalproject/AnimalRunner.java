package animalproject;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal animal1= new Cat("Cookie", 3, "Ground", true);
		
		Animal animal2= new Eagle("Coco", 7, "Air", false);
		
		System.out.println("===================CAT================");
		
		System.out.println("animal name: "+animal1.animalNAme());
		System.out.println("animal age: "+animal1.animalAge());
		System.out.println("animal habitat: "+animal1.animalHabitat());
		System.out.println("is domestic: "+animal1.isDomestic());
		
		
		System.out.println("===================EAGLE================");
		
		
		System.out.println("animal name: "+animal2.animalNAme());
		System.out.println("animal age: "+animal2.animalAge());
		System.out.println("animal habitat: "+animal2.animalHabitat());
		System.out.println("is domestic: "+animal2.isDomestic());

		
	
		
		
		
	}

}
