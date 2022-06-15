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
public class NewClass4 {
    public static int jumlah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
    
    public static int kurang(int a, int b) {
        int hasil = a - b;
        return hasil;
    }
    
    public static int kali(int a, int b) {
        int hasil = a * b;
        return hasil;
    }
    
    public static double bagi(double a, double b) {
        double hasil = a / b;
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Angka 1 : ");
        int a = input.nextInt();
        System.out.print("Angka 2 : ");
        int b = input.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan operator ( + - / * ): ");
        String operator = input2.nextLine();
        
        switch(operator) {
            case "+" : 
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + jumlah(a, b));
            break;
            case "-" : 
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + kurang(a, b));
            break;
            case "*" : 
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + kali(a, b));
            break;
            case "/" : 
                System.out.println("Hasil dari " + a + " " + operator + " " + b + " = " + bagi(a, b));
            break; 
            default : 
                System.out.println("Operator tidak sesuai");
            break; 
        }
    }
}

