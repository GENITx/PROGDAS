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
public class NewClass8 {
    static int pendapatan(String awal, String akhir, int gol) {
        int pendapatan = 0;
        if (awal.equalsIgnoreCase("Dupak")) {
            if (akhir.equalsIgnoreCase("Waru")) {
                if (gol == 1) {
                    pendapatan = 5000;
                } else if (gol == 2) {
                    pendapatan = 8000;
                } else if (gol == 3) {
                    pendapatan = 8000;
                }
            } else {
                System.out.println("Maaf tujuan anda tidak ada");
            }

        } else if (awal.equalsIgnoreCase("Waru")) {
            if (akhir.equalsIgnoreCase("Sidoarjo")) {
                if (gol == 1) {
                    pendapatan = 6000;
                } else if (gol == 2) {
                    pendapatan = 9000;
                } else if (gol == 3) {
                    pendapatan = 9000;
                }
            } else if (akhir.equalsIgnoreCase("Porong")) {
                if (gol == 1) {
                    pendapatan = 9000;
                } else if (gol == 2) {
                    pendapatan = 14000;
                } else if (gol == 3) {
                    pendapatan = 14000;
                }
            } else {
                System.out.println("Maaf tujuan anda tidak ada");
            }

        } else if (awal.equalsIgnoreCase("Sidoarjo")) {
            if (akhir.equalsIgnoreCase("Waru")) {
                if (gol == 1) {
                    pendapatan = 6000;
                } else if (gol == 2) {
                    pendapatan = 9000;
                } else if (gol == 3) {
                    pendapatan = 9000;
                } else {
                    System.out.println("Maaf tujuan anda tidak ada");
                }
            } else if (akhir.equalsIgnoreCase("Porong")) {
                if (gol == 1) {
                    pendapatan = 5500;
                } else if (gol == 2) {
                    pendapatan = 8500;
                } else if (gol == 3) {
                    pendapatan = 8500;
                }
            } else {
                System.out.println("Maaf tujuan anda tidak ada");
            }

        } else if (awal.equalsIgnoreCase("Porong")) {
            if (akhir.equalsIgnoreCase("Sidoarjo")) {
                if (gol == 1) {
                    pendapatan = 5500;
                } else if (gol == 2) {
                    pendapatan = 8500;
                } else if (gol == 3) {
                    pendapatan = 8500;
                }
            } else if (akhir.equalsIgnoreCase("Waru")) {
                if (gol == 1) {
                    pendapatan = 9000;
                } else if (gol == 2) {
                    pendapatan = 14000;
                } else if (gol == 3) {
                    pendapatan = 14000;
                }
            } else if (akhir.equalsIgnoreCase("Kejapan")) {
                if (gol == 1) {
                    pendapatan = 6000;
                } else if (gol == 2) {
                    pendapatan = 8500;
                } else if (gol == 3) {
                    pendapatan = 8500;
                }
            } else {
                System.out.println("Maaf tujuan anda tidak ada");
            }

        } else if (awal.equalsIgnoreCase("Kejapan")) {
            if (akhir.equalsIgnoreCase("Gempol")) {
                if (gol == 1) {
                    pendapatan = 3000;
                } else if (gol == 2) {
                    pendapatan = 5000;
                } else if (gol == 3) {
                    pendapatan = 5000;
                }
            } else {
                System.out.println("Maaf tujuan anda tidak ada");
            }
        }
        return pendapatan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal = 0, akhir = 0, gol = 0;
        String daerahAwal[] = {"Dupak", "Waru", "Sidoarjo", "Porong", "Kejapan"};
        String daerahAkhir[] = {"Waru", "Sidoarjo", "Porong", "Kejapan", "gempol"};
        String golongan[] = {"Sedan, Jip, Pick Up", "Truk dengan 2 sumbu roda", "Truk dengan 3 sumbu roda"};

        System.out.print("Masukkan ID Daerah Awal        = ");
        awal = input.nextInt();
        if (awal < 1 || awal > daerahAwal.length) {
            System.out.println("ID Daerah Tidak Ada");
            System.exit(0);
        }
        System.out.print("Masukkan ID Daerah Akhir       = ");
        akhir = input.nextInt();
        if (akhir < 1 || akhir > daerahAkhir.length) {
            System.out.println("ID Tujuan Daerah Tidak Ada");
            System.exit(0);
        }
        System.out.print("Masukkan ID Golongan Kendaraan = ");
        gol = input.nextInt();
        if (gol < 1 || gol > golongan.length) {
            System.out.println("ID Kendaraan Tidak ada");
            System.exit(0);
        }
        System.out.println("========================================");
        System.out.println("Daerah Awal                  = " + daerahAwal[awal - 1]);
        System.out.println("Daerah Akhir                 = " + daerahAkhir[akhir - 1]);
        System.out.println("Golongan Kendaraan           = " + golongan[gol - 1]);
        System.out.println("Biaya yang harus dikeluarkan = Rp." + pendapatan(daerahAwal[awal - 1], daerahAkhir[akhir - 1], gol));

    }
}
