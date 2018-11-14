package pl.developerpi91.chapter1.subject3;

public class Exercise3_8 {

	private static char[] table = new char[16];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<table.length;i++) {
			
			table[i] = Character.forDigit(i, 16);
			System.out.println(table[i]);
		}
	}

}
