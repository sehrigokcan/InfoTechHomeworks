package Lesson06;

public class Product {
	
	
	public Product() {
		//Parametresiz bos constructor
		System.out.println("Yapici blok calisti.");
	}
	
	
	public Product(String name, int numara, String islemciTipi, String ekran, int miktari, double price) {
		//Burasi parametreli constructor
		this.name = name;
		this.id = numara;
		this.islemci = islemciTipi;
		this.ekranBoyutu = ekran;
		this.stokMiktari = miktari;
		this.fiyat = price;
		
		
	}
	
	//Product nesnesinin ozellikleri
	String name;
	int id;
	String islemci;
	String ekranBoyutu;
	int stokMiktari;
	double fiyat;
	
	
	

}