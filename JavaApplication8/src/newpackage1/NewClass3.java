/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.Scanner;

/**
 *
 * @author Member
 */
public class NewClass3 {
    public static void penjumlahan(int a, int b) {
        System.out.println("Hasil dari "+a+ "+" +b+ "=" +(a+b));
    }
    public static void pengurangan(int a, int b) {
        System.out.println("Hasil dari "+a+ "-" +b+ "=" +(a-b));
    }
    public static void perkalian(int a, int b) {
        System.out.println("Hasil dari "+a+ "*" +b+ "=" +(a*b));
    }
    public static void pembagian(int a, int b) {
        System.out.println("Hasil dari "+a+ "/" +b+ "=" +(a/b));
    }    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        String operasi;
        System.out.print("Masukkan Angka 1 : ");
        a=input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        b=input.nextInt();
        System.out.print("Pilih Operasi Matematika : ");
        operasi=input.next();
        if (operasi.equals("Penjumlahan")){
            penjumlahan(a,b);
        }
        else if (operasi.equals("Pengurangan")){
            pengurangan(a,b);
        }
        else if (operasi.equals("Perkalian")){
            perkalian(a,b);
        }
        else if (operasi.equals("Pembagian")){
            pembagian(a,b);
        }
        else {
            System.out.println("Tidak Ada");
        }
    }
}
