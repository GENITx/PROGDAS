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
public class NewClass1 {
    public static void main(String[]args){
        int a = 5;
        int b = 5;
        int u = a;
        int s = a;

        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 0;i < 5; i++) {//baris
            for (int j = 0; j <6; j++) {//kolom
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println("");
        }
        s = s - u;

        System.out.println(
                "Jumlah Deret Aritmatikanya adalah " + s);
    }
}
