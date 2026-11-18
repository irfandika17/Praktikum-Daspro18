/*
P=18
Nilai yang di input = 60+(18 mod 41 =18) = 78
*/

package pertemuan12;

import java.util.Scanner;

public class ArrayNilai18 {
    public static void main(String[] args) {
        
        int [] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i+1) + ": " );
            nilaiAkhir[i] = input.nextInt(); 
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("mahasiswa ke-" + (i+1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            
        }
    }
    
}
