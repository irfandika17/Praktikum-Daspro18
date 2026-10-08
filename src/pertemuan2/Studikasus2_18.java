package pertemuan2;

import java.util.Scanner;

public class Studikasus2_18 {
    public static void main (String[]args){
        
        //deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        int lebartanah;
        int panjangtanah;
        int diameterkolam; 
        int panjangsisitaman;

        //input
        System.out.println("masukkan lebar tanah");
        lebartanah = sc.nextInt();
        System.out.println("masukkan panjang tanah");
        panjangtanah = sc.nextInt();
        System.out.println("masukkan diameter kolam");
        diameterkolam = sc.nextInt();
        System.out.println("masukkan panjang sisi");
        panjangsisitaman = sc.nextInt();

        //proses
        int luastanah = lebartanah*panjangtanah;
        int luastaman = panjangsisitaman*panjangsisitaman;
        double jarijarikolam = diameterkolam/2;
        double luaskolam = 3.14*jarijarikolam*jarijarikolam;
        double luastidakgunakan = luastanah - luaskolam - luastaman;

        //output
        System.out.println("luas yang tidak digunakan" + luastidakgunakan );

        sc.close();

        
        
    }

}
