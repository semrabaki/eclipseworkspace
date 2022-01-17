package emlak;

import java.util.*;
import java.util.Scanner;

public class EmlakRunner {
	
	
	static String patronId="1";
	static String patronSifre="1";
    static String calisanId="2";
	static String calisanSifre="2";
	
	static Scanner scan=new Scanner(System.in);
	
	public static int  listeNo;
	public static String evTipi;
	public static String il;
	public static int odaSayisi;
	private static double fiyat;
	public static String stokDurumu;
	
	
	static ArrayList<Emlak> envanter= new ArrayList<>();
	static ArrayList<Emlak> satilanlar= new ArrayList<>();
	
			
			

	public static void main(String[] args) {
		
		
		String sifre="";
		String id="";
		
		boolean girisBasariliMi=true;
		while(girisBasariliMi) {
			
			System.out.println("Hosgeldiniz Sila Emlak ");
			System.out.println("ID:");
			id=scan.next();
			System.out.println("PassWord:");
			sifre=scan.next();
			
			
			if(id.equals(patronId)&&sifre.equals(patronSifre))
			{
				girisBasariliMi=false;
				patron();
			}
			else if(id.equals(calisanId)&&sifre.equals(calisanSifre))
			{
			girisBasariliMi=false;
			 calisan();
			}else
			{
				System.out.println("Giris basarisiz");
			}
		

	}

}




	public static void calisan() {
		
		System.out.println("Gunaydin emekci");
		while(true){
			System.out.println("\n 1-ekle\n2-Listele\3-Cikis   \nSecenek:");
			int secenek=scan.nextInt();
			
			switch(secenek)
			{ case 1:
					
					Emlak emlak1= new Emlak(listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);
					envanter.add(emlak1);
					break;
				case 2:
					break;
				case 3:
					break;
				default:
						break;
			}
			
		}
		
	}




	public static void patron() {
		
		System.out.println("Gunaydin patron");
		while(true)
		{
			System.out.println("\n1-Ekle:\n2-Listele:\n3-Sil \n4Duzenle: \n5Cik \nSecenek");
			int secenek= scan.nextInt();
			switch(secenek)
			{
			case 1:
				Emlak emlak1= new Emlak(listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);
				envanter.add(emlak1);
				break;
			case 2:
				
				
				break;
			case 3:
				System.out.println("Liste noyu gir"); 
				int silinen=scan.nextInt()-100;
				satilanlar.add(envanter.get(silinen));
				envanter.remove(silinen);
				break;
			
			case 4:
				for(int i=0; i<envanter.size(); i++)
				{
					envanter.get(i).ListeleEmlak();
				}
				System.out.println("Hangi urunu duzenlicen");
				int duzenlencek=scan.nextInt()-100;
				
				if(duzenlencek<envanter.size())
				{
					System.out.println("Neyi duzenlicen \n1-ev tipi\n2-il  \n3 -oda sayisi  \n4fiyat  \n5-stokDurumu");
					
					int neyi=scan.nextInt();
					switch(neyi)
					{
					case 1: 
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlencek).setEvTipi(scan.next());
						break;
					case 2:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlencek).setIl(scan.next());
						break;
					case 3: 
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlencek).setOdaSayisi(scan.nextInt());
						break;
					case 4:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlencek).setFiyat(scan.nextDouble());
						break;
					case 5:
						System.out.println("Duzenlemeyi gir");
						envanter.get(duzenlencek).setStokDurumu(scan.next());
						break;
					
					default:
						break;
					
					}
					
				}else
				{
					System.out.println("O kadar mal yokki");
				}
				
				break;
			case 5:
				
				break;
			default:
				
				break;
			}
			
		}
		
	}
}
