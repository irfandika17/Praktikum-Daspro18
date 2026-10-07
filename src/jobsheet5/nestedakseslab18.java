package jobsheet5;

import java.util.Scanner;

public class nestedakseslab18 {
public static void main(String[] args) {


    Scanner Tezzar = new Scanner(System.in);

    boolean mahasiswaAktif;
    boolean sedangDisanksi;
    boolean punyaIzinDosen;
    boolean asistenLab;

    
    System.out.println(" apakah mahasiswa aktif? (true/false)");
    mahasiswaAktif = Tezzar.nextBoolean();
    System.out.println("apakah sedang disanksi? (true/false)");
    sedangDisanksi = Tezzar.nextBoolean();
    System.out.println("apakah sudah izin dosen? (true/false)");
    punyaIzinDosen = Tezzar.nextBoolean();
    System.out.println("apakah asisten lab? (true/false)");
    asistenLab = Tezzar.nextBoolean();
    
  
    if (mahasiswaAktif && !sedangDisanksi) {
        if (punyaIzinDosen || asistenLab) {
            System.out.println("akses labolatorium diberikan");
    }   else {
        System.out.println("akses ditolak : membutuhkan izin dosen atau status asisten lab");
    }
    } else {
        System.out.println("akses ditolak : status mahasiswa tidak memenuhi syarat");  
    }
    
    Tezzar.close();
}
}
