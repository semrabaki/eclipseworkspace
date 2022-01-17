package kiyapyonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {

	
	static List<Kitap>kitapListe= new ArrayList<>();

	
	public static void main(String[] args) {
		 kitapMethod.kitaplarEKle(kitapListe);
      kitapMethod.menu(kitapListe);  //classsalr arasi iliski ya object create ederiz yada extend ederiz yada staticse class name ile cagiriirz
	
	
	}
	

}
