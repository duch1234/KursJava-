package pl.developerpi91.metody;

import java.lang.Math;
public class Metody {
	
	/*
	 * 
    1. Napisz metodê, która zwróci Twój aktualny wiek.
    2. Napisz metodê, która zwróci Twoje imiê,
    3. Napisz metodê, która jako argument przyjmuje 2 liczby i wypisuje ich sumê, ró¿nicê i iloczyn,
    4. Napisz metodê, która jako argument przyjmuje liczbê i zwraca true jeœli liczba jest parzysta,
    5. Napisz metodê, która jako argument przyjmuje liczbê i zwraca true jeœli metoda jest podzielna przez 3 i przez 5,
    6. Napisz metodê, która jako argument przyjmuje liczbê i zwraca go podniesionego do 3 potêgi,
    7. Napisz metodê, która jako argument przyjmuje liczbê i zwraca jej pierwiastek kwadratowy (poczytaj javadoc do klasy Math, znajdziesz tam metodê, która na pewno Ci pomo¿e),
    8. Napisz metodê, która jako argument przyjmie trzy liczby. Metoda powinna zwróciæ true jeœli z odcinków o d³ugoœci przekazanych w argumentach mo¿na zbudowaæ trójk¹t prostok¹tny.

	 */

	
	static int age() {
		return 27;
	}
	static String name() {
		return "Pawel";
		
	}
	
	static int suma(int a, int b) {
		return a+b;		
	}
	static boolean isOddy(double a) {
		boolean status;
		if (a%2==0) {
			status=true;
		}else {
			status=false;
		}
		return status;
	}
	
	static boolean isDivorcedByThreeAndFive(int a) {
		boolean status;
		
		if (a%3 == 0 && a%5 == 0) {
			status = true;
			
		}else {
			status=false;
		}
		return status;
	}
	
	static double powerThree(double a){
		double powerTo=3;
		System.out.println("Potêga do 3:" +  Math.pow(a,powerTo));
		return a*a*a;
		
	}
	static double square(double a) {
		return Math.sqrt(a);
	}
	
	static boolean isPossibleToBuildTrianlge(double a, double b, double c) {
		boolean status;
		
		if(a + b >= c) {
			status=true;
			
		}else {
			status=false;
		}
		
		return status;
	}
	
	
	public static void main(String[] args) {
		System.out.println(age());
		System.out.println(name());
		System.out.println(suma(5,4));
		System.out.println(isOddy(4));
		System.out.println(isOddy(5));
		System.out.println(isDivorcedByThreeAndFive(5));
		System.out.println(isDivorcedByThreeAndFive(15));
		System.out.println(powerThree(3));
		System.out.println(square(4));
		System.out.println(square(2));
		System.out.println(isPossibleToBuildTrianlge(1,2,3));
		System.out.println(isPossibleToBuildTrianlge(1,1,3));


	}

}