package pl.developerpi91.typyNumeryczneEnum;

public class Human {
	private final String name;
	private final int age;
	private final EyeColor eyeColor;
	private final HairColor hairColor;

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Human(String name, int age, EyeColor eyeColor, HairColor hairColor ) {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}
	
	@Override
	public String toString() {
		return (name + " " + age + " " +  eyeColor + " " + hairColor); 
	}
	public  static void main(String[] args) {
		
		Human  human1 = new Human("asd", 15, EyeColor.BROWN , HairColor.BLACK);
		System.out.println(human1);
	}

}
