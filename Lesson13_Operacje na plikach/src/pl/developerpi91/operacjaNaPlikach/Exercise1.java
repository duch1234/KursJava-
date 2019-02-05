package pl.developerpi91.operacjaNaPlikach;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {


    public static void main(String[] args) throws IOException {
        FileWriter fiileWriter = null;
        Scanner input = new Scanner(System.in);
        String line;

        try{
            System.out.println("podaj ścieżkę do pliku");

            String pathToFile = input.nextLine();
            System.out.println(pathToFile);
            fiileWriter = new FileWriter(pathToFile);

            line = input.nextLine();
            while (!line.equals("-")){
                fiileWriter.write(line);
                fiileWriter.write(System.lineSeparator());
                System.out.println(line);
                line=input.nextLine();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (fiileWriter!=null){
                fiileWriter.close();

            }

        }

    }
}
