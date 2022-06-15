/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackagePerulangan;

/**
 *
 * @author Member
 */
public class NewClass {
    public static void main(String[]args){
        for(int h =0; h <= 20; h++){
            //Blok kode yang akan diulang 
            System.out.println("nomor : "+h);
        }
        for(int h =20; h <= 20 && h>=0; h--){
            System.out.println("nomor : "+h);
        }
        String nama[]={"budi ","sugeng ","langgeng ","subagio "};
            System.out.println(nama[3]+nama[2]+nama[1]+nama[0]);
            System.out.println(nama[3]);
            System.out.println("nama anda; "+nama[3]);
        for(String data:nama){
            System.out.println("nama anda semuanya: "+data);
        }
        for(int n=0; n<4;n++){
            System.out.println("nama anda: "+nama[1]);
            System.out.println(nama[3]);     
    }
        int h=0;
            while(h<=10){
                System.out.println("nomer: "+h);
                h++;
            }
    }         
}


    