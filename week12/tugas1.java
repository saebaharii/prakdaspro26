package week12;
import java.util.Arrays;
import java.util.Scanner;
public class tugas1 {
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
        int mhsLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++) { //kembali menjadi for loop biasa
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        int tertinggi = nilaiMhs[0]; int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
                if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
