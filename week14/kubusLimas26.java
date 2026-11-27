import java.util.Scanner;

public class kubusLimas26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("===== MENU PERHITUNGAN =====");
            System.out.println("1. Hitung luas persegi");
            System.out.println("2. Hitung volume kubus");
            System.out.println("3. Hitung luas permukaan kubus");
            System.out.println("4. Hitung volume limas persegi");
            System.out.println("0. Keluar");
            System.out.println("============================");
            System.out.print("Silakan pilih menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: {
                    System.out.print("Masukkan sisi: ");
                    int s = sc.nextInt();
                    System.out.println("Luas persegi adalah " + luasPersegi(s));
                    break;
                }
                case 2: {
                    System.out.print("Masukkan sisi: ");
                    int s = sc.nextInt();
                    System.out.println("Volume kubus adalah " + volumeKubus(s));
                    break;
                }
                case 3: {
                    System.out.print("Masukkan sisi: ");
                    int s = sc.nextInt();
                    System.out.println("Luas permukaan kubus adalah " + luasPermukaanKubus(s));
                    break;
                }
                case 4: {
                    System.out.print("Masukkan sisi: ");
                    int s = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int t = sc.nextInt();
                    System.out.println("Volume limas persegi adalah " + volumeLimasPersegi(s, t));
                    break;
                }
                case 0:
                    berjalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }

        sc.close();
    }

    static int luasPersegi(int s) {
        return s * s;
    }

    static int volumeKubus(int s) {
        return s * s * s;
    }

    static int luasPermukaanKubus(int s) {
        return 6 * luasPersegi(s);
    }

    static double volumeLimasPersegi(int s, int t) {
        return (double) luasPersegi(s) * t / 3;
    }
}
