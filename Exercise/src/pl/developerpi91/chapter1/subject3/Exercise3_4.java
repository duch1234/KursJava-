package pl.developerpi91.chapter1.subject3;

public class Exercise3_4 {
	
	private static final String text = "programowanie";
	private static char[] textArray = text.toCharArray();

	public static void main(String[] args) {
		for (int i=text.length()-1;i>=0;i--) {
			System.out.print(textArray[i]);
		}
	}

}
