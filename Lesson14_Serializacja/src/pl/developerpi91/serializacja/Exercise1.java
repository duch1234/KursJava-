package pl.developerpi91.serializacja;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 implements Serializable {


    public static void main(String[] args)  {
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

        try{
            serialize(names);
            deSerialize(names);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void serialize(List<String> names)throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("names.txt"));
        oos.writeObject(names);
    }

    public static void deSerialize(List<String> names)throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("names.txt"));
        List<String> namesReaded = null;
        namesReaded=(List<String>)ois.readObject();
        for (String element:namesReaded) {
            System.out.println("readed element " + element);
        }
        System.out.println(namesReaded);
    }

}
