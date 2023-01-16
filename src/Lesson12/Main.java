package Lesson12;

public class Main {

	public static void main(String[] args) {
		
		Calisan a1= new Asistan("Ahmet","055665787","a@gmail.com",1000.000,"CENG","Asistan","Matematik","Mat Yuksek Lisans");
		
		Calisan o1= new Ogretmen("Mehmet","055545787","m@gmail.com",1000.000,"BILG","Hoca","Kimya","Docent");

		Calisan a2= new Akademisyen("Elif","055665667","e@gmail.com",1000.000,"ALG","Hoca","Algoritma");
	
	
		Calisan[] girisListesi= {a1,o1,a2};
		Calisan[] cikisListesi= {a1,o1};

		
		Calisan.listeleGiris(girisListesi);
		Calisan.listeleCikis(cikisListesi);

		
		Calisan[] maaslar= {a1,o1,a2};
		
		for (Calisan w: maaslar) {
			
			System.out.println(w.zamYap(w.maas));
		}
		
	}

}
