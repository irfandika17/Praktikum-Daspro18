package belajarquiz;

import java.util.Scanner;

public class menghitungbelajar1 {
    public static void main (String[]args){

        //deklarasi scanner
        Scanner Tezzar = new Scanner (System.in);

        //deklarasi variabel
        double tarifMasuk;
        double tarifPerjam;
        double parkir5jam;
        double totalbiaya;
        int lamaParkir;

        //input
        System.out.println("masukkan tarifMasuk");
        tarifMasuk = Tezzar.nextDouble();
        System.out.println("masukkan tarifPerJam");
        tarifPerjam = Tezzar.nextDouble();
        System.out.println("masukkan Lama Parkir");
        lamaParkir = Tezzar .nextInt();

        
        //proses
       parkir5jam = tarifPerjam*lamaParkir;
       totalbiaya = parkir5jam+tarifMasuk;

       //output
       System.out.println("biaya yang dibayar" + totalbiaya);

       Tezzar.close();



    }
    
}
