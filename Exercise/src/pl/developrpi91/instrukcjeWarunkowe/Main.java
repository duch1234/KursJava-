package pl.developrpi91.instrukcjeWarunkowe;

import java.util.Scanner;
public class Main {
/*
 * 
1.    Utw�rz metod� pobieraj�c� dodatni� liczb� ca�kowit� X, kt�ra wy�wietli na ekranie liczby od zera do X,
2.    Je�li w zadaniu 1. u�y�e� p�tli for przer�b t� metod� na while (lub odwrotnie),
3.    Napisz klas� ArrayFactory, kt�ra w konstruktorze pobierze liczb� ca�kowit� X wi�ksz� od zera. Klasa powinna mie� 2 metody:
4.    int[] oneDimension - zwr�ci instancj� tablicy jednowymiarowej o d�ugo�ci X,
5.    int[][] twoDimension - zwr�ci instacj� tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn r�wna si� X,
6.    Utw�rz metod�, kt�ra pobierze liczb� i wypisze ka�dy znak w osobnej linii zaczynaj�c od ostatniej cyfry (np. dla liczby 123 b�d� to trzy linie z 3, 2 i 1),
7.    Utw�rz metod�, kt�ra jako argument pobierze obiekt klasy String i zwr�ci �odwr�cony� argument. Na przyk�ad �pies� przekszta�ci w �seip�,
8.    Utw�rz metod�, kt�ra pobierze liczb� oraz zwr�ci j� w formie binarnej (2 => �10�, 4 => �100�, 5 => �101�, itd.). System binarny opisa�em w osobnym artykule,
9.    Utw�rz metod�, pobieraj�c� �a�cuch znak�w, kt�ra sprawdzi czy jest on palindromem. Np. �kajak� jest palindromem (to samo czytane �od przodu i od ty�u�) jednak �kotek� ju� nie. Mo�e przyda� Ci si� metoda String#toCharArray
10.    Do klasy ArrayFactory dodaj metod� zwracaj�c� macierz jednostkow� (jedynki �na przek�tnej�),
11.    Napisz metod�, kt�ra pobierze tablic� liczb ca�kowitych i wy�wietli j� w postaci �[liczba, liczba, liczba]�,
12.    Napisz metod�, kt�ra pobierze tablic� liczb ca�kowitych i posortuje j� w kolejno�ci od najmniejszej do najwi�kszej liczby. Jednym z podstawowych algorytm�w sortowania jest sortowanie b�belkowe.

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
				System.out.println("Musisz poda� liczb� ca�kowit�");	
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
				System.out.println("Musisz poda� liczb� ca�kowit�");	
			}
		}
		int i=0;
		while (i<=liczba) {
			System.out.println(i);
			i++;
		}
	}

}
