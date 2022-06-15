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
public class NewClass2 {
    public static void main(String[]args){
        int jumlah_hari;
        double jumlah_bayar;
        int jenis_hari=0;
        String Datapenginapan[][]={
            {"Duku","2","915000","1025000","1225000"},
            {"Jeruk","2","915000","1025000","1225000"},
            {"Alpukat","1","575000","695000","895000"}
        };
        Scanner input=new Scanner(System.in);
        System.out.print("Nama pengguna kamar : ");
        String nama=input.next();
        System.out.print("Inputkan nama roomnya : ");
        String nama_room = input.next();
        System.out.print("Lama Menginap : ");
        jumlah_hari = input.nextInt();
        System.out.print("Tipe Hari (Weekdays, Weekend, Holidays) : ");
        String tipe_hari = input.next();
        if(tipe_hari.equals("Weekdays")){
            jenis_hari=2;
        } else if(tipe_hari.equals("Weekend")){
            jenis_hari=3;
        } else if(tipe_hari.equals("Holidays")){
            jenis_hari=4;
        }
                
        for (int h=0;h<Datapenginapan.length;h++){
            //if(Datapenginapan[h][0].equals(nama_room)){
            for(int n=0;n<Datapenginapan[h].length;n++){
                if(Datapenginapan[h][n].equals(nama_room)){
                    //System.out.println(Datapenginapan[h][n]);
                    jumlah_bayar=jumlah_hari* Double.parseDouble(Datapenginapan[h][jenis_hari]);
                    System.out.print("");
                
                    
                }               
            }
        }
    } 
}
