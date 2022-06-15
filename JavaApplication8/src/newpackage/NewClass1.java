/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.*;
/**
 *
 * @author Member
 */
public class NewClass1 {
        public static void main(String[] args) {
        String identitas="Hegel";
        System.out.println("nama identitas= " +identitas);             
        System.out.println("bahan pertama...");

        String resep="";
        
        int bahan1;
        Scanner inputUser = new Scanner (System.in);
        System.out.print("Masukan bahan Utama : ");
        bahan1 = inputUser.nextInt();
            if (bahan1>=1 && bahan1<=2){
                switch (bahan1){
                    case (1): System.out.println("Pisang");break;
                    case (2): System.out.println("Telur");break;  
            }
            
        int bahan2;
        inputUser = new Scanner (System.in);
        System.out.print("Masukan bahan kedua : ");
        bahan1 = inputUser.nextInt();
        if (bahan1==1 || bahan1==2){
            if(bahan1==1){
                switch (bahan1){
                    case 1: 
                        System.out.println("Pilihan menu bahan kedua:");
                        System.out.println("1. Minyak goreng");
                        System.out.println("2. Telur");
                        System.out.println("3. Tidak ada");break;
                    case 2:
                        System.out.println("Pilihan menu bahan kedua:");
                        System.out.println("1. Minyak goreng");
                        System.out.println("2. Roti");
                        System.out.println("3. Tidak ada");break;
            }
            }
            else if(bahan1==2){
                switch (bahan1){
                    case 1: 
                        System.out.println("Pilihan menu bahan kedua:");
                        System.out.println("1. Minyak goreng");
                        System.out.println("2. Telur");
                        System.out.println("3. Tidak ada");break;
                    case 2:
                        System.out.println("Pilihan menu bahan kedua:");
                        System.out.println("1. Minyak goreng");
                        System.out.println("2. Roti");
                        System.out.println("3. Tidak ada");break;
            }
            }
        }
        else{
            System.out.println("Pilihan tidak ditemukan");
        }
                System.out.println("Saran resep:");
        if (bahan1>=1 && bahan1<=3){
            if (bahan1==1){
                switch (bahan1){
                    case (1): System.out.println("Anda dapat membuat pisgor");break;
                    case (2): System.out.println("banana shake");break;
                    case (3): System.out.println("sangbus");break;
                }
            }
            else if (bahan1==2){
                switch (bahan1){
                    case (1): System.out.println("telur mata sapi");break;
                    case (2): System.out.println("sandwich telur");break;
                    case (3): System.out.println("lurbus");break;
                }
            }
            
            }
        }
        else{
            System.out.println("Tidak ada resep");
        }
    }
        }

