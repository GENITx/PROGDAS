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
public class NewClass {
    public static void main(String[]args){
        int a=4,b=9;
        int total=0;
        for (int x=14;x<=30;x++){
            int u=a+((x-1)*b);
            System.out.println(u);
            total=total+u;
        }
        System.out.println("TOTAL DERET= "+total);
    }
}
