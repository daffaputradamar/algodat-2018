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
public class HitungBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang br = new Barang();
        
        br.kode = "123";
        br.namaBarang = "Pensil";
        br.hargaDasar = 3000;
        br.diskon = 10;
        
        br.tampilData();
    }
    
}

