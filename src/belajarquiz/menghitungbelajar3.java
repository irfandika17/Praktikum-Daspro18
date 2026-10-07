package belajarquiz;

import java.util.Scanner;
public class menghitungbelajar3 {

public static void main(String[] args) {

    //deklarasi scanner
    Scanner Tezzar = new Scanner (System.in);

    //deklarasi variabel
    int lamamenyewa;
    double biayasewakamera;
    double biayaadministrasi;
    double biayasewa;
    double totalbiaya;


    //input
    System.out.println("masukkan biaya sewa kamera");
    biayasewakamera = Tezzar.nextDouble();
    System.out.println("masukkan biaya administrasi");
    biayaadministrasi = Tezzar.nextDouble();
    System.out.println("masukkan lama menyewa");
    lamamenyewa = Tezzar.nextInt();

    //proses
    biayasewa = lamamenyewa*biayasewakamera;
    totalbiaya = biayasewa+biayaadministrasi;

    //output
    System.out.println("total biaya yang dibayar " +totalbiaya);

    Tezzar.close();

    



    
}
    
}
