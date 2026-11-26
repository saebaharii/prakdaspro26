package week14;
import java.util.Scanner;
public class kafe26 {
    public static int hitungTotalHarga26(int pilihanMenu, int banyakItem) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    return hargaTotal;
}

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int persentaseDiskon = 0;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            persentaseDiskon = 50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            persentaseDiskon = 30;
        } else {
            System.out.println("Kode promo invalid");
        }
        if (isMember) {
            persentaseDiskon += 10;
        }
        return total * persentaseDiskon / 100;
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
    System.out.println("Selamat datang, "+ namaPelanggan +"!");
    if(isMember){
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("==========================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        int totalBayar = 0;
        String ulang = "y";
        while (ulang.equalsIgnoreCase("y")) {
            System.out.print("\nMasukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
            } else {
                System.out.print("Masukkan jumlah item: ");
                int banyakItem = sc.nextInt();
                int harga = hitungTotalHarga26(pilihanMenu, banyakItem);
                totalBayar += harga;
                System.out.println("Subtotal pesanan: Rp" + harga);
            }
            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            ulang = sc.next();
        }
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();
        int diskon = hitungDiskon(totalBayar, kodePromo, true);
        System.out.println("\nTotal harga: Rp" + totalBayar);
        System.out.println("Besar diskon: Rp" + diskon);
        System.out.println("Total yang harus dibayar: Rp" + (totalBayar - diskon));
    }
}