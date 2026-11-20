package week13;
import java.util.Scanner;
public class bioskopScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    do {
                            System.out.print("Masukkan nama: ");
                            nama = sc.nextLine();

                            while (true) {
                                System.out.print("Masukkan baris: ");
                                baris = sc.nextInt();

                                System.out.print("Masukkan kolom: ");
                                kolom = sc.nextInt();
                                sc.nextLine();

                                if (baris < 1 || baris > penonton.length ||
                                    kolom < 1 || kolom > penonton[0].length) {
                                    System.out.println("Nomor baris atau kolom tidak tersedia!");
                                } else if (penonton[baris - 1][kolom - 1] != null) {
                                    System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                                } else {
                                    break;
                                }
                            }

                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data berhasil ditambahkan!");

                            System.out.print("Input penonton lainnya? (y/n): ");
                            pilihan = sc.nextLine();

                        } while (pilihan.equalsIgnoreCase("y"));
                        break;
                case 2:
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(
                                (penonton[i][j] == null ? "***" : penonton[i][j]) + "\t"
                            );
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan menu tidak tersedia!");
            }
        }
    }
}