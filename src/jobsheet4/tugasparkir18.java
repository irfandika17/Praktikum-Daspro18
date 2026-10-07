package jobsheet4;

import java.util.Scanner;

public class tugasparkir18 {

public static void main(String[] args) {

    //scanner
    Scanner Tezzar = new Scanner (System.in);

    //input
    System.out.println("lama parkir/jam");
    int lamaparkir = Tezzar.nextInt();
    int tarifparkir;

    //pemilihan
    if (lamaparkir > 2) {
        tarifparkir = 2000 + (lamaparkir - 2) *1000;

    }
    else {
        tarifparkir = 2000;

    }

    System.out.println("tarif parkir : Rp" + tarifparkir );

    Tezzar.close();


}
    
}
