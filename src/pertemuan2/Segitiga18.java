package pertemuan2;

import java.util.Scanner;

public class Segitiga18 {
    public static void main( String [] args){

        //deklarasi scanner
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        //input
        System.out.println(" masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("masukkan tinggi");
        tinggi = sc.nextInt();

        //proses
        luas = alas * tinggi / 2;

        //ouput
        System.out.println(" luas segitiga: " + luas);

        sc.close();
    }
    
}
