package Lesson11;

public class Muhasebe extends Personel{
int saatlikUcret;
String statu;
double maas;

public double maasHesapla(int saatlikUcret) {
	this.maas= saatlikUcret*8*30;
	return this.maas;
}

}
