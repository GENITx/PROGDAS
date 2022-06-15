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
public class NewClass3 {
    public static void main(String[]args){
        int a=5,b=9;
        int n=10;
        int u=a+((n-1)*b);
        for(int x=0;x<4;x++){
            for(int h=0;h<8;h++){
                System.out.print(u+"\t");
                u=u+b;
            }
            System.out.println("");
        }
    }
}
