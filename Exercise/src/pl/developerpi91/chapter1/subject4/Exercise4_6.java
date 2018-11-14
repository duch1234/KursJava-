package pl.developerpi91.chapter1.subject4;

public class Exercise4_6 {

	private static String text = "programowanie";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text2="";
		for(int i=text.length()-1;i>=0;i--) {
			text2 =text2 + text.charAt(i);
			System.out.println(text2);
		}
	}

}
