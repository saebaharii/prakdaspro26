import java.util.Scanner;

public class rekapLaundry26 {
    public static void main(String[] args) {
        int jumlahLayanan = bacaJumlah("Jumlah layanan: ");
        int jumlahHari = bacaJumlah("Jumlah hari: ");

        layanan = new String[jumlahLayanan];
        harga = new int[jumlahLayanan];
        hari = new String[jumlahHari];
        data = new int[jumlahLayanan][jumlahHari];

        input.nextLine();
        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Nama layanan ke-" + (i + 1) + ": ");
            layanan[i] = input.nextLine();
            System.out.print("Harga per kg layanan " + layanan[i] + ": Rp");
            harga[i] = input.nextInt();
            input.nextLine();
        }
        for (int j = 0; j < jumlahHari; j++) {
            hari[j] = "Hari ke-" + (j + 1);
        }

        inputData(data);
        tampilData(data);
        System.out.println("=== TOTAL BERAT SETIAP LAYANAN ===");
        for (int i = 0; i < data.length; i++) {
            int total = totalPerLayanan(data, i);
            System.out.println(layanan[i] + ": " + total + " kg");
        }
        layananTerbesar(data);
        int indeks = hariTersibuk(data);
        System.out.println("=== HARI TERSIBUK ===");
        System.out.println("Hari: " + hari[indeks]);
        tampilPendapatan(data);
    }
    static Scanner input = new Scanner(System.in);
    static String[] layanan;
    static int[] harga;
    static String[] hari;
    static int[][] data;

    static int bacaJumlah(String label) {
        int jumlah;
        do {
            System.out.print(label);
            jumlah = input.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0.");
            }
        } while (jumlah <= 0);
        return jumlah;
    }

    static void inputData(int[][] data) {
        System.out.println("--- Input Berat Cucian ---");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Layanan: " + layanan[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Berat " + hari[j] + ": ");
                data[i][j] = input.nextInt();
            }
        }
    }

    static void tampilData(int[][] data) {
        System.out.println("================ REKAP DATA LAUNDRY ================");
        System.out.printf("%-18s", "Layanan");
        for (int j = 0; j < hari.length; j++) {
            System.out.printf("%-10s", hari[j]);
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-18s", layanan[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-10d", data[i][j]);
            }
            System.out.println();
        }
    }
    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }
    static void layananTerbesar(int[][] data) {
        int terbesar = totalPerLayanan(data, 0);
        int indeksTerbesar = 0;
        for (int i = 1; i < data.length; i++) {
            int total = totalPerLayanan(data, i);
            if (total > terbesar) {
                terbesar = total;
                indeksTerbesar = i;
            }
        }
        System.out.println("=== LAYANAN DENGAN TOTAL TERTINGGI ===");
        System.out.println("Nama layanan: " + layanan[indeksTerbesar]);
        System.out.println("Total berat: " + terbesar + " kg");
    }
    static int hariTersibuk(int[][] data) {
        int totalTerbesar = 0;
        int indeksHari = 0;
        for (int j = 0; j < data[0].length; j++) {
            int total = 0;
            for (int i = 0; i < data.length; i++) {
                total += data[i][j];
            }
            if (total > totalTerbesar) {
                totalTerbesar = total;
                indeksHari = j;
            }
        }
        return indeksHari;
    }
    static void tampilPendapatan(int[][] data) {
        int totalPendapatan = 0;
        System.out.println("=== PENDAPATAN SETIAP LAYANAN ===");
        for (int i = 0; i < data.length; i++) {
            int totalBerat = totalPerLayanan(data, i);
            int pendapatan = totalBerat * harga[i];
            System.out.println("\n" + layanan[i]);
            System.out.println("Total berat: " + totalBerat + " kg");
            System.out.println("Pendapatan: Rp" + pendapatan);
            totalPendapatan += pendapatan;
        }
        System.out.println("\nTotal pendapatan: Rp" + totalPendapatan);
    }
}
