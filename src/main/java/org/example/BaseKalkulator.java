package org.example;

public class BaseKalkulator {

    public static void main(String[] args) {

        System.out.println("Kalkulator");

        hasilPerhitunganTambah();
        hasilKurang();
        hasilKali();
        hasilBagi();


    }

    public static void hasilPerhitunganTambah() {
        System.out.println("TEST PENJUMLAHAN:");


        int hasil = OperasiAritmatika.tambah(120, 23);
        System.out.println("  120 + 23 = " + hasil);


        System.out.println();
    }


    public static void hasilKurang() {
        System.out.println("TEST Pengurangan:");


        int hasil = OperasiAritmatika.kurang(10, 5);
        System.out.println("  10 - 5 = " + hasil);

        System.out.println();

    }

    public static void hasilKali() {
        System.out.println("TEST Kali:");


        int hasil = OperasiAritmatika.kali(10, 5);
        System.out.println("  10 x 5 = " + hasil);


        System.out.println();

    }

    public static void hasilBagi() {
        System.out.println("TEST Bagi:");


        int hasil = OperasiAritmatika.kali(10, 2);
        System.out.println("  20 / 2 = " + hasil);


        System.out.println();

    }
}
