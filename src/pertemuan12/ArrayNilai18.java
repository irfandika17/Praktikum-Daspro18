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
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0;i < nilaiAkhir.length; i++) {

            String status;

           if (nilaiAkhir[i]> 70) {
            status = "LULUS";
            jumlahLulus++;
             
           } else {
            status = "TIDAK LULUS";
            jumlahTidakLulus++;

           }
           System.out.println("mahasiswa ke-" + (i+1) + ": " +nilaiAkhir[i] + " (" + status + " )" );
            
        }
        System.out.println("jumlah mahasiswa lulus :" +jumlahLulus);
        System.out.println("jumlah mahasiswa tidak lulus :" + jumlahTidakLulus);
    }
    
}
