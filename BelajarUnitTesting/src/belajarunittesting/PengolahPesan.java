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
public class PengolahPesan {
    private String pengirim, penerima, pesan;

    public PengolahPesan() {
        this.pengirim = "";
        this.penerima = "";
        this.pesan = "";
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    
    public void tampilkanPesan() {
        String pesanTerkirim = this.rangkaiPesan();
        
        System.out.println(pesanTerkirim);
    }
    
    public int hitungPanjangPesan() {
//        return 0;
        return this.pesan.length();
    }
    
    public String rangkaiPesan() {
        String pesanTerkirim = String.format("Halo %s, Anda mendapat pesan dari %s, Berikut pesannya:\n%s", 
                this.penerima, this.pengirim, this.pesan);
        return pesanTerkirim;
    }
}
