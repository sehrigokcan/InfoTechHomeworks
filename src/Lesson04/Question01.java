package Lesson04;

public class Question01 {
	// Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” string
	// ifadesini “Java ogrenmek cok guzel.” sekline getirin

	public static void main(String[] args) {

		String str = " Java ogrenmek123 Cok guzel@ ";
		String str2 = str.replaceAll("[0-9]", "").replace('@', '.').
				replace('C', 'c').trim();
		System.out.println(str2);

	}

}
