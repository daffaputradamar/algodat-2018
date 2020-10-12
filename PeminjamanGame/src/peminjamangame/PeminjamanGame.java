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
public class PeminjamanGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peminjaman pnjm = new Peminjaman();
        
        pnjm.id = "123";
        pnjm.namaMember = "Daffa";
        pnjm.namaGame = "BattleRoyale";
        pnjm.lamaSewa = 2;
        pnjm.harga = 5000;
        
        pnjm.tampilData();
        System.out.println("Harga Bayar: " + pnjm.hargaBayar());
    }
    
}
