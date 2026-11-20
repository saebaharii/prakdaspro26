import java.util.Scanner;
public class matdas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String teks = input.nextLine();

        int n = teks.length();
        long hasil = faktorial(n);

        boolean[] sudahDihitung = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!sudahDihitung[i]) {
                int jumlah = 0;

                for (int j = i; j < n; j++) {
                    if (teks.charAt(i) == teks.charAt(j)) {
                        jumlah++;
                        sudahDihitung[j] = true;
                    }
                }

                hasil /= faktorial(jumlah);
            }
        }

        System.out.println("Jumlah string berbeda: " + hasil);
        input.close();
    }

    static long faktorial(int angka) {
        long hasil = 1;

        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }

        return hasil;
    }
}
