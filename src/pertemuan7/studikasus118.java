package pertemuan7;

import java.util.Scanner;

public class studikasus118 {
public static void main(String[]args){

    Scanner Tezzar = new Scanner(System.in);

    int hargapercup = 18000;
    int jumlahcup,uangbayar;
    int totalharga,diskon,totalbayar;
    int kembalian,kurang;

    System.out.println("masukkan jumlah cup : ");
    jumlahcup = Tezzar.nextInt();
    System.out.println("masukkan uang bayar : ");
    uangbayar = Tezzar.nextInt();

    totalharga = jumlahcup*hargapercup;
    diskon = 0;

    if (totalharga>=100000) {
        diskon = totalharga*10/100;
    }
        totalbayar = totalharga-diskon;
        System.out.println("total harga bayar = " +totalharga);
        System.out.println("Diskon = " + diskon);
        System.out.println("total bayar = " +totalbayar);
    
        
    if (uangbayar>=totalbayar) {
        kembalian = uangbayar-totalbayar;
        System.out.println("uang kembalian = " + kembalian);

        
    } else {
        kurang = totalbayar-uangbayar;
        System.out.println("uang tidak cukup, kurang Rp. " + kurang);
    }

        
    }



    

}



    

