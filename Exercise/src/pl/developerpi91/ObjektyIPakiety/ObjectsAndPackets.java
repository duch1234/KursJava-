package pl.developerpi91.ObjektyIPakiety;
import pl.developerpi91.ObjektyIPakiety.*;
/*
 * 
    Utwórz klasê Human reprezentuj¹c¹ cz³owieka, musi posiadaæ atrybuty takie jak wiek, waga, wzrost, imiê i p³eæ. Klasa powinna tak¿e zawieraæ metody getAge, getWeight, getHeight, getName, isMale.
    Utwórz klasê reprezentuj¹c¹ prostok¹t, musi posiadaæ atrybuty d³ugoœæ i szerokoœæ. Klasa powinna posiadaæ metody obliczaj¹ce pole, obwód i d³ugoœæ przek¹tnej.
    Utwórz klasê o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbê. Klasa powinna mieæ nastêpuj¹ce metody
    MyNumber isOdd() - true jeœli atrybut jest nieparzysty,
    MyNumber isEven() - true jeœli atrybut jest parzysty,
    MyNumber sqrt() - pierwiastek z atrybutu,
    MyNumber pow(MyNumber x) - atrybut podniesiony do potêgi x (przydatnej metody poszukaj w javadoc do klasy Math),
    MyNumber add(MyNumber x) - zwraca sumê atrybutu i x opakowan¹ w klasê MyNumber,
    MyNumber subtract(MyNumber x) - zwraca ró¿nicê atrybutu i x opakowan¹ w klasê MyNumber.

 */
public class ObjectsAndPackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human ja = new Human(1, 21.5, 175.5, "Pawel", "M");
		
		System.out.println("AGE: " + ja.getAge());
		System.out.println("HEIGHT: "+ ja.getHeight());
		System.out.println("WEIHGT: " + ja.getWeight());
		System.out.println("MALE: " + ja.getMale());
		System.out.println("NAME: " + ja.getName());


		
		Prostokat prostokat = new Prostokat(1, 2);
		System.out.println("OBWÓD: " + prostokat.liczObwod());
		System.out.println("POLE: " + prostokat.liczPole());
		System.out.println("PRZEKatna: " + prostokat.liczPrzekatna());

		MyNumber myNumber = new MyNumber(4);
		
		System.out.println(myNumber.add(2));
		System.out.println(myNumber.idEven());
		System.out.println("ODD " + myNumber.isOdd());
		System.out.println(myNumber.substract(2));
		



	}

}
