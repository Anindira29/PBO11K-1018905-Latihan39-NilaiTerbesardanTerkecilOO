/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan39.nilaiterbesardanterkecil;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program menghitung nilai terbesar dan terkecil
 */
public class Terkecil {
    private int l;
    public int cari(int i, int arr[]) {
    l = arr[1];
    for (int m = 1; m <= i;m++){
        if (arr[m]<1)
            l = arr[m];
    }
    return l;
}
}
