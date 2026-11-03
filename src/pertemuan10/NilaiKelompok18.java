/*
P=18
jumlahKelompok = 2+(18 mod 3)= 2
jumlahPenilai = 3+(18 mod 2)= 3
*/

package pertemuan10;

import java.util.Scanner;

public class NilaiKelompok18 {
public static void main(String[] args) {
    
Scanner Tezzar = new Scanner(System.in);

    System.out.print("masukkan jumlah kelompok : ");
    int jumlahKelompok = Tezzar.nextInt();
    System.out.print("masukkan jumlah penilai : ");
    int jumlahPenilai = Tezzar.nextInt();

    if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
        System.out.println("jumlah kelompok dan penilai harus > 0 ");

    } else {
        int nomorKelompok = 1;
        double rataTertinggi = -1;
        int kelompokTerbaik = 0;

        while (nomorKelompok <= jumlahKelompok) {
            System.out.println("kelompok " + nomorKelompok);
            double totalNilai = 0;

            for (int j = 1; j <= jumlahPenilai; j++) {
                int nilai;
                do {
                    System.out.print(" nilai dari penilai " + j + ": ");
                    nilai = Tezzar.nextInt();
                    if (nilai < 0 || nilai > 100) {
                        System.out.println(" nilai harus 0-100.ulangi input! ");

                    }
                } while ( nilai < 0 || nilai > 100);
                totalNilai += nilai;
            }
            double rataNilai = totalNilai / jumlahPenilai;
            System.out.println("kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);
            
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTerbaik= nomorKelompok;
            } 
            nomorKelompok ++;
        } 
        System.out.println("========");
        System.out.println("kelompok terbaik : " + kelompokTerbaik);
        System.out.println("rata-rata tertinggi : " + rataTertinggi);
    }

    Tezzar.close();

}
}
