package pl.developerpi91.equalsAndHash;

public class Human {
	private final String name;
	private final String surname;
	private final int pesel;
	
	public Human(String name, String surname, int pesel) {
		this.name = name;
		this.surname=surname;
		this.pesel=pesel;
	}
	public int getPesel() {
		return pesel;
	}
	public static void main(String[] args) {
		Human human1 = new Human("name", "surname", 1234);
		Human human2 = new Human("name2", "surname2", 12344);
		Human human3 = new Human("name", "surname", 1234);
		System.out.println(human1.equals(human2));
		System.out.println(human1.equals(human3));
		System.out.println(human2.equals(human3));



	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pesel;
		return result;
	}

	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (!(obj instanceof Human))
			return false;
		Human other = (Human) obj;

		return pesel == other.getPesel();
	}
//

}
