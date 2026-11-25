/*
P=18
2+(18 Mod 4 = 2) = 4
18 Mod 7 = 4
*/

package pertemuan12;

import java.util.Scanner;

public class Tugas218 {
     public static void main(String[] args) {
        Scanner Tezzar = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino",
                         "Chocolate Ice"};

        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.print("Masukkan nama menu yang dicari: ");
        String cariMenu = Tezzar.nextLine();

        int indeks = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Menu ditemukan: " + menu[indeks]);
            System.out.println("Harga: Rp" + harga[indeks]);
        } else {
            System.out.println("Menu tidak tersedia.");
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = Tezzar.nextInt();
        Tezzar.nextLine();

        String[] pesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        int totalBiaya = 0;


        for (int i = 0; i < jumlahPesanan; i++) {
            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" 
                                 + (i + 1) + ": ");
                String namaPesanan = Tezzar.nextLine();

                int posisi = -1;

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        posisi = j;
                        break;
                    }
                }

                if (posisi != -1) {
                    pesanan[i] = menu[posisi];
                    hargaPesanan[i] = harga[posisi];

                    totalBiaya += harga[posisi];

                    System.out.println("Pesanan berhasil ditambahkan.");
                    valid = true;
                } else {
                    System.out.println("Menu tidak tersedia, silakan input kembali.");
                }
            }
        }

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]
                               + " - Rp" + hargaPesanan[i]);
        }
    
        System.out.println("Total biaya: Rp" + totalBiaya);

        Tezzar.close();
    }
    
}
