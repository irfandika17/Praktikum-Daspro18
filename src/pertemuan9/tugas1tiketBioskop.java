//hargaTiket = 40000+(18 mod 6 = 0 )*2000 = 40000
//syaratDiskonPertama = tiket > (3+(18 mod 3 = 0)= 3),dapatDiskon (8+(18 mod 5 = 3) =11%)
//syaratDiskonKedua = tiket > (8+(18 mod 4 = 2 )= 10),dapatDiskon (15+(18 mod 4 = 2) =17%)

package pertemuan9;

import java.util.Scanner;

public class tugas1tiketBioskop {
public static void main(String[] args) {
    
Scanner Tezzar = new Scanner(System.in);

int totalpenjualan= 0 ;
int totalTiket = 0;
int penjualanTiket = 0;
int hargaTiket = 40000;
String ulang = "ya";


while (ulang.equalsIgnoreCase("ya")) {
    System.out.println("masukkan jumlah tiket : ");
    int jumlahTiket = Tezzar.nextInt();

    while (jumlahTiket < 0) {
        System.out.println("jumlah tiket tidak valid ");
        System.out.println("masukkan jumlah tiket ulang :");
        jumlahTiket = Tezzar.nextInt();
    }

    totalTiket = jumlahTiket*hargaTiket;
    int totalBayar;

    if (jumlahTiket > 10) {
        totalBayar = totalTiket - (totalTiket * 17/100);
    } else if (jumlahTiket > 3) {
        totalBayar = totalTiket - (totalTiket * 11/100);
    } else {
        totalBayar = totalTiket;
    }
 
    System.out.println("total bayar : Rp" + totalBayar);

    penjualanTiket=  penjualanTiket + jumlahTiket;
    totalpenjualan = totalpenjualan + totalBayar;

    System.out.println("transaksi berikutnya ? ");
    ulang = Tezzar.next();
}

System.out.println("total tiket terjual : " + penjualanTiket);
System.out.println("total penjualan Rp. " + totalpenjualan);


Tezzar.close();





}
    
}
