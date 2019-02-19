package pl.developerpi91.serializacja;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 implements Serializable {


    public static void main(String[] args) {
        String currentName;
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            currentName = sc.nextLine();
            if (!currentName.equals("-")){
                names.add(currentName);
            }else{
                break;
            }
        }
        System.out.println(names);
    }
    public void serialize(){
        //TODO

    }

}
