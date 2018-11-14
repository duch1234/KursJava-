package pl.developerpi91.chapter1.subject4;

public class Exercise4_4 {

	private static String text = "programowanie";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text2 =text.toUpperCase().charAt(0)+text.substring(1, text.length());
		System.out.println(text2);
		
		String text3 = text.toUpperCase();
		System.out.println(text3);
	}

}
