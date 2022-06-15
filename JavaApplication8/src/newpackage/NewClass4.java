/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Member
 */
public class NewClass4 {
    public static void main(String[] args) {
        String identitas="Hegel";
        System.out.println("nama identitas= " +identitas);             
        System.out.println("bahan pertama...");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        int bahan1,bahan2;
        bahan1=1;
        
        if (bahan1==1 || bahan1==2){
            if(bahan1==1){
                System.out.println("Pilih menu bahan kedua:");
                System.out.println("1. Minyak goreng");
                System.out.println("2. Telur");
                System.out.println("3. Tidak ada");
            }
            else{
                System.out.println("Pilih menu bahan kedua:");
                System.out.println("1. Minyak goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
        }
        else{
            System.out.println("Pilihan tidak ditemukan");
        }
        bahan2=1;
        if (bahan2>=1 && bahan2<=3){
            if (bahan1==1){
                switch (bahan2){
                    case (1): System.out.println("pisgor");break;
                    case (2): System.out.println("banana shake");break;
                    case (3): System.out.println("sangbus");break;
                }
            }
            else{
                switch (bahan2){
                    case (1): System.out.println("telur mata sapi");break;
                    case (2): System.out.println("sandwich telur");break;
                    case (3): System.out.println("lurbus");break;
                }
            }
        }
        else{
            System.out.println("Tidak ada resep");
        }
}
}
