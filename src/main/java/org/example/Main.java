package org.example;

public class Main {

    public static class Mobil { //Object


        String merk; //Attribute
        int tahun; //Attribute


        void nyalakanMesin() { //Method
            System.out.println(merk + " tahun " + tahun + " Siap Jalan ");
        }
    }


    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        m1.merk = "Honda";
        m1.tahun = 2022;
        m1.nyalakanMesin();
    }

}
