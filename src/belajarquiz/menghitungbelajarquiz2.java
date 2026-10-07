package belajarquiz;

import java.util.Scanner;

public class menghitungbelajarquiz2 {
    public static void main(String[] args) {
        
        //deklarasi scanner
        Scanner Tezzar = new Scanner (System.in);

        //deklarasi variabel
        int jumlahdesain;
        int bayaranperdesain;
        double biayaadministrasi;
        double pendapatanbersih;
        int pendapatankotor;


        //input
        System.out.println("masukkan jumlah desain");
        jumlahdesain = Tezzar.nextInt();
        System.out.println("masukkan bayaran per desain = ");
        bayaranperdesain = Tezzar.nextInt();
        System.out.println("masukkan biaya administrasi");
        biayaadministrasi = Tezzar.nextDouble();

        //proses
        pendapatankotor = (int) jumlahdesain*bayaranperdesain;
        biayaadministrasi = 0.05*pendapatankotor;
        pendapatanbersih = pendapatankotor-biayaadministrasi;

        //output
        System.out.println("pendapatan bersih " +pendapatanbersih);

        Tezzar.close();





    }
    
}
