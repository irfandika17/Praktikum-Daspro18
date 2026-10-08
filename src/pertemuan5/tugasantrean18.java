package pertemuan5;

import java.util.Scanner;

public class tugasantrean18 {
public static void main(String[] args) {
    
    //scanner
    Scanner Tezzar = new Scanner (System.in);

    //variabel
    System.out.println("kode");
    System.out.println("layanan loket");
    char kode = Tezzar.next().charAt(0);
    String layanan;
    String loket;

    //pemilihan
    switch (kode) {
        case 'A':
            System.out.println("legalisir ijazah ");
            break;
        case 'B':
            System.out.println("surat aktif kuliah");
            break;
        case 'C':
            System.out.println("pembayaran UKT");
            break;
        case 'D':
            System.out.println("pengajuan cuti akademik ");
            break;
    
        default:
            System.out.println("layanan tidak tersedia");
            break;
    }
        
        Tezzar.close();

    }



}
    

