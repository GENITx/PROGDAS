/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL_contohSoal;

/**
 *
 * @author Member
 */
public class NewClass2 {
    public static void main(String[]args){
        int a = 5;
        int b = 3;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 1; i <= 7; i++) { //baris 
            for (int j = 0; j < i; j++) {//kolom jika for1 tidak lebih besar dari for 2 maka kolom ke2 tidak ada/ tdk dilanjutkan
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
    }
}
