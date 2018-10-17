package pl.developerpi91.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class ArraysMethod {
	
	int [] arrayTwoElements = new int [2];
	int [] arrayThreeElements = new int [3];

	public boolean getElementsForArray(int arrayDimension) {
		boolean status=true;


		try{
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			if (arrayDimension==2) {
				System.out.println("2 elemnts array");
				this.arrayTwoElements[0] = Integer.parseInt(bf.readLine());
				this.arrayTwoElements[1] = Integer.parseInt(bf.readLine());

				
			}else if (arrayDimension==3) {
				System.out.println("3 elemnts array");
				this.arrayThreeElements[0] = Integer.parseInt(bf.readLine());
				this.arrayThreeElements[1] = Integer.parseInt(bf.readLine());
				this.arrayThreeElements[2] = Integer.parseInt(bf.readLine());


			}else {
				status=false;
				System.out.println("Illegal length of array was chosen");

			}

		}catch(Exception e) {
			System.out.println("Error occurs: "  + e );
			status=false;
		}
		return status;
		}
		
	public int sumTwoElementsArray() {
		
		return this.arrayTwoElements[0]+arrayTwoElements[1];
	}
	public int maxFromThreeElementsArray() {
		
		int grater = Math.max(this.arrayThreeElements[0], this.arrayThreeElements[1]);
		
		 
		return Math.max(grater, this.arrayThreeElements[2]);
	}
	
}
