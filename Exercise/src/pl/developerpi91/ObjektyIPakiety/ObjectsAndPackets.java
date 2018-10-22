package pl.developerpi91.ObjektyIPakiety;
import pl.developerpi91.ObjektyIPakiety.*;
/*
 * 
    Utw�rz klas� Human reprezentuj�c� cz�owieka, musi posiada� atrybuty takie jak wiek, waga, wzrost, imi� i p�e�. Klasa powinna tak�e zawiera� metody getAge, getWeight, getHeight, getName, isMale.
    Utw�rz klas� reprezentuj�c� prostok�t, musi posiada� atrybuty d�ugo�� i szeroko��. Klasa powinna posiada� metody obliczaj�ce pole, obw�d i d�ugo�� przek�tnej.
    Utw�rz klas� o nazwie MyNumber, kt�rej jedyny konstruktor przyjmuje liczb�. Klasa powinna mie� nast�puj�ce metody
    MyNumber isOdd() - true je�li atrybut jest nieparzysty,
    MyNumber isEven() - true je�li atrybut jest parzysty,
    MyNumber sqrt() - pierwiastek z atrybutu,
    MyNumber pow(MyNumber x) - atrybut podniesiony do pot�gi x (przydatnej metody poszukaj w javadoc do klasy Math),
    MyNumber add(MyNumber x) - zwraca sum� atrybutu i x opakowan� w klas� MyNumber,
    MyNumber subtract(MyNumber x) - zwraca r�nic� atrybutu i x opakowan� w klas� MyNumber.

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
		System.out.println("OBW�D: " + prostokat.liczObwod());
		System.out.println("POLE: " + prostokat.liczPole());
		System.out.println("PRZEKatna: " + prostokat.liczPrzekatna());

		MyNumber myNumber = new MyNumber(4);
		
		System.out.println(myNumber.add(2));
		System.out.println(myNumber.idEven());
		System.out.println("ODD " + myNumber.isOdd());
		System.out.println(myNumber.substract(2));
		



	}

}
