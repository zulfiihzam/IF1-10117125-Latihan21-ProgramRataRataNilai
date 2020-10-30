/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan21.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA : Zulfi Ihzam Rahmat
 * KELAS: IF-1
 * NIM  : 10117125
 * Deskripsi Program: Program ini berisi program yang menampilkan rata-rata
 * nilai mahasiswa
 */
public class IF110117125Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nBanyak, jml, nilai[];
        float rata, jumlah = 0;

        System.out.print("Masukan Banyaknya Mahasiswa : ");
        nBanyak = input.nextInt();

        nilai = new int[nBanyak];

        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }
        for (int j = 0; j <= nBanyak - 1; j++) {
            jumlah = jumlah + nilai[j];
        }

        rata = jumlah / nBanyak;
        System.out.println();
        System.out.println("Maka, rata rata nilainya adalah " + rata);
        System.out.println("Devoloped by Zulfi Ihzam");
    }
    
}
