package pl.developerpi91.interfaces;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakuj�c� klas�
        }
        else {
            computation = new Addition(); // zaimplementuj brakuj�c� klas�
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
    	System.out.println("");
        return scanner.nextLine().equals("m"); // tutaj zapytaj u�ytkownika co chce zrobi� (mno�enie czy dodawanie)
    }

    private double getArgument() {
    	System.out.println("podaj liczb�");
        return scanner.nextDouble();  // tutaj pobierz liczb� od u�ytkownika
    }
}
