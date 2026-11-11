package week12;
import java.util.Scanner;
public class arrayRataNilai26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: "); //input jumlah mhs
        int jumlahMhs = input.nextInt();
        while (jumlahMhs <= 0) { //validasi jumlah mhs
            System.out.print("Jumlah mahasiswa harus lebih dari 0. Masukkan kembali: ");
            jumlahMhs = input.nextInt();
        }
        int[] nilaiMhs = new int[jumlahMhs];// memasukan jumlah mhs sebagai jumlah indeks
        int total = 0; double rata2;
        int mhsLulus = 0; //variabel
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) { // menambahkan if
                mhsLulus++;
            }
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus: " + mhsLulus);
        int tertinggi = nilaiMhs[0]; int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
                if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        String predikat;
        if (rata2 >= 85) {
            predikat = "Sangat Baik";
        } else if (rata2 >= 70) {
            predikat = "Baik";
        } else {
            predikat = "Perlu Pendampingan";
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat: " + predikat);
        
    }
}
