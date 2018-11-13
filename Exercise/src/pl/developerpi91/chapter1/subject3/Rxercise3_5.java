package pl.developerpi91.chapter1.subject3;

public class Rxercise3_5 {
	
	private static final String text = "programowanie";
	
	private static char[] textArray = text.toCharArray();
	private static final char[] tempArray = text.toCharArray();
	public static void main(String[] args) {

//		//Method 1
//		for(int i=0;i<text.length();i++) {
//			textArray[i] = tempArray[text.length()-i-1];
//			System.out.print(textArray[i]);
//		}
		
		//Method 2
		for (int i=0; i<(text.length()/2);i++) {
			char temp;
			
			temp=textArray[i];
			textArray[i]=textArray[text.length()-1-i];
			textArray[text.length()-1-i] = temp;	
			
		}
		for(char element:textArray) {
			System.out.print(element);
		}
	}
	

}
