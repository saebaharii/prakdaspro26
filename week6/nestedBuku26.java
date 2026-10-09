package week6;
import java.util.Scanner;

public class nestedBuku26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah hari ini adalah hari Rabu? (true/false): ");
        boolean isRabu = sc.nextBoolean();

        if (isRabu) {
            System.out.println("Selamat, Anda akan mendapatkan diskon!");
            System.out.print("Apakah jenis buku adalah kamus? (true/false): ");
            boolean isKamus = sc.nextBoolean();

            if (isKamus) {
                System.out.println("Anda mendapatkan diskon 10%");
                System.out.print("Masukkan jumlah kamus yang dibeli: ");
                int jumlahKamus = sc.nextInt();
                    if (jumlahKamus > 2) {
                        System.out.println("Anda mendapat tambahan diskon 2%, total diskon Anda 12%");
                    }
            } else {
                System.out.print("Apakah jenis buku adalah novel? (true/false): ");
                boolean isNovel = sc.nextBoolean();

                if (isNovel) {
                    System.out.println("Anda mendapatkan diskon 7%");
                    System.out.print("Masukkan jumlah novel yang dibeli: ");
                    int jumlahNovel = sc.nextInt();
                        if (jumlahNovel > 3) {
                            System.out.println("Anda mendapat tambahan diskon 2%, total diskon Anda 9%");
                        } else {
                            System.out.println("Anda mendapatkan diskon 1%");
                        }
                } else {
                    System.out.print("Masukkan jumlah buku: ");
                    int jumlahBuku = sc.nextInt();
                        if (jumlahBuku > 3) {
                            System.out.println("Anda mendapat diskon 5%");
                        } else {
                            System.out.println("Anda tidak mendapatkan diskon, diskon saat ini 0%");
                        }
                }
            }
        } else {
            System.out.println("Hari ini bukan hari Rabu, tidak ada diskon.");
        }
        sc.close();
    }
}
