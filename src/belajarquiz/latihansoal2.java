package belajarquiz;

import java.util.Scanner;

public class latihansoal2 {
public static void main(String[] args) {
    
    Scanner Tezzar = new Scanner(System.in);

    int kodehari;
    char statuseragam = 'T'/'y';

    System.out.println(" masukkan kode hari : ");
    kodehari = Tezzar.nextInt();


   switch (kodehari) {
    case 1:
        System.out.println(" apakah memakai seragam : ");
        statuseragam = Tezzar.next().charAt(statuseragam);

        if (statuseragam == 'y') {
            System.out.println(" boleh mengikuti perkuliahan ");
            
        } else {
            System.out.println(" dikenakan sanksi ");
        }
        
        break;
   
    case 2:
        System.out.println(" apakah memakai seragam : ");
        statuseragam = Tezzar.next().charAt(statuseragam);

        if (statuseragam == 'y') {
            System.out.println(" boleh mengikuti perkuliahan ");
            
        } else {
            System.out.println(" dikenakan sanksi ");
        }
        
        break;
   
    case 3:
        System.out.println(" memakai pakaian bebas yang rapi dan sopan ");
        statuseragam = Tezzar.next().charAt(statuseragam);
        
        break;
   
    case 4:
        System.out.println(" memakai pakaian bebas yang rapi dan sopan ");
        statuseragam = Tezzar.next().charAt(statuseragam);

        break;
   
    case 5:
        System.out.println(" apakah memakai seragam : ");
        statuseragam = Tezzar.next().charAt(statuseragam);

        if (statuseragam == 'y') {
            System.out.println(" boleh mengikuti perkuliahan");
            
        } else {
            System.out.println(" dikenakan sanksi ");
        }
        
        break;
   
    case 6:
        System.out.println(" tidak ada perkuliahan ");
        statuseragam = Tezzar.next().charAt(statuseragam);
        
        break;
   
    case 7:
        System.out.println(" tidak ada perkuliahan ");
        statuseragam = Tezzar.next().charAt(statuseragam);

        break;
   
   
    default:
        System.out.println(" kode hari tidak valid ");
        break;
   }

   Tezzar.close();

        
    
}
    
}
