package jobsheet3;

import java.util.Scanner;

public class gajikaryawan18 {
    public static void main (String[]args){

    //deklarasi scanner
    Scanner Tezzar = new Scanner(System.in);

    //deklarasi variabel
    int gajipokok;
    double totalgaji;
    double bonus;
    double tunjangantransport=600000;
    int tunjanganmakan=400000;

    //input
    System.out.println("masukkan gaji pokok : ");
    gajipokok= Tezzar.nextInt();

    //proses
    bonus= 0.05*gajipokok;
    totalgaji=gajipokok+tunjanganmakan+tunjangantransport+bonus-(0.1*gajipokok);

    //casting
    int gajitotal = (int) totalgaji;    

    //output
    System.out.println("bonus bulanan anda adalah Rp. "+bonus);
    System.out.println("gaji yang diterima adalah Rp. "+gajitotal);

    Tezzar.close();



    }
    
}
