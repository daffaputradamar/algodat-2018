/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarunittesting;

/**
 *
 * @author ASUS
 */
public class BelajarUnitTesting {
    public static void main(String[] args) {
        PengolahPesan pp = new PengolahPesan();
        pp.setPengirim("Adi");
        pp.setPenerima("Budi");
        pp.setPesan("Halo, apa kabar Bro?");
        pp.tampilkanPesan();
        System.out.println("Total panjang pesan: " + pp.hitungPanjangPesan());
    }
}
