/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Nilai Terbesar Dan Terkecil
 */
public class PBOIF210119080Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int i, totalnilai, terbesar = 0, terkecil = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai "
                           + "Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        totalnilai = scanner.nextInt();
        int nilaimahasiswa[] = new int[totalnilai];
        for (i = 0; i < totalnilai; i++) {
            System.out.printf("Masukkan Nilai Mahasiswa Ke-%d = ", i+1);
            if (nilaimahasiswa[i] < terkecil) {
                terkecil = nilaimahasiswa[i];
            }
            nilaimahasiswa[i]= scanner.nextInt();
            if (nilaimahasiswa[i] > terbesar) {
                terbesar = nilaimahasiswa[i];
            }
        }

        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (i = 0; i < totalnilai; i++) {
            System.out.printf("Nilai Mahasiswa Ke-%1$d = %2$d%n", i+1, 
                              nilaimahasiswa[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah "+terbesar);
        System.out.println("Nilai Terkecil adalah "+terkecil);
        System.out.println();
        System.out.println("Petugas : "+petugas);

    }
    
}