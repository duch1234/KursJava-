package pl.developerpi91.exceptions;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsSqrt {

	private int value;	
	public Scanner sc = new Scanner(System.in);
	
	public double sqrtResults() {
		
		return Math.sqrt(this.value);
	}
	
	public void getValue() {
		try {
			this.value = sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Podaj liczbê zamiast znaków");
			System.out.println(e.getMessage());
			sc.next();
		}
		if (this.value<0) {
			throw new IllegalArgumentException("negative number");
		
		}
	}

}
