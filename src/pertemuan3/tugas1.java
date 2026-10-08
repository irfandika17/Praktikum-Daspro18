package pertemuan3;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        
    //deklarasi scanner
    Scanner Tezzar = new Scanner(System.in);

    //deklarasi variabel
    int waktucicilan;
    double hargalaptop;
    double uangmuka;
    double sisahutang;
    double totalbiaya;
    double totalbayar;
    double cicilanbulan;

    //input
    System.out.println("masukkan harga laptop  : ");
    hargalaptop = Tezzar.nextInt();
    System.out.println("masukkan uang muka : ");
    uangmuka = Tezzar.nextInt();
    System.out.println("waktu cicilan : ");
    waktucicilan = Tezzar.nextInt();

    //proses
    sisahutang = hargalaptop-uangmuka;
    totalbiaya = sisahutang*0.02*waktucicilan;
    totalbayar = sisahutang+totalbiaya;
    cicilanbulan = totalbayar/waktucicilan;

    //ouput
    System.out.println("cicilan per bulan : " +cicilanbulan);

    Tezzar.close();


    



    }
    
}
