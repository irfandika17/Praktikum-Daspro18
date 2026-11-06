// P=18
//jumlahToko = 2+(18 mod 3) = 2

package pertemuan10;

import java.util.Scanner;

public class Tugas318 {
    public static void main(String[] args) {
        
        Scanner Tezzar = new Scanner(System.in);

        
        int jumlahToko;
        int jumlahPelanggan;
        int jumlahBarang;
        int totalPelanggan;
        int totalBarang;
        int totalBarangSeluruh = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;


        do {
            System.out.print("masukkan jumlah toko : ");
            jumlahToko = Tezzar.nextInt();

            if (jumlahToko < 1) {
                System.out.println("jumlah toko minimal 1, ulangi input ");

            }
            
        } while (jumlahToko < 1);

        for (int i = 1; i <= jumlahToko; i++) {

            do {
                System.out.print("masukkan jumlah pelanggan toko " + i + ": " );
                jumlahPelanggan = Tezzar.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("jumlah pelanggan tidak boleh negatif, ulangi input");

                }
            } while ( jumlahPelanggan < 0);
            totalBarang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {

                do {
                    System.out.print("jumlah barang pelanggan " + j + " toko " + i + ": ");
                    jumlahBarang = Tezzar.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("jumlah barang tidak boleh negatif, ulangi input");
 
                    }
                } while (jumlahBarang < 0);
                totalBarang += jumlahBarang;

            } 
            System.out.println("toko " + i + " - pelanggan: " + jumlahPelanggan + ",total barang: " + totalBarang);
            totalBarangSeluruh += totalBarang;

            if (totalBarang > barangTerbanyak) {
                barangTerbanyak = totalBarang;
                tokoTerbanyak = i;
                
            }
        }

        System.out.println("total barang seluruh toko : " + totalBarangSeluruh);
        System.out.println("toko dengan barang terbanyak : " + tokoTerbanyak);
      
        Tezzar.close();
 
    }
}