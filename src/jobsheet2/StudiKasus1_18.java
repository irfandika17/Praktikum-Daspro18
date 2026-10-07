package jobsheet2;

import java.util.Scanner;

public class StudiKasus1_18 {
    public static void main (String[]args){

        //deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        int gajipokok;
        int tunjangan; 
        int jumlahanak;
        double potongan = 0.10;

        //input
        System.out.println("masukkan gaji pokok");
        gajipokok = sc.nextInt();
        System.out.println("masukkan tunjangan");
        tunjangan = sc.nextInt();
        System.out.println("masukkan jumlah anak");
        jumlahanak = sc.nextInt();
    
        //proses
        int totaltunjangan = tunjangan*jumlahanak;
        double potonganpensiunan = gajipokok*potongan;
        double gajibersih = gajipokok+totaltunjangan-potonganpensiunan;
        
        //output
        System.out.println(gajibersih);

        sc.close();
    }
    
}