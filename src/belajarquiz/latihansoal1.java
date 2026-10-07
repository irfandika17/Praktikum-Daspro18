package belajarquiz;

import java.util.Scanner;

public class latihansoal1 {
public static void main(String[] args) {

    Scanner Tezzar = new Scanner(System.in);

     int beratcucian;
     int tarif = 7000;
     int totalbiaya;

     System.out.println("masukkan berat cucian : ");
     beratcucian = Tezzar.nextInt();

     if (beratcucian < 3) {
        tarif = 7000;
        System.out.println("tarif  Rp 7000");
        
     } else if (beratcucian <= 6) {
        tarif = 6000;
        System.out.println("Tarif Rp 6000");
        
     } else {
        tarif = 5000;
        System.out.println("tarif Rp 5000");

     }

     totalbiaya = beratcucian*tarif;

     Tezzar.close();

}
    
}
