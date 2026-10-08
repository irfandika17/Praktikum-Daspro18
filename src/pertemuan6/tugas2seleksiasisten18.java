package pertemuan6;

import java.util.Scanner;

public class tugas2seleksiasisten18 {
public static void main(String[] args) {

    Scanner Tezzar = new Scanner(System.in);

    boolean mahasiswaaktif;
    boolean sanksiakademik;
    int nilaidaspro;
    boolean sertifikatkompetensi;



    System.out.println("apakah mahasiswa aktif : (true/false)");
    mahasiswaaktif = Tezzar.nextBoolean();
    System.out.println("apakah disanksi akademik (true/false)");
    sanksiakademik = Tezzar.nextBoolean();
    System.out.println("masukkan nilai Dasar pemrograman");
    nilaidaspro = Tezzar.nextInt();
    System.out.println("apakah memiliki sertifikat kompetensi (true/false)");
    sertifikatkompetensi = Tezzar.nextBoolean();


    if (mahasiswaaktif && !sanksiakademik) {
        if ( (nilaidaspro > 82) || sertifikatkompetensi) {
            System.out.println("mahasiswa dipanggil untuk mengikuti wawancara");
            
        } else {
            System.out.println("gagal : nilai harus diatas 82");

        } if (( nilaidaspro >= 77)) {
            System.out.println("mahasiswa diterima sebagai asisten");

        } else {
            System.out.println("mahasiswa gagal menjadi asisten : nilai minimal 77 ");
            
        }
        
    } else {
        System.out.println("gagal : mahasiswa tidak memenuhi syarat");

        Tezzar.close();
    }
    
        
    }
        
    }








    

