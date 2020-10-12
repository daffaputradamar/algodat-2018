package enkapkoperasi;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());
        
        boolean lagi = true;
        
        do {
            switch (menu()) {
                case 1:
                    System.out.print("jumlah: ");
                    int pinjam = sc.nextInt();
                    donny.pinjam(pinjam);
                    break;
                case 2:
                    System.out.print("jumlah: ");
                    int angsur = sc.nextInt();
                    donny.angsur(angsur);
                    break;
                case 3:
                    lagi = false;
                    break;
            }
            System.out.println("Limit Pinjaman: "+ donny.getLimitPeminjaman());
            System.out.println("Jumlah Pinjaman: "+donny.getJmlPeminjaman());
        } while (lagi);
    }
    
    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Pinjam");
        System.out.println("2. Angsur");
        System.out.println("3. Keluar");
        System.out.print("Pilihan: ");
        int pilih = sc.nextInt();
        return pilih;
    }
}
