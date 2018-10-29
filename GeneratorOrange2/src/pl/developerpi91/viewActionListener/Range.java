package pl.developerpi91.viewActionListener;

public class Range {
	private final int LOW;
	private final int HIGH;
	
	public Range(int low, int high) {
		 this.LOW = low;
		 this.HIGH = high;
	 }

	public boolean isInRange(int inputValue) {
		return (this.LOW<=inputValue & inputValue<=this.HIGH);	
	}
}
