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
public class NewClass {
    public static void main(String[]args){
        int a = 8; //nilai suku awal
        int n= 14; //suku ke-25
       
        int selisih = 4;
        int hasil =0;
        for (int i = 1; i <= n; i ++) { //"1
            int y = a + ((i - 1)) * selisih;
            System.out.println(i+" " +y);
            
            hasil= hasil+y;
        }

        System.out.println(" jumlah dari deret aritmatika " + hasil);
//    
        System.out.println("");
    }
}
