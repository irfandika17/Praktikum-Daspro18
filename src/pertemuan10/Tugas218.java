/*
P = 18
n = 5+(18 mod 4) = 7
*/

package pertemuan10;

import java.util.Scanner;

public class Tugas218 {
    public static void main(String[] args) {
        
        Scanner Tezzar = new Scanner(System.in);

        System.out.print("masukkan nilai n : ");
        int n = Tezzar.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i*j;

                System.out.printf("%4d", hasil);
                total += hasil;

            }
            System.out.println();

        }
        System.out.println("jumlah seluruh angka : " + total);

        Tezzar.close();
    }
    
}
