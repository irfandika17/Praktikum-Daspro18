/*
P=18
bagian A = 50+(18 mod 50 = 18)= 68 
bagian B = 20+(18 mod 60 = 18)= 38
 */

package pertemuan12;

import java.util.Arrays;

public class SearchNilai18 {
    public static void main(String[] args) {
        
        int [] nilai = {78,65,90,55,88,72};
        int key = 68;
        boolean ditemukan = false;
       
        for (int i = 0; i < nilai.length -1; i++) {
            if (nilai[i] == key) {
                System.out.println("nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
                
            }

        }
            if (!ditemukan) {
                System.out.println("nilai " + key + " tidak ditemukan");
            }
        
    }
    
}
