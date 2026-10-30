
//ujiAwal = 2+(18 mod 3 = 0)=2

package pertemuan10;

import java.util.Scanner;

public class Triangle18 {
    
public static void main(String[] args) {
    
    Scanner Tezzar = new Scanner(System.in);

    System.out.print("masukkan nilai n = ");
    int n = Tezzar.nextInt();

    int i = 1;
    while (i <= n) {
        int j = 0;
        while (j < i) {
            System.out.print("*");
            j++;

        }
        System.out.println();
        i++;


    }
    Tezzar.close();


}




}
