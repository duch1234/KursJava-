package pl.developerpi91.rzutowanie;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;
public class MultipleByPi {
	Scanner sc = new Scanner(System.in);
	private int inputValue;
	public void getInputValue() {
		try {
			this.inputValue = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Input value is not integer");
			sc.next();
		}
	}
	public void multipleByPi() {
		int resultInt = this.inputValue * (int)Math.PI;
		double resultDouble =this.inputValue * Math.PI;
		System.out.println(resultInt);
		System.out.println(resultDouble);
	}
	public void run() {
		getInputValue();
		multipleByPi();
	}
}
