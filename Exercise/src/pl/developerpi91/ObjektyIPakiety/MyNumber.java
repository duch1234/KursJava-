package pl.developerpi91.ObjektyIPakiety;
import java.lang.Math;
public class MyNumber {
	private double liczba;
	
	public MyNumber(double a) {
		this.liczba = a;
	}
	
	public boolean isOdd() {
		return (this.liczba%2 == 0);
	}
	public boolean idEven() {
		boolean status;
		if (this.liczba%2 == 0) {
			status =false;
		}else {
			status=true;
		}
		
		return status;
	}
	
	public double square() {
		return Math.sqrt(this.liczba);
	}
	public double add(double a) {
		return this.liczba + a ;
	}
	public double substract(double a) {
		return this.liczba-a;
	}
}


