package test;

public class BirdSeed {

	   private int numberBags;

	   boolean call;



	   public BirdSeed() {

	       this.numberBags = 11;

	       this.call = false;

	   }



	   public BirdSeed(int numberBags) {

	            this.numberBags = numberBags;

	            this.call = true;

	   }



	   public static void main(String[] args) {

		   BirdSeed seed = new BirdSeed(7);
		   System.out.println(seed.call);

	   }



	} 