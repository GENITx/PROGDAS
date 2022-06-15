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
public class NewClass4 {
    public static void main(String[]args){
        int tinggi =5;
        for(int a=1; a <=tinggi; a++){
            for(int b=1; b <=a; b++){
                System.out.print(b + "\t");
            }
            System.out.println();
        }
        
        for(int a=5; a >=1; a--){
            for(int b=1; b <=a; b++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        
        for(int i=5;i>=1;i++){
            for(int b=5;b<=1;b--){
                System.out.print(b+"\t");
            }
            System.out.println("");
        }
    }
}
