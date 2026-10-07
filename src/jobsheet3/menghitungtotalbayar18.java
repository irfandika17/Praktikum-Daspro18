package jobsheet3;

import java.util.Scanner;

public class menghitungtotalbayar18 {
    public static void main (String[]args){

    //deklarasi scanner
    Scanner Tezzar = new Scanner(System.in);
    
    //deklarasi variabel
    double harga;
    double potongan;
    double jml_bayar;
    double diskon=0.15;

    //input
    System.out.println("masukkan harga : " );
    harga= Tezzar.nextDouble();

    //proses
    potongan=diskon*harga;
    jml_bayar=harga-potongan;

    //output
    System.out.println("jumlah yang harus anda bayar adalah Rp. " +jml_bayar);

    Tezzar.close();
    



    }
    
}
