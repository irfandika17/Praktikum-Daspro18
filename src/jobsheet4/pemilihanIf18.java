package jobsheet4;

import java.util.Scanner;

public class pemilihanIf18 {

public static void main(String[] args) {

    //scanner
Scanner Tezzar = new Scanner(System.in);

    //variabel
System.out.println("--- cetak KRS siakad---");
System.out.println("apakah UKT udah lunas? (true/false) : ");
boolean uktlunas = Tezzar.nextBoolean();

    //pemilihan
if (uktlunas) {
    System.out.println("pemabayaran UKT terverifikasi");
    System.out.println("silakan cetak KRS dan minta tanda tangan DPA");
}

else {

    System.out.println(" Registrasi ditolak,silahkan lunasi UKT terlebih dahulu");

}

Tezzar.close();

}
    
}
