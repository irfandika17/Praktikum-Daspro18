/*
P=18
5+(18 Mod 11)= 12
P mod 100 = 18
 */ 

package pertemuan12;

import java.util.Scanner;

public class Tugas118 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batasLulus = 60;
        int jumlahMahasiswa;
        int total = 0;
        int nilaiTertinggi;
        int nilaiTerendah;
        double rataRata;

        System.out.print("Masukkan banyaknya mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        int[] nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];

            if (i == 0) {
                nilaiTertinggi = nilai[i];
                nilaiTerendah = nilai[i];
            }
        }

        nilaiTertinggi = nilai[0];
        nilaiTerendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        
        rataRata = (double) total / jumlahMahasiswa;

        System.out.println("Rata-rata nilai    : " + rataRata);
        System.out.println("Nilai tertinggi   : " + nilaiTertinggi);
        System.out.println("Nilai terendah    : " + nilaiTerendah);
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + 
                           " | Nilai: " + nilai[i]);

            if (nilai[i] >= batasLulus) {
                System.out.println(" | Status: LULUS");
            } else {
                System.out.println(" | Status: TIDAK LULUS");
            }
        }

        input.close();
    }
}
