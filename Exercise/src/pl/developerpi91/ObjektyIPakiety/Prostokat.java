package pl.developerpi91.ObjektyIPakiety;

import java.lang.Math;
public class Prostokat {
	private double widith;
	private double height;
	
	public double liczObwod() {
		return 2*this.widith + 2*this.height;
	}
	public double liczPole() {
		return this.height * this.widith;
	}
	public double liczPrzekatna() {
		 System.out.println(Math.pow(this.height, 2)+ Math.pow(this.widith, 2));
//		return (float)(Math.sqrt((Math.pow(this.height, 2)+ Math.pow(this.widith, 2))));
		return (Math.sqrt((Math.pow(this.height, 2)+ Math.pow(this.widith, 2))));
	}
	public Prostokat(double widith, double height) {
		this.widith = widith;
		this.height = height;
	}
	
}
