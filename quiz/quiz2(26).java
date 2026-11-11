import java.util.Scanner;
public class quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ketentuan awal
        String nama="Saefira";
        int noAbsen= 26;
        int k = noAbsen % 5;
        System.out.println("Nama: " + nama);
        System.out.println("Kode Personal K : " + k);
        //pengerjaan soal
        System.out.println(" ");
        System.out.print("Masukkan jumlah kurir: ");
        int jumlahKurir = scanner.nextInt();
        while (jumlahKurir < 1) { //while disini saya gunakan sebagai aturan agar jumlah kurir tidak boleh kurang dari 1, karena jika kurang dari 1 maka tidak ada kurir yang mengirim paket
            System.out.println("Jumlah kurir tidak valid. Silakan masukkan jumlah kurir antara 1-10.");
            System.out.print("Masukkan jumlah kurir: ");
            jumlahKurir = scanner.nextInt();
            
        }
        int paketBesar = 0;
        int ongkirTertinggi = 0;
        int kurirTerbaik = 0;
        for (int i = 1; i <= jumlahKurir; i++) { //looping untuk setiap kurir jumlah berdasarkan input
            System.out.println("Kurir ke-" + i);
            System.out.print("  Masukkan jumlah paket: ");
            int jumlahPaket = scanner.nextInt();
            while (jumlahPaket < 1) { //validasi jumlah paket menggunakan while
                System.out.println("Jumlah paket tidak valid. Silakan masukkan jumlah paket antara 1-10.");
                System.out.print("Masukkan jumlah paket: ");
                jumlahPaket = scanner.nextInt();
            }
            int totalBayar = 0;
            double rataRata = 0;
            int bayarAdmin = k * 500; //perhitungan biaya admin berdasarkan kode personal K
            int bayarAkhir = 0;
            // int ongkirTertinggi = 0;
            for (int j = 1; j <= jumlahPaket; j++) { //looping untuk setiap paket
                System.out.print("      Berat paket ke-" + j + " (kg): ");
                double beratPaket = scanner.nextDouble();
                int harga;
                if (beratPaket <= 1) {
                    harga = 8000;
                } else if (beratPaket <= 10) {
                    harga = 20000;
                } else {
                    harga = 40000;
                    paketBesar++;
                }
                //perhitungan total bayar, bayar akhir, dan rata-rata bayar
                totalBayar += harga;
                bayarAkhir = totalBayar + bayarAdmin;
                rataRata = bayarAkhir/jumlahPaket;
            }
            System.out.println("Total Bayar + K: " + bayarAkhir);
            System.out.println("Rata-Rata Bayar: " + String.format("%.2f", rataRata));
            if (bayarAkhir > ongkirTertinggi) {
                ongkirTertinggi = bayarAkhir;
                kurirTerbaik = i;
            }
        }
        System.out.println("============================");
        System.out.println("Ongkir Tertinggi: " + ongkirTertinggi);
        System.out.println("Kurir terbaik: Kurir ke-" + kurirTerbaik);
        System.out.println("Jumlah paket besar: " + paketBesar);
    }
}
