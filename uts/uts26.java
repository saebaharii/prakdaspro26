//Saefira Bahari TI/1D absen 26
package uts;
import java.util.Scanner;
//Saefira Bahari TI/1D absen 26
public class uts26 {
    public static void main(String[] args) {
        //Deklarasi scanner dan variabel
        Scanner sc = new Scanner(System.in);
        String senjata, bagianTubuh;
        int damage = -1;
        double penguranganRompi = 0, damageAkhir;

        //input dari yang dapat dimasukan
        System.out.print("Masukkan jenis senjata (AR/SMG/Sniper): ");
        senjata = sc.nextLine();
        System.out.print("Masukkan bagian tubuh yang terkena (Kepala/Badan): ");
        bagianTubuh = sc.nextLine();

        //logika untuk menentukan damage dan pengurangan rompi berdasarkan senjata dan bagian tubuh
        if (senjata.equalsIgnoreCase("AR")) { //untuk senjata AR
            if (bagianTubuh.equalsIgnoreCase("Kepala")) {
                damage = 60;
            } else if (bagianTubuh.equalsIgnoreCase("Badan")) {
                damage = 35;
                penguranganRompi = 0.2;
            } else {
                System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/Sniper) dan bagian = (kepala/badan).");
            }
        } else if (senjata.equalsIgnoreCase("SMG")) { //untuk senjata SMG
            if (bagianTubuh.equalsIgnoreCase("Kepala")) {
                damage = 45;
            } else if (bagianTubuh.equalsIgnoreCase("Badan")) {
                damage = 25;
            } else {
                System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/Sniper) dan bagian = (kepala/badan).");
            }
            penguranganRompi = 0.3;
        } else if (senjata.equalsIgnoreCase("Sniper")) { //untuk senjata Sniper
            if (bagianTubuh.equalsIgnoreCase("Kepala")) {
                damage = 0;
                penguranganRompi =0;
                System.out.println("HEADSHOT! Musuh langsung knock.");
            } else if (bagianTubuh.equalsIgnoreCase("Badan")) {
                damage = 90;
                penguranganRompi = 0;
            } else {
                System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/Sniper) dan bagian = (kepala/badan).");
            }
        } else { //jika senjata dan bagian tubuh tidak sesuai
            System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/Sniper) dan bagian = (kepala/badan).");
        }
        //jika damage = -1 maka program akan berhenti
        if (damage == -1) {
            sc.close();
            return;
        }
        //menghitung damage akhir setelah pengurangan rompi
        damageAkhir = damage * (1 - penguranganRompi);
        //output akhir
        System.out.println("Senjata (AR/SMG/SNIPER): " + senjata);
        System.out.println("Bagian tubuh (Kepala/Badan): " + bagianTubuh);
        System.out.println("Damage dasar: " + damage);
        System.out.println("Pengurangan rompi: " + penguranganRompi);
        System.out.printf("Damage akhir: %.2f%n", damageAkhir); //formatting output dengan 2 angka dibelakang koma
    }
}
