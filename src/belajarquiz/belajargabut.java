package belajarquiz;

import java.util.Scanner;

public class belajargabut {
public static void main(String[] args) {
    
    //deklarasi scanner
    Scanner Tezzar = new Scanner(System.in);

    //deklarasi variabel
    int bilangan1;
    int bilangan2;
    int bilangan3;
    int bilanganterbesar;

    //input
    System.out.println("masukkan bilangan 1");
    bilangan1 = Tezzar.nextInt();
    System.out.println("masukkan bilangan 2");
    bilangan2 = Tezzar.nextInt();
    System.out.println("masukkan bilangan 3");
    bilangan3 = Tezzar.nextInt();

    //proses
   if (bilangan1>bilangan2) {
        if (bilangan1>bilangan3) {
            bilanganterbesar = bilangan1;
       
        }else {
            bilanganterbesar = bilangan3;
        }

   } else {
        if (bilangan2>bilangan3) {
            bilanganterbesar = bilangan2;
        } else {
            bilanganterbesar = bilangan3;
        }
   }
    
    System.out.println("bilangan terbesar = " + bilanganterbesar);
        
   Tezzar.close();






}     
    
    
    
    }
    

    
       
        
    

