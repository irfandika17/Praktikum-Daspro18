package pertemuan5;

import java.util.Scanner;

public class tugas1pemilihan18 {

public static void main(String[] args) {
    
    //scanner
    Scanner Tezzar = new Scanner (System.in);

    //variabel
    System.out.println("--- cetak KRS siakad---");
    System.out.println("apakah UKT udah lunas? (true/false) : ");
    boolean uktlunas = Tezzar.nextBoolean();
    String pesan;


    //ternary operator
    pesan = (uktlunas) ? "pembayaran UKT terverifikasi"+" silahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak,silahkan lunasi UKT terlebih dahulu";
            System.out.println(pesan);

            Tezzar.close();
    }



    
}
    
