/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamangame;

/**
 *
 * @author ASUS
 */
public class Peminjaman {
    public String id, namaMember, namaGame;
    public int harga, lamaSewa;
    
    public void tampilData() {
        System.out.println("Id          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
        System.out.println("Lama Sewa   : " + lamaSewa);
    }
    
    public int hargaBayar() {
        int hargaBayar = harga * lamaSewa;
        return hargaBayar;
    }
}
