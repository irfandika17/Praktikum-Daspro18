package pertemuan5;

import java.util.Scanner;

public class tugas2pemilihan18 {
public static void main(String[] args) {
    
    //scanner
    Scanner Tezzar = new Scanner (System.in);

    //input
    System.out.println("masukkan jumlah sks");
    int jumlahsks = Tezzar.nextInt();

    //pemilihan
    if (jumlahsks > 24) {
        System.out.println("melebihi batas");
    }
    else {
        System.out.println("KRS valid");
    }

    Tezzar.close();
}
}
