package pl.developerpi91.ObjektyIPakiety;

public class Human {

	private int age;
	private double weight;
	private double height;
	private String name;
	private String male;
	
	public Human(int age, double weight, double height, String name, String male) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.male = male;
	}
	
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public String getMale() {
		return male;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMale(String male) {
		this.male = male;
	}

	
}
