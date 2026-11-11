package week12;
import java.util.Arrays;
import java.util.Scanner;
public class searchNilai26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: "); //input jumlah nilai
        int jumlahNilai = input.nextInt();
        while (jumlahNilai <= 0) { //validasi jumlah nilai
            System.out.print("Jumlah nilai harus lebih dari 0. Masukkan kembali: ");
            jumlahNilai = input.nextInt();
        }
        int[] nilai = new int[jumlahNilai];
        System.out.println("Masukkan " + jumlahNilai + " nilai:");
        for (int i = 0; i < jumlahNilai; i++) { //input nilai ke dalam array
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: "); //input nilai yang ingin dicari
        int key = input.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) { //loop untuk mencari nilai
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan dalam array "
            + Arrays.toString(nilai) + ".");
        }
    }
}
