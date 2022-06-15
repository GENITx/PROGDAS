/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import static newpackage1.NewClass.nilai;

/**
 *
 * @author Member
 */
public class NewClass1 {
    public static void hitung(int a, int b) {
                System.out.println((a+b));            
        }
            public static void nilai(){
                System.out.println("nilai a dan b adalah");
            }
            public static void main(String[] args) {
                int a=10, b=2;
                nilai();
                hitung(a,b);
                
            }
}
