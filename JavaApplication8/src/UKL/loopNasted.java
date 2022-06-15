/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL;

/**
 *
 * @author Member
 */
public class loopNasted {
    public static void main(String[]args){
        int deret;
        int a=5;
        int b=3;
        int n=10;
        int h=a;
        int p=a;
        
        for(int x=0;x<n;x++){
            System.out.println(h);
            h=h+b;
            p=p+h;
        }
            p=p-h;
            System.out.println("Total jumlah deret = "+p);
    }
}
