package pertemuan2;

import java.util.Scanner;

public class Bank18 {
    public static void main( String [] args) {
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga =0.02, bunga,jml_tabungan_akhir;

        //input
        System.out.println(" masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = sc.nextInt();
        System.out.println(" masukkan lama menabung anda");
        lama_menabung= sc.nextInt();

        //proses
        bunga = lama_menabung*presentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;

        //output
        System.out.println("bunga adalah " +bunga);
        System.out.println("jumlah tabungan akhir anda adalah " +jml_tabungan_akhir);

        sc.close();

        
    }
    
}
