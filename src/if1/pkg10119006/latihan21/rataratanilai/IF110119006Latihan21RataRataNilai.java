/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menghitung rata-rata nilai
 */
public class IF110119006Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int jmlhMhs;
        double totalnilai = 0, nilai, ratanilai;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jmlhMhs = userInput.nextInt();
        
        for (int i = 1; i <= jmlhMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = userInput.nextInt();
            totalnilai += nilai;
        }
        
        ratanilai = totalnilai / jmlhMhs;
        
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + ratanilai);
        System.out.println("Developed by : Ilham Zaki");
                
    }
    
}
