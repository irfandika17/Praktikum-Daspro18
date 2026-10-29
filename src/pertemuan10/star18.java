/* N yang diinput (P=18)
N (uji 1) = 3 +(18 mod 5) = 6
N (uji 2) = 9 +(18 mod 5) = 12
N (pertanyaan 1 & 2) = 4 +(18 mod 4) = 6
N (pertanyaan 3) = 10 +(18 mod 6) = 10
*/

package pertemuan10;

import java.util.Scanner;

public class star18 {
public static void main(String[] args) {
    
    Scanner Tezzar = new Scanner(System.in);
    System.out.print("masukkan nilai n = ");
    int n = Tezzar.nextInt();

    for (int i = 1; i <= n; i++) {
        System.out.print("*");
    }
    System.out.println();
    Tezzar.close();

}
    
}
