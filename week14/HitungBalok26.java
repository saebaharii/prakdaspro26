import java.util.Scanner;
public class HitungBalok26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Balok ke-" + i);
            System.out.print("Masukkan panjang: ");
            int p = input.nextInt();
            System.out.print("Masukkan lebar: ");
            int l = input.nextInt();
            System.out.print("Masukkan tinggi: ");
            int t = input.nextInt();

            int luas = hitungLuas(p, l);
            int luasPermukaan = hitungLuasPermukaanBalok(p, l, t);
            int vol = hitungVolume(t, p, l);
            System.out.println("Luas persegi panjang adalah " + luas);
            System.out.println("Luas permukaan balok adalah " + luasPermukaan);
            System.out.println("Volume balok adalah " + vol);
        }
        input.close();
    }
    static int hitungLuas(int pjg, int lb){
        int luas = pjg *lb;
        return luas;
    }
    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }
}
