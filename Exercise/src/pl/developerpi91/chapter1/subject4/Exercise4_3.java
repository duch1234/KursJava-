package pl.developerpi91.chapter1.subject4;

public class Exercise4_3 {
	private static final String text = "Dzieñ Dobry";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;text.length()>i;i++) {
			System.out.println(text.charAt(i));
		}
		for(int i=0;text.length()>i;i++) {
			System.out.print(text.charAt(i)+" ");
		}
		
		System.out.println();

		for(int i=0;text.length()>i;i++) {
			
			System.out.print(text.toUpperCase().charAt(i)+" ");
		}
		
		System.out.println();
		
		for(int i=0;text.length()>i;i++) {
			
			System.out.print(text.toLowerCase().charAt(i)+" ");
		}
		
	}

}
