package day01;

public class deneme {
	public class Animal {

		public int weight = 12;

	     protected boolean feed = true;

	}



	public class Mammal extends Animal {

	    public int weight = 13;

	    public boolean bark = false;

		
	}



	public class Dog extends Mammal {

	     private boolean bark = true;

		public static void main(String[] args) {

			Dog dog = new Dog();

	        System.out.println(dog.bark);

			System.out.println(dog.feed);

			System.out.println(dog.weight);

		}
}
