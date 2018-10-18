package pl.developerpi91.typyProste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numberOfClasses = 3;
		int numberOfNotes = 4;
	
		int[][] userNotes = new int[numberOfClasses][numberOfNotes];
		
		for(int i=0;i<numberOfClasses;i++) {
			for (int j=0;j<numberOfNotes;j++) {
				userNotes[i][j] = getNotes();
//				System.out.println(userNotes[i][j]);
			}
		}
		avgFromClass(userNotes);
	
	}
	
	
	public static int getNotes() {
		Scanner inputNotes = new Scanner(System.in);
		return 	inputNotes.nextInt();
		
	}
	
	public static void avgFromClass(int[][] notes) {
		int sum=0;
		for(int row=0;row<notes.length;row++) {
			for(int column=0;column<notes[row].length;column++) {
				sum = sum + notes[row][column];

			}
			int[] sumaZPrzedmiotu = new int[notes.length];
			Double[] sredniaZPrzedmiotu = new Double[notes[row].length];

			sumaZPrzedmiotu[row]=sum;
			sredniaZPrzedmiotu[row]=(double)(sumaZPrzedmiotu[row])/notes[row].length;
	
			System.out.println("suma z przedmiotu: " + row + " wynosi " + sumaZPrzedmiotu[row] );
			System.out.println("suma z przedmiotu: " + row + " wynosi " + sredniaZPrzedmiotu[row] );

			sum=0;
		}
		
	}
	
	
	

}
