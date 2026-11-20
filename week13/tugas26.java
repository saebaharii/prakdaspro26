package week13;
import java.util.Scanner;

public class tugas26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[2][4];
        for (int i=0; i < survei.length; i++){ //loop responden
            System.out.println("Responden ke "+ (i + 1));
            int totalR=0; //inisialisasi untuk total responden
            for (int j=0; j < survei[i].length; j++){ //loop pertanyaan
                System.out.print("Jawaban pertanyaan ke " + (j + 1) + " : ");
                survei[i][j] = sc.nextInt();
                if (survei[i][j] < 1 || survei[i][j] > 5) { //validasi input
                    System.out.println("Jawaban tidak valid, masukkan jawaban(1-5)!");
                    j--; //mengulang jika input tidak valid
                    continue;
                }
                totalR += survei[i][j];//memasukan nilai setiap pertanyaan ke totalR
            }
            double rataR = (double) totalR / survei[i].length; //perhitungan rata" responden
            System.out.printf(" Rata-rata responden ke %d: %.2f%n", i + 1, rataR);
        }
        System.out.println("---Rata-rata setiap pertanyaan---");
        for (int i = 0; i < survei[0].length; i++) {
            int totalP = 0;
            for (int j = 0; j < survei.length; j++) {
                totalP += survei[j][i];
            }
            double rataP = (double) totalP / survei.length;
            System.out.printf("Rata-rata pertanyaan ke %d: %.2f%n", i + 1, rataP);
        }
        int totalSemua = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalSemua += survei[i][j];
            }
        }
        double rataSemua = (double) totalSemua / (survei.length * survei[0].length);
        System.out.printf("\nRata-rata keseluruhan: %.2f%n", rataSemua);
        sc.close();
    }
}
