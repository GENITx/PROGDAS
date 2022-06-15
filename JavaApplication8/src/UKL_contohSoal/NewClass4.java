/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL_contohSoal;

/**
 *
 * @author Member
 */
public class NewClass4 {
    public static void main(String[]args){
        int a[][] = {
            {1, 2},
            {6, 7},
            {11,12},
            {16,17}};//3*5
        int b[][] = {
            {1, 2},
            {6, 7},
            {11, 12},
            {16,17}};//3*5

        System.out.println("Hasil A + B");
        for (int i = 0; i < 4; i++) {//baris
            for (int j = 0; j < 2; j++) {//kolom
                System.out.print(a[i][j] + b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
