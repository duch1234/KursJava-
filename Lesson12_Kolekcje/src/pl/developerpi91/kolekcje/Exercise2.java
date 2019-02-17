package pl.developerpi91.kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Map<String, String> pairs = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String currenInputData="";
        String name1;
        String name2;
        while (true){
            currenInputData = input.next();

            if (!currenInputData.equals("-")){
                System.out.println("Podaj imię Partnera");
                name1=input.next();
                System.out.println("Podaj imię Partnerki");
                name2=input.next();

                pairs.put(name1,name2);
            }else{
                break;
            }
            System.out.println("wciśnij - jeśli chcesz zakończyć");

        }
        System.out.println("Podaj imię z danej pary");

        while (true){
            currenInputData = input.next();
            if (!currenInputData.equals("-")){
                System.out.println(pairs.get(currenInputData));

            }else{
                break;
            }

        }
    }
}
