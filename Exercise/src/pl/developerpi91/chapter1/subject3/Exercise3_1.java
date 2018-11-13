package pl.developerpi91.chapter1.subject3;

public class Exercise3_1 {
	
	
	public  final String hello = "Dzien dobry";
	
	public static void main(String[] args) {
		Exercise3_1 run = new Exercise3_1();
		
		System.out.println(run.hello.toCharArray());
		for (char element:run.hello.toCharArray()) {
			System.out.println(element);
		}
	}

}
