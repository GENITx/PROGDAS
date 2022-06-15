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
public class NewClass2 {
    public static void perkalian(int nilai1, int nilai2) {
                System.out.println((nilai1*nilai2));
            }
    public static void pembagian(int nilai1, int nilai2) {
                System.out.println((nilai1/nilai2));
            }
    public static void penjumlahan(int nilai1, int nilai2) {
                System.out.println((nilai1+nilai2));
            }
    public static void pengurangan(int nilai1, int nilai2) {
                System.out.println((nilai1-nilai2));
            }
            public static void nilai1(){ 
                System.out.print("Hasil nilai1*nilai2 = ");
            }
            public static void nilai2(){ 
                System.out.print("Hasil nilai1/nilai2 = ");
            }
            public static void nilai3(){ 
                System.out.print("Hasil nilai1+nilai2 = ");
            }
            public static void nilai4(){ 
                System.out.print("Hasil nilai1-nilai2 = ");
            }
            public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);
                    System.out.print("Masukkan nilai : ");
                    int nilai1 = input.nextInt();
        
                    System.out.print("Masukkan nilai kedua : ");
                    int nilai2 = input.nextInt();
               
                nilai1();
                perkalian(nilai1,nilai2);
                nilai2();
                pembagian(nilai1,nilai2);
                nilai3();
                penjumlahan(nilai1,nilai2);
                nilai4();
                pengurangan(nilai1,nilai2); 
            }
}
