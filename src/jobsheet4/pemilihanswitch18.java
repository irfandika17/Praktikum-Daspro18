package jobsheet4;

import java.util.Scanner;

public class pemilihanswitch18 {

public static void main(String[] args) {

    // scanner
    Scanner Tezzar = new Scanner (System.in);

    // variabel
    System.out.println("--- cetak KRS siakad ---");
    System.out.println("--- masukkan semester ini ---");
    int semester = Tezzar.nextInt();

    //pemilihan
    switch (semester) {
        case 1:
            System.out.println(" KRS semester 1 ditampilkan");
            break;
        case 2:
            System.out.println(" KRS semester 2 ditampilkan");
            break;
        case 3:
            System.out.println(" KRS semester 3 ditampilkan");
            break;
        case 4:
            System.out.println(" KRS semester 4 ditampilkan");
            break;
        case 5:
            System.out.println(" KRS semester 5 ditampilkan");
            break;
        case 6:
            System.out.println(" KRS semester 6 ditampilkan");
            break;
        case 7:
            System.out.println(" KRS semester 7 ditampilkan");
            break;
        case 8:
            System.out.println(" KRS semester 8 ditampilkan");
            break;

        default :
            System.out.println("semester tidak valid");
    
    }
    
    Tezzar.close();
    
}
    
}
