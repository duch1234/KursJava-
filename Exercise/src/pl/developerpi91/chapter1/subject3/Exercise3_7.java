package pl.developerpi91.chapter1.subject3;

public class Exercise3_7 {

	private static char[] table = new char[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0-9 in ASCI 48 to 57
		for (int i=0;i<table.length;i++ ) {
			table[i] = (char)(48 + i);
			System.out.println(table[i]);
			
		}
	}

}
