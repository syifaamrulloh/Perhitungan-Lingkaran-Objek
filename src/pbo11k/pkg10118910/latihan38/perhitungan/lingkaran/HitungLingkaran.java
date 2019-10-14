/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan38.perhitungan.lingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk Menghitung Lingkaran
 * dengan konsep Objek
 */
public class HitungLingkaran {

    Scanner input = new Scanner(System.in);
    private final float PHI = (float) 3.1415919999999997;
    private float l,k;
    private int r,rpangkat;
    
    private void hasilLingkaran(int d){
    r = d/2;
    l = (float) (Math.pow(r, 2)* PHI);
    k = PHI * d;
    
    //Output
        System.out.print("\n========== Hasil Perhitungan Lingkaran ==========\n");
        System.out.printf("Jari-Jari Lingkaran = " + r + " cm\n");
        System.out.printf("Luas Lingkaran = "+"%.2f",l);
        System.out.print(" cm\n");
        System.out.printf("Keliling Lingkaran = "+"%.2f",k);
        System.out.print(" cm\n");
    }
    public void inputDiameter(){
    int n = 0;
        System.out.println("========== Perhitungan Lingkaran ==========");
        do {            
            System.out.print("Masukan nilai diameter lingkaran\t: ");
            try {
                n= input.nextInt();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai\n");
                input.next();
            }
        } while ( n <= 0);
        hasilLingkaran(n);
    }
    public static void main(String[] args) {
        HitungLingkaran lr = new HitungLingkaran();
        lr.inputDiameter();
        System.out.println("(Developed by : Muhamad Syifa Amruloh)");
    }
    
}
