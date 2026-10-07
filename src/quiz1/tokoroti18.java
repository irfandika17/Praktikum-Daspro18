package quiz1;

import java.util.Scanner;

public class tokoroti18 {
    public static void main(String[] args) {
        Scanner Tezzar = new Scanner (System.in);

        //deklarasi variabel
        double modaltetap;
        Double laba;
        int hargarotimanis;
        int jumlahpegawai;
        int pendapatan;
        int bagianpegawai;
        int sisakas;
        int jumlahhari;

        //input
        System.out.println("masukkan harga roti manis = ");
        hargarotimanis = Tezzar.nextInt();
        System.out.println("masukkan modal tetap");
        modaltetap = Tezzar.nextDouble();
        System.out.println("masukkan Laba =");
        laba = Tezzar.nextDouble();
        System.out.println("masukkan jumlah hari");
        jumlahhari = Tezzar.nextInt();
        System.out.println("jumlah pegawai");
        jumlahpegawai = Tezzar.nextInt();

        //proses
        pendapatan = jumlahhari*hargarotimanis;
        laba =  pendapatan*modaltetap;
        bagianpegawai = pendapatan/jumlahpegawai;
        sisakas = pendapatan%bagianpegawai;

        //ouput
        System.out.println("pendapatan =" +pendapatan);
        System.out.println("laba =" +laba);
        System.out.println("bagian pegawai =" +bagianpegawai);
        System.out.println("sisakas =" +sisakas);

        Tezzar.close();

        





    }
    
}
