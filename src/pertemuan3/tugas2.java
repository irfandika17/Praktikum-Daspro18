package pertemuan3;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        //Deklarasi Scanner
     Scanner Tezzar = new Scanner(System.in);

     //Deklarasi variabel
     int banyaklembar;
     int biayajilid = 5000;
     int biayacetak;
     int totalbiaya;

     //input 
     System.out.println("masukkan banyak lembar");
     banyaklembar = Tezzar.nextInt();

     //proses
     biayacetak = banyaklembar*500;
     totalbiaya = biayacetak+biayajilid;

     //output
     System.out.println("total biaya : " +totalbiaya );

     Tezzar.close();

    }
    
}
