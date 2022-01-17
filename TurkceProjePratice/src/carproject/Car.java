package carproject;
/*
  fiedlari ( encapsulated) model(String) , renk(String), motor(int), yil(int)
  olan Araba isimli bir class olustur
  
  2- butun fieldlari parametre alan bir contructor
  3- Arabamain inminde main icin bir class olustur
  4- iki adet paarmetreli const 1 adet paramesresiz cons ile 3 adet araba create ediniz
  5- araclarin motor gucunu 100 beygir ve ustu olmasi ve yilini hatali veri girisimine karsi kontrol ediniz
 */

public class Car {
	
	private String model;
	private String renk;
	private int motor;
	private int year;
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		
		if(motor>=100) {
		this.motor = motor;
		}else
		{
			System.out.println("100 beygirden kucuk olmasin");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year<0)
		{
			System.out.println("do not enter negative year");
			this.year=-1*year;
		}
		else
			{this.year = year;
	}
	}

	public Car() {
		
	}

	public Car(String model, String renk, int motor, int year) {
		
		this.model = model;
		this.renk = renk;
		this.motor = motor;
		//this.year = year;
		
		setYear(year);
		setMotor(motor);
	}
	
	

}
