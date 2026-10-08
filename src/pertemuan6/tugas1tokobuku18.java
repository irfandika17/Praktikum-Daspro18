package pertemuan6;

import java.util.Scanner;

public class tugas1tokobuku18 {
public static void main(String[] args) {
    
    Scanner Tezzar = new Scanner(System.in);

    int jumlahbuku;
    int hargabuku;
    double diskon;
    double jumlahdiskon;
    double jumlahbayar;
    boolean isRabu;
    String jenisbuku;
    double totalharga;



    System.out.println("masukkan jenis buku : ");
    jenisbuku =Tezzar.nextLine();
    System.out.println("masukkan jumlah buku : ");
    jumlahbuku = Tezzar.nextInt();
    System.out.println("apakah hari rabu (true/false): " );
    isRabu = Tezzar.nextBoolean();


    if (isRabu) {
        if (jenisbuku.equalsIgnoreCase("kamus")) {
            if (jumlahbuku > 2) {
                diskon = 0.11 + 0.02;
                } else {
                    diskon = 0.11;   
            }

            } else if (jenisbuku.equalsIgnoreCase("novel")) {
                if (jumlahbuku > 3) {
                    diskon = 0.07 + 0.03;
                }else {
                    diskon = 0.07;
                } 
            } else {
                if (jumlahbuku > 3) {
                    diskon = 0.03;
                } else {
                    diskon = 0.05;
                }
            }
     
        
    }else {
        diskon = 0;
    }

        System.out.println("jumlah diskon : " + (int) (diskon*100 ) + "%");

        Tezzar.close();

}
    
}
