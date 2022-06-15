/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL_contohSoal;

import java.util.Scanner;

/**
 *
 * @author Member
 */
public class NewClass9 {
    public static int biaya(String kategori, String jalur, int bulan) {
        int dsp, spp, biaya = 0;
        if (jalur.equalsIgnoreCase("SBMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                dsp = 5000000;
                spp = 500000;
                biaya = dsp + (spp * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                dsp = 15000000;
                spp = 1000000;
                biaya = dsp + (spp * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                dsp = 30000000;
                spp = 2000000;
                biaya = dsp + (spp * bulan);
            }
        } else if (jalur.equalsIgnoreCase("SNMPTN")) {
            if (kategori.equalsIgnoreCase("A")) {
                dsp = 7000000;
                spp = 500000;
                biaya = dsp + (spp * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                dsp = 17000000;
                spp = 1000000;
                biaya = dsp + (spp * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                dsp = 35000000;
                spp = 2000000;
                biaya = dsp + (spp * bulan);
            }
        } else if (jalur.equalsIgnoreCase("MANDIRI")) {
            if (kategori.equalsIgnoreCase("A")) {
                dsp = 10000000;
                spp = 1000000;
                biaya = dsp + (spp * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                dsp = 25000000;
                spp = 2000000;
                biaya = dsp + (spp * bulan);
            } else if (kategori.equalsIgnoreCase("C")) {
                dsp = 50000000;
                spp = 3000000;
                biaya = dsp + (spp * bulan);
            }
        }
        return biaya;
    }

    public static String kategori(int ortu) {
        String kategori = "";
        if (ortu > 10000000) {
            kategori = "C";
        } else if (ortu >= 2000000) {
            kategori = "B";
        } else if (ortu <= 2000000) {
            kategori = "A";
        }
        return kategori;
    }

    public static void main (String[] args) {

        int id, ortu, bulan;
        String nama[] = {"Mina", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "Mandiri"};
        String alamat[] = {"sawojajar", "Kedung kandang", "Ijen", "Dinoyo"};
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan id mahasiswa       = ");
        id = input.nextInt();
        if (id < 1 || id > nama.length) {
            System.out.println("sSALAH INPU NGEYELLL");
            System.exit(0);
        }
        System.out.print("masukkan pendapatan ortu    = ");
        ortu = input.nextInt();
        System.out.print("masukkan jumlah bulan spp   = ");
        bulan = input.nextInt();
        System.out.print("masukkan ID jalur masuk   = ");
        int Idjalur = input.nextInt();

        System.out.println("============hasil============");
        System.out.println("id mahasiswa              = " + id);
        System.out.println("nama mahasiswa            = " + nama[id - 1]);
        System.out.println("jalur masuk               = " + jalur[Idjalur -1]);
        System.out.println("kategori pendapatan       = " + kategori(ortu));
        String kategori = kategori(ortu);

        System.out.println("jumlah biaya              = " + biaya(kategori, jalur[Idjalur - 1], bulan));
        System.out.println("alamat                    = " + alamat[id - 1]);

    }
}
