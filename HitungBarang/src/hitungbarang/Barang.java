/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbarang;

/**
 *
 * @author ASUS
 */
public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual() {
        float diskonInDecimal = diskon/100;
        float jumlahDiskon = hargaDasar * diskonInDecimal;
        float hargaJual = hargaDasar - jumlahDiskon;
        return Math.round(hargaJual);
    }
    
    public void tampilData() {
        System.out.println("Kode Barang :"+kode);
        System.out.println("Nama Barang :" + namaBarang);
        System.out.println("Harga Dasar :" + hargaDasar);
        System.out.println("Diskon      :" + diskon + " %");
        System.out.println("Harga Jual  :" + hitungHargaJual());
    }
}
