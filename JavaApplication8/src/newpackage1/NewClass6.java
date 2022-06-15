/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.Scanner;

/**
 *
 * @author Member
 */
public class NewClass6 {
    public static void cara(){

        // data awal yang akan diurutkan

        int data[]={10,20,4,5,8};

        //mencetak data sebelum diurutkan

        System.out.println("Data Sebelum Diurutkan : ");

        for (int i=0; i<data.length; i++){

        System.out.print(data[i] + "\t");
        }
    
        System.out.println();

        System.out.println("Data Sesudah Diurutkan dari yang terbesar: ");

        for (int j=0; j<data.length; j++)

        System.out.print(data[j]+"\t");


        //mengurutkan data dengan membandingkan nilai dari kiri ke kanan

        for (int f=0; f<data.length; f++)

        for (int n=0; n<data.length; n++)

        if (data[f] < data[n]){ 
            
        //jika lebih kecil maka akan digeser ke arah kanan
        

        int hasil=data[f];

        data[f]=data[n];

        data[n]=hasil;

        }

        System.out.println();

        System.out.println("Data Sesudah Diurutkan dari yang terbesar: ");

        for (int j=0; j<data.length; j++)

        System.out.print(data[j]+"\t");

        }
    
    public static void main(String[] args){
            cara();           
        }
    }
