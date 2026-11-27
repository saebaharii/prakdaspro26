import java.util.Scanner;
public class bankSampah26 {
    static final double harga = 3000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah nasabah: ");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("Jumlah nasabah tidak valid");
            return;
        }
        double[] setoran = setoran(n);
        tampilSetoran(setoran);
        double total =totalSetoran(setoran);
        System.out.println("Total setoran: " + total);
        System.out.println("---Saldo Nasabah ---");
        for (int i=0; i< setoran.length; i++){
            double saldo= hitungSaldo(setoran[i], harga);
            System.out.println("Nasabah ke-" + (i + 1) + ": Rp" + saldo);
        }
        int indeks = nasabahTerbanyak(setoran);
        System.out.println("--- Setoran Terbesar ---");
        System.out.println("Nasabah ke-" + (indeks + 1));
        System.out.println("Berat setoran: " + setoran[indeks] + " kg");

    }
    static double[] setoran(int n){
        Scanner sc = new Scanner(System.in);
        double[] setoran = new double[n];
        for (int i=0; i<n; i++){
            System.out.println("Masukkan berat setoran nasabah ke-" + (i+1)+ "(kg): ");
            setoran[i]= sc.nextDouble();
        }
        return setoran;
    }
    static void tampilSetoran(double[]setoran){
        System.out.println("--- Data Setoran Nasabah ---");
        for (int i=0; i < setoran.length; i++){
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i] + " kg");
        }
    }
    static double totalSetoran(double [] setoran){
        double total=0;
        for(int i=0; i<setoran.length; i++){
            total+=setoran[i];
        }
        return total;
    }
    static double hitungSaldo(double beratSetoran, double hargaPerKg) {
        double saldo = beratSetoran * hargaPerKg;
        return saldo;
    }
        static int nasabahTerbanyak(double[] setoran) {
        double terbesar = setoran[0];
        int indeksTerbesar = 0;

        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > terbesar) {
                terbesar = setoran[i];
                indeksTerbesar = i;
            }
        }
        return indeksTerbesar;
    }

}
