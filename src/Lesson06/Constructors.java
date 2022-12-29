package Lesson06;

import java.util.Scanner;

public class Constructors {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Product3 u kullanicidan almak icin tanimlandi
		
		//Product1; Product classindan uretildi.
		Product product1 = new Product();
		product1.name = "Hp";
		product1.id = 100;
		product1.islemci = "i7";
		product1.ekranBoyutu = "15";
		product1.stokMiktari = 100;
		product1.fiyat = 650;
		System.out.println("Girilen urunun ismi : " + product1.name);
		
		//Product2 girdigimiz parametreli constructor sayesinde ayni satira yazdik.
		Product product2 = new Product("Lenovo", 200, "i5", "13", 200, 350);
		System.out.println("Urun ismi= " + product2.name + "urun fiyati " +" " + product2.fiyat);
		
		//Product3 kullanicidan veri alinarak girildi.
		Product product3 = new Product();
		System.out.println("Urunun name ni giriniz : ");
		product3.name = scan.nextLine();	
		System.out.println("Urunun id giriniz : ");
		product3.id = scan.nextInt();
		
		
		
		Araba araba1 = new Araba();
		araba1.id=1;
		araba1.model=20;
		araba1.motor="1.5";
		araba1.name="Audi";
		araba1.vites="otomatik";
		araba1.yakit="benzin";
		
		//Buraya 5 tane farkli araba nesnesi uretiniz.
		
		Araba araba2=new Araba("Ford",2,9,"1.0","otomatik","hybrid");
		Araba araba3=new Araba("Toyota",3,4,"1.5","manuel","benzin");
		Araba araba4=new Araba("Citroen",4,9,"1.0","otomatik","dizel");
		Araba araba5=new Araba("Tesla",5,9,"2.0","manuel","benzin");


	}

}