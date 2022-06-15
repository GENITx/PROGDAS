/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import operatorunary.*;

/**
 *
 * @author Member
 */
public class NewClass {
    public static void main(String[]Args){
        int laptop, hardisk, mouse;
        laptop = 10;
        hardisk = 15;
        mouse = 15;
        /*operator penugasan jumlah barang*/
        laptop-=3;
        hardisk-=4;
        mouse+=6;
                
       
        int harga_laptop, harga_hardisk, harga_mouse;
        harga_laptop = 10000000;
        harga_hardisk = 1500000;
        harga_mouse = 150000;
        
        /*operator aritmatika total barang,harga,dan aset*/
        int total_barang;
        total_barang = laptop+hardisk+mouse;
        System.out.println("Total barang : " +total_barang+" Buah");
        
        int total_laptop, total_hardisk, total_mouse;
        total_laptop = laptop*harga_laptop;
        total_hardisk = hardisk*harga_hardisk;
        total_mouse = mouse*harga_mouse;
        
        
        System.out.println("Total harga laptop : Rp." +total_laptop);
        System.out.println("Total harga hardisk : Rp." +total_hardisk);
        System.out.println("Total harga mouse : Rp." +total_mouse);
        
        int total_aset;
        total_aset = total_mouse+total_hardisk+total_laptop;
        System.out.println("Total aset : Rp." +total_aset);
    }
}
