package pl.developerpi91.konkurs;

/***
 * @author Pawel
 *
 * Exercise
 * Masz do opakowania sporo paczek. Paczki są prostopadłościanami. Wymiary przykładowej paczki mogą wyglądać tak: 2x3x4.
 * Ta paczka ma boki o długości 2, 3 i 4 dm. Pole powierzchni wszystkich boków to 2*6 + 2*12 + 2*8 = 52 dm2. Aby mieć pewność,
 * że nie zabraknie papieru do opakowania każdej paczki musisz dodatkowo dodać powierzchnię jej najmniejszej ściany. W przykładzie powyżej jest to 6 dm2.
 *Zatem do opakowania paczki o wymiarach 2x3x4 potrzebujesz 58 dm2 papieru. Dla innej paczki o wymiarach 1x1x10 będzie to 2*1 + 2*10 + 2*10 + 1 = 43 dm2.
 */

public class Packager {

    public static void main(String[] args) {
        PackageScanner ps = new PackageScanner();
        int paperSize = 0;

        for (Pack packet:ps.packageList) {
            paperSize = packet.computeTotalPackArea() + packet.computeTheLowestPackSide();
        }

        System.out.println("Całkowita ilość potrzbengo papeieru wynosi: " +  paperSize);
    }

}
