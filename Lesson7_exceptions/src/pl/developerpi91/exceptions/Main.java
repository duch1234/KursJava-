package pl.developerpi91.exceptions;
import java.util.InputMismatchException;

import pl.developerpi91.exceptions.ExceptionsSqrt;

public class Main {

	public static void main(String[] args) {
		ExceptionsSqrt exceptionsSqrt = new ExceptionsSqrt();
		
		while(true) {
			try {
				
			exceptionsSqrt.getValue();
			System.out.println(exceptionsSqrt.sqrtResults());
			}
			catch(IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			}
//			catch(InputMismatchException e){
//				System.out.println("Podaj liczbê zamiast znaków");
//				System.out.println(e.getMessage());
//				exceptionsSqrt.sc.next();
//			}
		}
		
	}

}
