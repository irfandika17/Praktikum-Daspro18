/*
P=18
30+(18 mod 71 = 18)= 48
*/

package pertemuan12;

import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {

        Scanner Tezzar = new Scanner(System.in);
        
        System.out.print("masukkan jumlah mahasiswa : " );
        int jumlahMhs = Tezzar.nextInt();

        int [] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = Tezzar.nextInt();
            total += nilaiMhs[i];     
        }

        rata = (double) total / nilaiMhs.length;
        System.out.println("total nilai : " + total);
        System.out.println("rata-rata: " +rata);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i]; {  
            }
             if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i]; {
                    
            }  
            
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                
            }



        }
        
        String predikat;
        
        if (rata >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("nilai tertinggi: " + tertinggi);
        System.out.println("nilai terendah: " + terendah);
        System.out.println("predikat kelas : " + predikat);
        System.out.println("jumlah mahasiswa lulus: " + jumlahLulus);

    }
    
}
