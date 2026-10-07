package week7;
import java.util.Scanner;

public class studiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        diskon = 0;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = sc.nextInt();
        totalHarga = hargaPerCup * jumlahCup;

        if (totalHarga > 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            totalBayar = totalHarga - diskon;
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: " + totalBayar);
                if (uangBayar >= totalBayar) {
                kembalian = uangBayar - totalBayar;
                System.out.println("Kembalian: " + kembalian);
                } else {
                    kurang = totalBayar - uangBayar;
                    System.out.println("Uang tidak cukup, kurang Rp. " + kurang);
            }
        }
    }
}
