package CicilanCalculator.src;

import java.text.NumberFormat;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    private static final int BULAN_DALAM_TAHUN = 12;
    private static final int PERCENT = 100;

    public static void main(String[] args) throws Exception {
        int hargaAwal;
        int durasiCicilan;
        double bunga;

        while (true) {
            hargaAwal = (int) readInputNumber("Harga Awal : ");
            if (hargaAwal >= 1_000_000 && hargaAwal <= 10_000_000) {
                break;
            }
            System.out.println("Harga minimal 1.000.000");
        }

        while (true) {

            durasiCicilan = (int) readInputNumber("durasi cicilan : ");
            if (durasiCicilan >= 1) {
                break;
            }
            System.out.println("durasi minimal 1");
        }

        while (true) {

            bunga = readInputNumber("bunga : ");
            if (bunga >= 0) {
                break;
            }
            System.out.println("Bunga minimal 0");
        }

        double bayaranPerBulan = (hargaAwal + (hargaAwal * (bunga / PERCENT))) / (durasiCicilan * BULAN_DALAM_TAHUN);
        tampilanBayar(bayaranPerBulan);

        double sisaBayaran;
        for (int i = 0; i < durasiCicilan * BULAN_DALAM_TAHUN; i++){
            sisaBayaran -= bayaranPerBulan;
            System.out.println(NumberFormat.getCurrencyInstance().format(sisaBayaran);
        }
    }

    public static int readInputNumber(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static void tampilanBayar(double bayaranPerBulan) {
        System.out.println("pembayaran setiap bulan");
        System.out.println(NumberFormat.getCurrencyInstance().format(bayaranPerBulan));
    }
}
