package emlak;

import java.util.Scanner;

public class Emlak {
	
	
	public int  listeNo=99;
	public String evTipi;
	public String il;
	public int odaSayisi;
	private double fiyat;
	public String stokDurumu;
	public int getListeNo() {
		return listeNo;
	}
	public void setListeNo(int listeNo) {
		listeNo = listeNo;
	}
	public String getEvTipi() {
		return evTipi;
	}
	public void setEvTipi(String evTipi) {
		this.evTipi = evTipi;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public int getOdaSayisi() {
		return odaSayisi;
	}
	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public String getStokDurumu() {
		return stokDurumu;
	}
	public void setStokDurumu(String stokDurumu) {
		this.stokDurumu = stokDurumu;
	}
	public Emlak() {
		
	}
	public Emlak(int listeNo, String evTipi, String il, int odaSayisi, double fiyat, String stokDurumu) {
		
		listeNo = listeNo++;
		Scanner scan= new Scanner(System.in);
		System.out.println("Ev Tipi");
		this.evTipi = scan.next();
		
		System.out.println("Il");
		this.il =scan.next();
		
		System.out.println("Oda SAyisi");
		this.odaSayisi = scan.nextInt();
	
		System.out.println("Fiyat");
		this.fiyat = scan.nextDouble();
		
		System.out.println("Stok Durumu");
		this.stokDurumu = scan.next();
	
	}
	
	public void ListeleEmlak() {
		System.out.println( "\nlisteNo=" + listeNo + "\nevTipi=" + evTipi + "\n=" + il + "\nodaSayisi=" + odaSayisi
				+ "\nfiyat=" + fiyat + "\nstokDurumu=" + stokDurumu);
	}
	
	
	
	
	
	
	
	
	
	

}
