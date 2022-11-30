package com.fatih.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fizik,matematik,kimya,turkce,tarih,muzik;
		
		System.out.println("Fizik notunuzu giriniz: ");
		fizik = scan.nextInt();
		
		System.out.println("Matematik notunuzu giriniz: ");
		matematik = scan.nextInt();
		
		System.out.println("Kimya notunuzu giriniz: ");
		kimya = scan.nextInt();
		
		System.out.println("Turkce notunuzu giriniz: ");
		turkce = scan.nextInt();
		
		System.out.println("Tarih notunuzu giriniz: ");
		tarih = scan.nextInt();
		
		System.out.println("Muzik notunuzu giriniz: ");
		muzik = scan.nextInt();
		
		int notToplam = fizik + matematik + kimya + turkce + tarih + muzik;
		double notOrtalama = notToplam/6;
		
		System.out.println("Ortalamaniz: "+notOrtalama);
		
		String str = notOrtalama>=60 ? "Gectiniz" : "Kaldiniz";
		
		System.out.println("sonuc :"+str);
		

	}

}
