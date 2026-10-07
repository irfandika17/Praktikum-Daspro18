package jobsheet5;

import java.util.Scanner;

public class operatorlogikawifi18 {
public static void main(String[] args) {

    Scanner Tezzar = new Scanner(System.in);

    boolean mahasiswa;
    boolean dosen;
    boolean akundiblokir;

  
    System.out.println("apakah pengguna mahasiswa? (true/false) : ");
    mahasiswa = Tezzar.nextBoolean();
    System.out.println("apakah pengguna dosen? (true/false): ");
    dosen = Tezzar.nextBoolean();
    System.out.println("apakah akun sedang diblokir? (true/false): ");
    akundiblokir = Tezzar.nextBoolean();

    
    if ((mahasiswa || dosen) && !akundiblokir) {
        System.out.println("akses wifi diberikan"); 
    } else {
        System.out.println("akses wifi ditolak");
    }

    Tezzar.close();
}
    
}
