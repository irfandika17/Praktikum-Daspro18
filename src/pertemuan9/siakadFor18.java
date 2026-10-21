// 8 +(18 mod 5 = 3) = 11
// 55 +(18 mod 11 = 7) = 62
package pertemuan9;

import java.util.Scanner;

public class siakadFor18 {
public static void main(String[] args) {

    Scanner Tezzar = new Scanner(System.in);

    double nilai,tertinggi= 0,terendah= 100;
    int lulus = 0;
    int tidakLulus = 0;


    for (int i = 1; i <= 11; i++) {
        System.out.println("masukkan nilai mahasiswa ke-" + i + ":");
        nilai = Tezzar.nextDouble();

        if (nilai>tertinggi) {
            tertinggi = nilai; 
        }
        if (nilai < terendah) {
            terendah = nilai; 
        }

        if (nilai >= 62) {
            lulus++;
        } else {
            tidakLulus++;
        }
    
    } 
    System.out.println("nilai tertinggi : " + tertinggi);
    System.out.println("nilai terendah : " + terendah);
    System.out.println("mahasiswa lulus : " + lulus);
    System.out.println("mahasiswa tidak lulus : " + tidakLulus);

}
    
}
