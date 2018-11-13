package pl.developerpi91.chapter1.subject3;

public class Exercise3_3 {
	
	private static final String text = "programowanie";
	
	public static void main(String[] args) {

		char[] tablica = new char [text.length()];
		tablica = text.toCharArray();
		tablica[0] = Character.toUpperCase(tablica[0]);

		for (char element:tablica) {
			System.out.print(element);
		}
		System.out.println();
		for (char element:tablica) {
			System.out.print(Character.toUpperCase(element));
		}
		System.out.println();
		
		//Second Method
		for (int i=0; i<text.length();i++) {
			tablica[i] =Character.toUpperCase(tablica[i]);
			System.out.print(tablica[i]);
		}
		
	}


}
