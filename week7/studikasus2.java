package week7;

import java.util.Scanner;

public class studikasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int lolosPendanaan;
        int jumlahDokumen;
        int jumlahDokumenKurang = 0;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            int peringkatJuara = sc.nextInt();
            if (peringkatJuara > 0 && peringkatJuara <= 3) {
                System.out.print("Jumlah dokumen: ");
                jumlahDokumen = sc.nextInt();
                    if (jumlahDokumen < 4 ){
                        jumlahDokumenKurang = 4 - jumlahDokumen;
                        System.out.println("Status : Dokumen tidak lengkap (kurang " + jumlahDokumenKurang + " dokumen). Dana penghargaan tidak diberikan.");
                    } else {
                        System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                    }
            } else{
                System.out.println("Status : Tidak mendapat juara, dana penghargaan tidak diberikan");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Apakah lolos pendanaan? (1/0): ");
            lolosPendanaan = sc.nextInt(); 
            if (lolosPendanaan == 1) {
                System.out.println("Status : Lolos pendanaan. Dana penghargaan diberikan.");
            } else if (lolosPendanaan == 0) {
                System.out.println("Status : Tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            } else {
                System.out.println("Status : Input tidak valid. Dana penghargaan tidak diberikan."); 
            }
        } else {
            System.out.println("Status : Jenis kegiatan tidak memenuhi syarat. Dana penghargaan tidak diberikan.");
        }
    }
}
