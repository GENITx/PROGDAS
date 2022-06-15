/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageArray;

/**
 *
 * @author Member
 */
public class NewClass {
    public static void main(String[]args){
        String nama[]=new String[3];
        nama[0]="Hegel";
        nama[1]="Kirana";
        nama[2]="Abraham";
           // System.out.println("Nama= "+nama[0]);
            
            
        int[]absen={1,2,3,4,5};
        for(int i=0;i<absen.length;i++){   
        //System.out.print(absen[i]+" ");
        }     
        int angka [][]={
            {1,4,5},
            {9,8,7},
            {6,5,0},
        };
        for(int i=0;i<angka.length;i++){
            for(int j=0;j<angka[i].length;j++){
                //System.out.print(angka[i][j]+" ");
            }
        }
        double umur[]={30,50,32,40,21,15};
        double banyakData=0;
        for(int i=0;i<umur.length;i++){
            banyakData=banyakData+umur[i];  
            }
        double averageUmur= banyakData / umur.length;
       // System.out.println("Rata-rata umur= "+averageUmur);
        
        double umurTermuda=umur[0];
        double umurTertua=umur[0];
        double jumlahRemaja=umur[0];
        for(int i=0;i<umur.length;i++){
            if (umur[i]<umurTermuda){
                umurTermuda=umur[i];
            }
            if (umur[i]>umurTertua){
                umurTertua=umur[i];
            }
            if (umur[i]>=12 && umur[i]<=25){
                jumlahRemaja++;
            }
      }
        System.out.println("Umur Termuda= "+umurTermuda);
        System.out.println("Umur Tertua= "+umurTertua);
        System.out.println("jumlah remaja= "+jumlahRemaja);
    }
}
    

