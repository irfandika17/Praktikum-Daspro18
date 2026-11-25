/*
P=18
bagian A = 50+(18 mod 50 = 18)= 68 
bagian B = 20+(18 mod 60 = 18)= 38
 */

package pertemuan12;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        
        Scanner Tezzar = new Scanner(System.in);

        System.out.print("masukkan banyak elemen array: ");
        int jumlah = Tezzar.nextInt();
        int [] nilai = new int [jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("masukkan nilai indeks ke-" + i + ": ");
            nilai[i] = Tezzar.nextInt();

        }

        System.out.print("masukkan key yang dicari :");
        int key = Tezzar.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
            System.out.println("nilai " + key + " ditemukan pada indeks ke-" + i);
            ditemukan = true;
            break; 
            }
            
            
        }

        if (!ditemukan) 
            System.out.println("nilai " + key + " tidak ditemukan");{
            
        }
        
        
    }
    
}
