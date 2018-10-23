package pl.developerpi91.loops;

public class Main {

	public static void main(String[] args) {
//		counterDSC();				// exercise 1
//		displayRange();				// exercise 2
//		dispalyOddNumbers();		// exercise 3
//		dispalyOddNumbers2();		// exercise 4
		int[] array= new int[]{1,2,3};
		int[][] array2= new int[][]{new int[] {1,2,3}, new int[] {1,2,4}};

//		arraySum(array);			// exercise 5
		arraySumTwoDismesnion(array2);	// exercise 6
	}
	
	public static void counterDSC() {
		
		for (int i=20; i>=10; i--) {
			System.out.println(i);
		}
	}
	public static void displayRange() {
		int i=10;
		while(i<=20) {
			
			System.out.println(i);
			i++;
		}
	}
	public static void dispalyOddNumbers() {
		
		for (int i=-10; i<=40;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
	}
		public static void dispalyOddNumbers2() {
			int i=-10;
			while(i<=40) {
				if(i%2!=0) {
					System.out.println(i);
				}
				i++;
		}
			
	}
		public static void arraySum(int[] array) {
			int sum=0;
			for(int a =0; a<array.length;a++) {
				sum=sum+array[a];
			}
			System.out.println(sum);

		}
		public static void arraySumTwoDismesnion(int[][] array) {
			int sum=0;
//			 System.out.println(array.length);			// numbers row
//			 System.out.println(array[0].length);		//numbers columns
			for(int row = 0; row<array.length;row++) {
				for(int column = 0; column<array[row].length;column++ ) {
					sum=sum+array[row][column];
				}
			}
			System.out.println(sum);

		}

}
