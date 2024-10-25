import java.util.Scanner;

public class StokBarang10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double stok, hargaPerUnit, totalNilaiStok, nilaiPermintaan;
        String namaBarang, input;

        while (true) {
            System.out.print("Masukkan Nama Barang (Ketik 'Selesai' Untuk Berhenti): ");
            namaBarang = sc.nextLine();

            if (namaBarang.equalsIgnoreCase("Selesai")) {
                break;
            }
            System.out.print("Masukkan Jumlah Stok " + namaBarang + ": ");
            stok = sc.nextDouble();
            System.out.print("Masukkan Harga Per Unit " + namaBarang + ": ");
            hargaPerUnit = sc.nextDouble();
            sc.nextLine();
            totalNilaiStok = stok * hargaPerUnit;
            System.out.println("Total Harga Stok " + namaBarang + " Adalah: " + totalNilaiStok);
            System.out.print("Masukkan Jumlah Permintaan Untuk " + namaBarang + ": ");
            double permintaan = sc.nextDouble();
            sc.nextLine();

            if (permintaan <= stok) {
                stok -= permintaan;
                System.out.println("Permintaan Terpenuhi. Stok Tersisa Untuk " + namaBarang + ": " + stok);
                nilaiPermintaan = permintaan * hargaPerUnit;
                System.out.println("Total Harga Permintaan " + namaBarang + " Adalah: " + nilaiPermintaan);
            } else {
                System.out.println("Permintaan Melebihi Stok. Stok Tidak Mencukupi.");
            }
            System.out.print("Apakah Anda Ingin Menyesuaikan Stok? (Ya/Tidak): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("Ya")) {
                System.out.print("Masukkan Jumlah Penyesuaian Stok (Angka Negatif Untuk Mengurangi Stok): ");
                double penyesuaianStok = sc.nextDouble();
                sc.nextLine();
                stok += penyesuaianStok;
                System.out.println("Stok Baru Untuk " + namaBarang + " Adalah: " + stok);
            }
        }
        sc.close();
        System.out.println("Program Selesai.");
    }
}
