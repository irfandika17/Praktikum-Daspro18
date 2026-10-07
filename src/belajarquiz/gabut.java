package belajarquiz;

import java.util.Scanner;

public class gabut {
public static void main(String[] args) {
Scanner Tezzar = new Scanner(System.in);

//deklarasi variabel
double sisaharga;
double bunga;
double totalpembayaran;
double dp;
double sisaembayaran;
double hargalaptop;


//input
System.out.println("masukkan hatrga laptop =");
hargalaptop = Tezzar.nextDouble();
System.out.println("masukkan dp =");
dp = Tezzar.nextDouble();
System.out.println("masukkan bunga =");
bunga = Tezzar.nextDouble();

//proses
sisaharga = hargalaptop-dp;
bunga = bunga*sisaharga;
totalpembayaran = sisaharga+bunga;

//ouput
System.out.println("sisaharga =" +sisaharga);
System.out.println("bunga =" +bunga);
System.out.println("totalpembayaran =" +totalpembayaran);

Tezzar.close();





}
    
}
