/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageArray;

import java.util.Scanner;

/**
 *
 * @author Member
 */
public class NewClass3 {
    public static void main (String[]args){
        int jumlah_item=0;
        int total_harga=0;
        String Databarang[][]={
            {"Supreme","5","10000"},
            {"Mie sadap","3","5000"},
            {"Selera rakyat","10","4500"},
            {"Live boy","20","3000"}
        };
        
        for (int h =0;h<Databarang.length;h++){
            jumlah_item=jumlah_item+ Integer.parseInt(Databarang[h][1]);
            //total_harga=total_harga+ (Integer.parseInt(Databarang[h][1])* Integer.parseInt(Databarang[h][2]));
            int jumlah=Integer.parseInt(Databarang[h][1]);
            int harga=Integer.parseInt(Databarang[h][2]);
            if(jumlah<=5){
                harga=harga-1000;
            }
                
            total_harga=total_harga+ (jumlah*harga);
        }
        System.out.println("Jumlah= "+jumlah_item);
        System.out.println("Total Harga= "+total_harga);
        
    }
    
}
