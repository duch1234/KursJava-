package pl.developerpi91.operacjaNaPlikach;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        FileReader fr = null;
        Scanner inputPath = new Scanner(System.in);
        String line = null;
        int numberOfLine = 0;

        try {
            fr = new FileReader(inputPath.nextLine());
            br = new BufferedReader(fr);

            line=br.readLine();
            while (line != null){
                numberOfLine++;
                System.out.println(line);
                line=br.readLine();
            }

        }finally {
            if (br!=null){
                br.close();
                System.out.println(numberOfLine);
            }

        }
    }
}
