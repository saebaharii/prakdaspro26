package week12;
import java.util.Arrays;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        System.out.print("Masukkan makanan yang ingin dicari: ");
        boolean ditemukan = false;
        String key = input.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                System.out.println("Makanan " + key + " ditemukan pada indeks ke-" + i);
                System.out.println("Harga: " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Makanan yang dicari (" + key + ") tidak ditemukan dalam array ");
        }
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jmlhPesanan = input.nextInt();
        while (jmlhPesanan <= 0) {
            System.out.print("Jumlah item harus lebih dari 0. Masukkan kembali: ");
            jmlhPesanan = input.nextInt();
        }
        input.nextLine();
        String[] pesanan = new String[jmlhPesanan];
        int totalBiaya = 0;
        for (int i = 0; i < pesanan.length; i++) {
            boolean menuValid = false;
            while (!menuValid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaPesanan = input.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan.trim())) {
                        pesanan[i] = menu[j];
                        totalBiaya += harga[j];
                        menuValid = true;
                        break;
                    }
                }
                if (!menuValid) {
                    System.out.println("Menu tidak tersedia. Pilih dari: " + Arrays.toString(menu));
                }
            }
        }
        System.out.println("======= Struk Pesanan =======");
        System.out.println("Daftar pesanan: " + Arrays.toString(pesanan));
        System.out.println("Total biaya: Rp" + totalBiaya);
    }
}
