package Lesson15.Question02;

import java.util.Scanner;

public class OtomobilOlustur implements StandartOzellikler,BenzinMotor, ElektrikMotor, Otomatik, Duz,Optional{
	//standart 
//	int tekerlekSayisi=this.tekerlekSayisi();
//	boolean absFrenSistemi=this.absFrenSistemi();
//	String koltukDoseme=this.koltukDoseme();
//	double bagajHacmi=this.bagajHacmi();
//	boolean iklimlendirme=this.iklimlendirme();
	
	// vites 

	static boolean duzSanziman;
	static boolean duzDiferansiyel;
	
	// benzin/ elektrikli
	static boolean motor;  
	public static boolean elektrikMotor;
	static boolean enjeksiyon;
	static boolean yakitDeposu;
	static boolean regulator;
	static boolean aku;
	
	//optional
	static boolean sunRoof;
	static boolean metalikRenk;
	static boolean bodyKit;
	static boolean celikJant;
	static boolean multimedia;
	



	public OtomobilOlustur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		
		OtomobilOlustur oto1= new OtomobilOlustur();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Otomobil elektrik motorlu mu yoksa benzin motorlu mu olsun?(1-Elektrik/2-Benzin)");
		int secim1= scan.nextInt();
		if (secim1==1) {
			elektrikMotor= true;
			regulator=true;
			aku=true;
		}else if(secim1==2) {
			motor=true;
			enjeksiyon=true;
			yakitDeposu=true;
		}else {
			System.out.println("Yanlis bir secim yaptiniz.. ");
		}
		
		
		System.out.println("Otomobiliniz Otomatik vitesli mi yoksa duz vitesli mi olsun? (1-Otomatik/2-Duz)");
		int secim2= scan.nextInt();
		if (secim2==1) {
			otoSanziman= true;
			otoDiferansiyel=true;
		}else if(secim1==2) {
			duzSanziman=true;
			duzDiferansiyel=true;
		}else {
			System.out.println("Yanlis bir secim yaptiniz.. ");
		}
		
		System.out.println("Sunroof? (1-Evet/2-Hayir)");
		int secim3= scan.nextInt();
		if (secim3==1) {
			sunRoof=true;
		}else if(secim1==2) {
			sunRoof=false;
		}else {
			System.out.println("Yanlis bir secim yaptiniz.. ");
		}
		
		System.out.println("Metalik Renk? (1-Evet/2-Hayir)");
		int secim4= scan.nextInt();
		if (secim4==1) {
			metalikRenk=true;
		}else if(secim1==2) {
			metalikRenk=false;
		}else {
			System.out.println("Yanlis bir secim yaptiniz.. ");
		}
		
		
		System.out.println("Body Kit? (1-Evet/2-Hayir)");
		int secim5= scan.nextInt();
		if (secim5==1) {
			bodyKit=true;
		}else if(secim1==2) {
			bodyKit=false;
		}else {
			System.out.println("Yanlis bir secim yaptiniz.. ");
		}
		
		System.out.println("Celik Jant? (1-Evet/2-Hayir)");
		int secim6= scan.nextInt();
		if (secim6==1) {
			celikJant=true;
		}else if(secim1==2) {
			celikJant=false;
		}else {
			System.out.println("Yanlis bir secim yaptiniz.. ");
		}
		
		System.out.println("Multimedia? (1-Evet/2-Hayir)");
		int secim7= scan.nextInt();
		if (secim7==1) {
			multimedia=true;
		}else if(secim1==2) {
			multimedia=false;
		}else {
			System.out.println("Yanlis bir secim yaptiniz.. ");
		}
		
		
		
	}
	

	@Override
	public int tekerlekSayisi() {

		return 4;
	}

	@Override
	public boolean absFrenSistemi() {
		return true;
		
	}

	@Override
	public String koltukDoseme() {
	 return "Deri";
		
	}

	@Override
	public double bagajHacmi() {
		return 615;
		
	}

	@Override
	public boolean iklimlendirme() {

		return true;
	}
	
	public static void sedanArac() {
		
		
	}
	
	public static void sporArac() {
		
		
	}


	@Override
	public Boolean sunroof() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean metalikRenk() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean bodyKit() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean celikJant() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean multimedia() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean duzSanziman() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean duzDiferansiyel() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean otoSanziman(boolean a) {
		// TODO Auto-generated method stub
		return a;
	}


	@Override
	public Boolean otoDiferansiyel() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean elektrikliMotor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean regulator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean aku() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean motor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean enjeksiyon() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean yakitDeposu() {
		// TODO Auto-generated method stub
		return null;
	}


}
