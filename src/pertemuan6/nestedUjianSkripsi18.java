package pertemuan6;

import java.util.Scanner;

public class nestedUjianSkripsi18 {
public static void main(String[] args) {
    
    
    Scanner Tezzar = new Scanner(System.in);

   
    String pesan;

  
    System.out.println("apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
    String bebasKompen = Tezzar.nextLine().trim();
    System.out.println("masukkan jumlah log bimbingan pembimbing 1 : ");
    int bimbinganP1 = Tezzar.nextInt();
    System.out.println("masukkan jumlah log bimbingan pembimbing 2 : ");
    int bimbinganp2 = Tezzar.nextInt();

  
    if (bebasKompen.equalsIgnoreCase("ya")) {
        if (bimbinganP1 >= 9 && bimbinganp2 >= 3) {
            pesan = "semua syarat terpenuhi. mahasiswa boleh mendaftar ujian skripsi";
        } else if (bimbinganP1 < 9 && bimbinganp2 < 3) {
            pesan = "gagal! log bimbingan p1 kurang dari 9 kali dan p2 kurang dari 3";
        } else if (bimbinganP1 < 9) {
            pesan = "gagal! log bimbingan p1 belum mencapai 9 kali";
        } else{
            pesan = "gagal! log bimbingan p2 belum mencapai 3 kali";
         } 

        } else {
            pesan = "gagal! mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);

        Tezzar.close();




}
}
