//tarifParkirMobil = 2500+(18 mod 6 = 0)x 250 = 2500
//tarifParkirMotor = 1500+ (18 mod 6 = 0)x 250 =1500

package pertemuan9;

import java.util.Scanner;

public class tugas2tarifParkir {
public static void main(String[] args) {
    
Scanner Tezzar = new Scanner(System.in);

int jenis,durasi,total = 0;

do {
    System.out.println("masukkan jenis kendaraan : ");
    jenis = Tezzar.nextInt();

    if (jenis == 1 || jenis == 2) {
        System.out.println("masukkan lama parkir/jam : ");
        durasi = Tezzar.nextInt();

            while (durasi <=0) {
            System.out.println("lama parkir tidak valid");
            System.out.println("masukkan lama parkir ulang : ");
            durasi = Tezzar.nextInt();
    }  

    if (jenis == 1) {
        System.out.println("biaya parkir : Rp " + (durasi*2500));
        total+= (durasi*2500);
    } else {
        System.out.println("biaya parkir : Rp " + (durasi*1500));
        total += (durasi*1500);
    }

} else if (jenis != 0 ) {
    System.out.println("jenis kendaraan tidak valid");
    System.out.println("masukkan jenis kendaraan ulang");
    jenis = Tezzar.nextInt();
}

} while (jenis != 0);
        System.out.println("total pembayaran : Rp. " + total);

        Tezzar.close();

}

}
