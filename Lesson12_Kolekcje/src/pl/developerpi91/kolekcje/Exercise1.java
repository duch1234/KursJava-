package pl.developerpi91.kolekcje;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        Set<String> nameList = new HashSet<>();
        String currnetName;
        while (true){
            currnetName = inputName.nextLine();
            if(!currnetName.equals("-")){
                nameList.add(currnetName);
            }else {
                break;
            }
        }
        System.out.println(nameList);
    }
}
