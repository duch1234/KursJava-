package pl.developrpi91.tablice;

import java.util.Scanner;
import java.lang.Math;
public class Tablice {
/*
 * 
    Napisz metodê, która zwróci tablicê String[] zawieraj¹c¹ pierwsze 5 liter alfabetu,
    Napisz metodê pobieraj¹c¹ trójelementow¹ tablicê liczb, która zwróci tablicê zawieraj¹c¹ te same elementy w odwróconej kolejnoœci

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
