package market;

import java.util.*;
import java.util.Arrays;

public class MarketRunner {
	
	static List<String> urunler = new ArrayList<>(Arrays.asList("00 Domates", "01 Patates", "02 Biber", "03 Sogan", "04 Havuç", "05 Elma", "06 Muz", "07 Çilek", "08 Kavun", "09 Üzüm", "10 Limon"));
    static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
    static List<String> sepetUrunlerin = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyatlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String devam = "";
		double toplamFiyat=0;
		do {
			urunListesi();
			System.out.print("SEctiginiz urun kodunu giriniz :");
			int urunNo=scan.nextInt();
			System.out.println("Kac kilo alacaksiniz :");
			double kg=scan.nextDouble();
			sepeteEkle(urunNo, kg);
			toplamFiyat=sepetTutari();
			System.out.println("Devam edecekseniz e ye basiniz:");
			devam=scan.next();
			//scan.next();//dummy kukla
			
		}while(devam.equalsIgnoreCase("e"));
		
		odeme(toplamFiyat);

	}

	private static double sepetTutari() {
		double septTutar=0;
		double sptKg=0;
		for(int i=0; i<sepetUrunlerin.size(); i++)
		{
			septTutar+=sepetFiyatlar.get(i);
			sptKg+=sepetKg.get(i);
		}
		
		System.out.println("Toplam odemeniz gereken miktar : "+septTutar+ "aldiginiz urun miktari: "+sptKg);
		
		return septTutar;
		
		
	}

	private static void odeme(double toplamFiyat) {
		System.out.println("Odemeniz gereken miktar :"+toplamFiyat);
		
		double nakit=0;
		do
		{
			System.out.println("Lutfen nakit odemenizi giriniz");
			nakit+=scan.nextDouble();
			if(nakit<toplamFiyat)
			{
				System.out.println("Eksik odeme yaptiniz "+(toplamFiyat-nakit)+ " daha odeme yapiniz");
			}
			
		}while(nakit<toplamFiyat);
		
		double paraUstu=nakit-toplamFiyat;
		if(paraUstu>0)
		{
			System.out.println("Para ustunuz: "+paraUstu);
		}
		System.out.println("Yine bekleriz iyi gunler...");
		
	}

	private static void sepeteEkle(int urunNo, double kg) {
		sepetUrunlerin.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo)*kg);
		
	}

	private static void urunListesi() {
		System.out.println(" No\t Urunler \t Fiyatlar");
        System.out.println("====\t ======== \t =======");
        
        for(int i=0; i<urunler.size(); i++)
        {
        	System.out.println(" "+i+"\t"+urunler.get(i)+"\t"+fiyatlar.get(i));
        }
		
	}

}
