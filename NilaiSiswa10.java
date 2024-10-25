import java.util.Scanner;

public class NilaiSiswa10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlSiswa = 0, atasRataRata = 0, bawahRataRata = 0;
        double nilai, totalNilai = 0;
        String inputNama;

        while (true) {
            System.out.print("Masukkan Nama Siswa (Ketik 'Selesai' Untuk Berhenti): ");
            inputNama = sc.nextLine();

            if (inputNama.equalsIgnoreCase("Selesai")) {
                break;
            }
            System.out.print("Masukkan Nilai " + inputNama + ": ");
            nilai = sc.nextDouble();
            sc.nextLine();

            totalNilai += nilai;
            jmlSiswa++;

            double rataRataSementara = totalNilai / jmlSiswa;

            if (nilai > rataRataSementara) {
                atasRataRata++;
            } else {
                bawahRataRata++;
            }
        }
        if (jmlSiswa > 0) {
            double rataRataAkhir = totalNilai / jmlSiswa;
            System.out.println("Rata-Rata Nilai Kelas: " + rataRataAkhir);

            System.out.println("Jumlah Siswa Dengan Nilai Di Atas Rata-Rata: " + atasRataRata);
            System.out.println("Jumlah Siswa Dengan Nilai Di Bawah Rata-Rata: " + bawahRataRata);

            if (atasRataRata > jmlSiswa / 2) {
                System.out.println("Mayoritas Siswa Memiliki Nilai Di Atas Rata-Rata.");
            } else {
                System.out.println("Mayoritas Siswa Memiliki Nilai Di Bawah Rata-Rata.");
            }
        } else {
            System.out.println("Tidak Ada Siswa Yang Dimasukkan.");
        }
        sc.close();
    }
}