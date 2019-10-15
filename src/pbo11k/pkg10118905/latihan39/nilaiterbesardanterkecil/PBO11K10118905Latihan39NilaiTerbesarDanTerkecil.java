/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan39.nilaiterbesardanterkecil;
import java.util.*;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program menghitung nilai terbesar dan terkecil
 */
public class PBO11K10118905Latihan39NilaiTerbesarDanTerkecil {

    public static Scanner input = new Scanner(System.in);
    private static int[] nilaiArr;
    public static void insertNilai(int i, String namaP){
        int[] nilaiarr = new int[1000];
        for(int j =1; j <= i;j++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+j+" ");
            nilaiArr[j] = input.nextInt();
        }
        Nilai nilai = new Nilai();
        nilai.hasil(namaP, i, nilaiArr);
    }
    public static void main(String[] args) {
        int n;
        String namaP;
        System.out.println("=====Program nilai terbesar dan nilai terkecil mahasiswa=====");
        System.out.println("Masukkan nama petugas\t:");
        namaP = input.nextLine();
        System.out.println("Masukkan Banyak Mahasiswa\t:");
        n = input.nextInt();
        insertNilai(n,namaP);
    }
    
}
