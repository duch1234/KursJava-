package pl.developrpi91.tablice;

import java.util.Scanner;
import java.lang.Math;
public class Tablice {
/*
 * 
    Napisz metod�, kt�ra zwr�ci tablic� String[] zawieraj�c� pierwsze 5 liter alfabetu,
    Napisz metod� pobieraj�c� tr�jelementow� tablic� liczb, kt�ra zwr�ci tablic� zawieraj�c� te same elementy w odwr�conej kolejno�ci

 */
	public static void main(String[] args) {

		
//		alphabet();
		reverse();
			
		}
	public static String[] alphabet() {
		String [] tablica = new String[]{"a","b","c","d"};
		
		for (String element : tablica) {
			System.out.println(element);
		}	
		return tablica;
		
	}
	public static int[] reverse() {
		int[] tablica = new int[3];
		int[] nowaTablica =new int[tablica.length];

		Scanner sc = new Scanner(System.in);


						
			for (int i = 0;i<tablica.length;) {
				try {
					tablica[i]=sc.nextInt();
					i++;
				}			
				catch(java.util.InputMismatchException  e) {
					sc.nextLine();
					System.out.println("You must enter the port as a number");
				}				
			}
			
		sc.close();
		
		
		for (int j=tablica.length-1;j>=0;j--) {
			
			System.out.println(tablica[j]);
			nowaTablica[tablica.length-1-j] = tablica[j];
			System.out.println(nowaTablica[tablica.length-1-j]);
		}
		for (int element : nowaTablica) {
			System.out.println(element);
		}	
		
		return nowaTablica;
		
	

	}

}
