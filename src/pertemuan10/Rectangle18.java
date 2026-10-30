/*
P=18
uji 1 (baris)= 2+(18 mod 3)= 2
      (kolom)= 4+(18 mod 3)= 2
uji 2 (baris)= 5+(18 mod 3)= 5
      (kolom)= 2+(18 mod 3)= 2
Pertanyaan 2 (baris)= 4+(18 mod 4)= 6
             (kolom)= 6+(18 mod 4)= 8
*/

package pertemuan10;

import java.util.Scanner;

public class Rectangle18 {
public static void main(String[] args) {
    
Scanner Tezzar = new Scanner(System.in);
System.out.print("masukkan jumlah baris : ");
int baris = Tezzar.nextInt();
System.out.print("masukkan jumlah kolom : ");
int kolom = Tezzar.nextInt();

for (int i = 1; i <= baris; i++) {
    for (int j = 1; j <= kolom; j++) {
        System.out.print("#");
    }
    System.out.println();

}
    Tezzar.close();


}
    
}
