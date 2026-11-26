public class pengunjung26 {
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Nomor Meja: " + nomorMeja);
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int nilai : harga) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(1, tamu);

        System.out.println("Total 1 harga: Rp" + hitungTotalBelanja(10000));
        System.out.println("Total 3 harga: Rp" + hitungTotalBelanja(10000, 15000, 20000));
        System.out.println("Total 5 harga: Rp" + hitungTotalBelanja(10000, 15000, 20000, 25000, 30000));
    }
}
