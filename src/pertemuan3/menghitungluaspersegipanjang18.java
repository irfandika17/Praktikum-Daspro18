package pertemuan3;

import java.util.Scanner;

public class menghitungluaspersegipanjang18 {

    public static void main (String[]args){

    //deklarasi scanner
     Scanner Tezzar = new Scanner(System.in);

        //deklklarasi variabel
        int panjang;
        int lebar;
        int luas;

        //input
        System.out.println("masukkan panjang :");
        panjang = Tezzar.nextInt();
        System.out.println("masukkan lebar :");
        lebar = Tezzar.nextInt();

        //proses
        luas = panjang*lebar;

        //ouput
        System.out.println("luas persegi adalah" +luas);

        Tezzar.close();





    }
}