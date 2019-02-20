package pl.developerpi91.serializacja;

import java.io.*;
import java.util.Calendar;

public class Human implements Serializable {
    private String name;
    private transient int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human1 = new Human("PI",27);

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("human.txt"));
        output.writeObject(human1);

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("human.txt"));
        Human human2;
        human2 = (Human)input.readObject();
        System.out.println(human2.getAge());
        System.out.println(human2.getName());

    }

    private void writeObject(ObjectOutputStream stream) throws IOException{
        stream.defaultWriteObject();
        int humanBirth= Calendar.getInstance().get(Calendar.YEAR) - age;
        stream.writeInt(humanBirth);
        stream.writeInt(5);

    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
        stream.defaultReadObject();
        age = Calendar.getInstance().get(Calendar.YEAR)-stream.readInt();

    }


}
