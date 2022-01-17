package atm;

import java.util.Scanner;

public class ATM01 {
	static String kartNumaram="123456";
	static String sifrem= "1234";
	static double bakiye;

	public static void main(String[] args) {
		
		
		
			Scanner scan= new Scanner(System.in);
			System.out.println("====JavaBanka Hosgeldiniz====");
			
			String kart="";
			String sifre="";
			
			do {
				System.out.println("Kart numarasini giriniz");
				kart=scan.nextLine();
				System.out.println("Lutfen sifrenizi giriniz");
				sifre= scan.next();
				if(!sifre.equals(sifrem)||!kart.replaceAll("\\s", "").equals(kartNumaram))
				{
					System.out.println("Hatali giris yaptiniz");
				}
				
			}while(!sifre.equals(sifrem)||!kart.replaceAll("\\s", "").equals(kartNumaram));
			
			ekran();
			

	}
	private static void ekran()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Sifreniz dogrulandi");
		char secim=' ';
		do
		{
			System.out.println("Lutfen yapmak istediginiz islemi giriniz\n A=->Bakiye Sorgulama\n B=-> Para cekme\nC->Para Yatirma\nD->Para gonderme\nE->Sifre Degistirme\nS->Cikis");
		    secim= scan.next().toUpperCase().charAt(0);
		    
		    switch (secim)
		    {
		    case 'A':
		    	bakiyeSorgula();
		    	break;
		    case 'B':
		    	paraCekme();
		    	break;
		    case 'C':
		    	paraYatirma();
		    	break;
		    case 'D':
		    	paraGonderme();
		    	break;
		    case 'E':
		    	sifreDegistirme();
		    	break;
		    case 'F':
		    	System.out.println("Cikis basarili.");
		    	break;
		    default:
		    	System.out.println("Lutfen gecerli islem seciniz..");
		    		break;
		    
		    }
		
		
		
		}while(secim!='F');
		
		
		
	}
	
	private static void bakiyeSorgula()
	{
		System.out.println("Bakiyeniz->"+bakiye+"tl");
	}
	private static void paraCekme()
	{
		Scanner scan= new Scanner(System.in);
		double cekilenTutar;
		System.out.println("Cekilecek tutari giriniz");
		cekilenTutar=scan.nextDouble();
		
		if(cekilenTutar>=bakiye)
		{
			bakiye-=cekilenTutar;
			System.out.println("Islem basarili.\nMevcut Bakiyeniz: " + bakiye);
			
		}
		else
		{
			System.out.println("Bakiye yetersiz");
		}
		
	}
	private static void paraYatirma()
	{
		Scanner scan= new Scanner(System.in);
		double yatirilanTutar;
		System.out.println("Gondermek istediginiz parayi girin: ");
		yatirilanTutar=scan.nextDouble();
		bakiye+=yatirilanTutar;
		System.out.println("Islem basarili paraniz hesabiniza yatirildi.\nMevcut Bakiyeniz: " + bakiye);
		
		
	}
	private static void paraGonderme()
	{
		Scanner scan= new Scanner(System.in);
		String Iban;
		double gonderilecekTutar;
		System.out.println("Lutfen para gondereceginiz IBAN numarasini giriniz");//TR ile baslicayacak ve 26 karakterli olucak
		Iban=scan.nextLine().toUpperCase();
		
		if(Iban.startsWith("TR")&&Iban.replaceAll("\\s", "").length()==26)
		{
			System.out.println("Gonderilicek tutari giriniz");
			gonderilecekTutar= scan.nextDouble();
			
			if(gonderilecekTutar<=bakiye)
			{ 
				bakiye-=gonderilecekTutar;
				System.out.println("Paraniz gonderildi. Mevcut bakiyeniz : "+ bakiye);
				
			}else
			{
				System.out.println("Yetersiz bakiye...");
			}
			
		}
		else
		{
			System.out.println("Gecersiz IBAN girdiniz");
		}
	
	}
	private static void sifreDegistirme()
	{
		Scanner scan= new Scanner(System.in);
		String mevcutSifre;
		System.out.println("Mevcut sifrenizi giriniz");
		mevcutSifre=scan.next();
		
		if(mevcutSifre.equals(sifrem))
		{
			System.out.println("Yeni sifreyi giriniz");
			sifrem=scan.next();
			System.out.println("Sifreniz degistirildi.");
		}
		else
		{
		 System.out.println("Sifreler uyusmuyor");
		}
		
	}
}
