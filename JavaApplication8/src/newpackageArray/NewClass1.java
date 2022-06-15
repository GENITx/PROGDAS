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
public class NewClass1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            System.out.print("Cottage : ");
        String Cottage = input.nextLine();
            System.out.print("Tipe Hari : ");
        String tipe = input.next();
            System.out.print("Lama Menginap : ");
        int hari = input.nextInt();
            System.out.print("Harga : ");
        int harga = input.nextInt();
        
        double total = (harga*hari);
            System.out.println("total harga " +total); 
                
        }
    }
   

