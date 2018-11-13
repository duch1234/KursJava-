package pl.developerpi91.chapter1.subject3;

public class Exercise3_2 {

	private static final String text  = "Informatyka";
	
	public static void main(String[] args) {

		for (char element:text.toCharArray()) {
			Character.toUpperCase(element);
		}
		for (char element:text.toCharArray()) {
			System.out.print(" " + element);
		}
		System.out.println();
		for (char element:(text.toUpperCase()).toCharArray()) {
			System.out.print(element);
			// the second method is used character.toLowwercase(element)
		}
		System.out.println();
		for (char element:(text.toLowerCase()).toCharArray()) {
			System.out.print(element);
		}
		
		
	}

}
