/*
P=18
n = 6+(18 mod 5) = 9
*/

package pertemuan10;

import java.util.Scanner;

public class Tugas118 {
    public static void main(String[] args) {
        
        Scanner Tezzar = new Scanner(System.in);

        System.out.print("masukkan nilai n : ");
        int n = Tezzar.nextInt();

        int total = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( j + " ");
                total++;
            }
            System.out.println();
        } 
        System.out.println("total angka tercetak : " + total);
        
        Tezzar.close();
    }
    
}
