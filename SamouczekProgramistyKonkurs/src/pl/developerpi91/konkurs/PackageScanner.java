package pl.developerpi91.konkurs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageScanner {
    List<Pack> packageList = new ArrayList<>();

    public PackageScanner(){
        final String pathToPackageInputData = "src\\pl\\developerpi91\\konkurs\\InputPackagesData.txt";
        String currentPackage;
        int[] packageSize = new int[3];
        try{
            Scanner sc = new Scanner(new File(pathToPackageInputData));

            while(true){
                currentPackage=sc.next();
                if(currentPackage != null){
                    packageSize[0]=Integer.parseInt(currentPackage.split("x")[0]);
                    packageSize[1]=Integer.parseInt(currentPackage.split("x")[1]);
                    packageSize[2]=Integer.parseInt(currentPackage.split("x")[2]);
                    Pack pack = new Pack(packageSize[0],packageSize[1],packageSize[2]);
                    packageList.add(pack);
                }else{
                    break;
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
