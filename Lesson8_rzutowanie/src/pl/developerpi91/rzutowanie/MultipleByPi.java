package pl.developerpi91.rzutowanie;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;
public class MultipleByPi {
	Scanner sc = new Scanner(System.in);
	private int inputValue;
	private int inputValue2;
	public int getInputValue() {
		int input;
		while(true) {
			try {
					input = sc.nextInt();
					break;
			} catch (InputMismatchException e) {
				System.out.println("Input value is not integer");
				sc.next();
			}		
	}
		return input;
	}
	public void multipleByPi() {
		int resultInt = this.inputValue * (int)Math.PI;
		double resultDouble =this.inputValue * Math.PI;
		System.out.println(resultInt);
		System.out.println(resultDouble);
	}
	public void divide() {
		System.out.println(inputValue);
		System.out.println(inputValue2);

		System.out.println((double)inputValue/(double)inputValue2);
	}
	public void run() {
		this.inputValue=getInputValue();
		multipleByPi();
	}
	public void run2() {
		this.inputValue=getInputValue();
		this.inputValue2=getInputValue();
		divide();
	}
	
}
