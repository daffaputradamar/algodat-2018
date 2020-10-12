/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarunittesting;
import org.junit.*;
/**
 *
 * @author ASUS
 */
public class PengolahPesanTest{
    private final PengolahPesan pengolahPesan;

    public PengolahPesanTest() {
        this.pengolahPesan = new PengolahPesan();
        this.pengolahPesan.setPengirim("Adi");
        this.pengolahPesan.setPenerima("Budi");
        this.pengolahPesan.setPesan("Halo!");
    }
    
    @Test
    public void testHitungPanjangPesan() {
        System.out.println("* Menguji unit: testHitungPanjangPesan()");
        
        int hasilSeharusnya = 5;
        
        Assert.assertEquals("Panjang pesan tidak sesuai", hasilSeharusnya, this.pengolahPesan.hitungPanjangPesan());

        System.out.println("* Tes OK!");
    }
    
    @Test
    public void testRangkaiPesan() {
        System.out.println("* Menguji unit: testRangkaiPesan()");
        
        String hasilSeharusnya = "Halo Budi, Anda mendapat pesan dari Adi, "
                + "Berikut pesannya:\nHalo!";
        
        Assert.assertEquals(hasilSeharusnya, this.pengolahPesan.rangkaiPesan());
        
        System.out.println("* Tes OK!");
    }
}
