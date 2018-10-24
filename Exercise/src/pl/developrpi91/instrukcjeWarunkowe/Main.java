package pl.developrpi91.instrukcjeWarunkowe;

import java.util.Scanner;
public class Main {
/*
 * 
1.    Utwórz metodê pobieraj¹c¹ dodatni¹ liczbê ca³kowit¹ X, która wyœwietli na ekranie liczby od zera do X,
2.    Jeœli w zadaniu 1. u¿y³eœ pêtli for przerób tê metodê na while (lub odwrotnie),
3.    Napisz klasê ArrayFactory, która w konstruktorze pobierze liczbê ca³kowit¹ X wiêksz¹ od zera. Klasa powinna mieæ 2 metody:
4.    int[] oneDimension - zwróci instancjê tablicy jednowymiarowej o d³ugoœci X,
5.    int[][] twoDimension - zwróci instacjê tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa siê X,
6.    Utwórz metodê, która pobierze liczbê i wypisze ka¿dy znak w osobnej linii zaczynaj¹c od ostatniej cyfry (np. dla liczby 123 bêd¹ to trzy linie z 3, 2 i 1),
7.    Utwórz metodê, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument. Na przyk³ad “pies” przekszta³ci w “seip”,
8.    Utwórz metodê, która pobierze liczbê oraz zwróci j¹ w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.). System binarny opisa³em w osobnym artykule,
9.    Utwórz metodê, pobieraj¹c¹ ³añcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem (to samo czytane “od przodu i od ty³u”) jednak “kotek” ju¿ nie. Mo¿e przydaæ Ci siê metoda String#toCharArray
10.    Do klasy ArrayFactory dodaj metodê zwracaj¹c¹ macierz jednostkow¹ (jedynki “na przek¹tnej”),
11.    Napisz metodê, która pobierze tablicê liczb ca³kowitych i wyœwietli j¹ w postaci “[liczba, liczba, liczba]”,
12.    Napisz metodê, która pobierze tablicê liczb ca³kowitych i posortuje j¹ w kolejnoœci od najmniejszej do najwiêkszej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie b¹belkowe.

 */
	public static void main(String[] args) {
		displayIntegers();
		displayIntegers2();

		//TODO to be continued...
	
	
	}
	
	public static void displayIntegers() {
		int liczba;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		
			try {
				liczba =sc.nextInt();
				sc.close();
				break;
			}catch(java.util.InputMismatchException e){
				System.out.println(e);
				System.out.println("Podano nie dozowlone znaki " + sc.nextLine());
				System.out.println("Musisz podaæ liczbê ca³kowit¹");	
			}
		}
		for (int i=0;i<=liczba;i++) {
			System.out.println(i);
		}
	}
	public static void displayIntegers2() {
		int liczba;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		
			try {
				liczba =sc.nextInt();
				sc.close();
				break;
			}catch(java.util.InputMismatchException e){
				System.out.println(e);
				System.out.println("Podano nie dozowlone znaki " + sc.nextLine());
				System.out.println("Musisz podaæ liczbê ca³kowit¹");	
			}
		}
		int i=0;
		while (i<=liczba) {
			System.out.println(i);
			i++;
		}
	}

}
