package org.example;

public class TokoBuah {
    public static void main(String[] args){


        double total = hasilHitungBelanja("Mangga", 20000, 2.5);
        double total2 = hasilHitungBelanja("Jeruk", 15000, 2.5);
        double total3 = hasilHitungBelanja("Anggur", 40000, 1);

    }

    public static double hasilHitungBelanja(String buah, int hargaPerKG, double kg){
        double totalHarga = hargaPerKG * kg;
        double totalBayar;

        System.out.println("Buah " + buah);
        System.out.println("harga " + hargaPerKG);
        System.out.println("Berat " + kg);
        System.out.println("Total " + totalHarga);
        System.out.println("----------------------------");

        return totalHarga;
    }
}
