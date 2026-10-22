//hargaKopi = 10000+(18 mod 5 = 3) * 1000 = 13000
//hargaTeh = 5000+(18 mod 4 = 2 ) *1000 = 7000
//hargaRoti = 15000+(18 mod 6 = 0)* 1000 = 15000


package pertemuan9;

import java.util.Scanner;

public class kafeDoWhile18 {
public static void main(String[] args) {

Scanner Tezzar = new Scanner(System.in);
int kopi,teh,roti;
int hargaKopi=13000,hargaTeh=7000,hargaRoti= 15000;
int totalHarga; 
String namaPelanggan;

do {
    System.out.println("masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
    namaPelanggan = Tezzar.nextLine();
    if (namaPelanggan.equalsIgnoreCase("batal")) {
        System.out.println("transaksi dibatalkan");
        break; 
    }
    System.out.println("jumlah kopi : ");
    kopi = Tezzar.nextInt();
    System.out.println("jumlah teh : ");
    teh = Tezzar.nextInt();
    System.out.println("jumlah roti : ");
    roti = Tezzar.nextInt();
    
    totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
    System.out.println("total yang harus dibayar : Rp " + totalHarga);
    Tezzar.nextLine();

} while (true);

System.out.println("semua transaksi selesai");
}
    
}
