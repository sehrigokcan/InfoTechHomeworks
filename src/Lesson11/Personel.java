package Lesson11;

public class Personel {
int id;
String isim;
String soyIsim;
String adres;
String telefon;
static int deger=10000;

public int idAtama() {
	this.id=deger++;
	return this.id++;
}

}
