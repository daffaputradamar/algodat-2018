/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitunglingkaran;

/**
 *
 * @author ASUS
 */
public class HitungLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkar = new Lingkaran();
        
        lingkar.phi = 3.14;
        lingkar.r = 10;
        
        System.out.println("Luas        :" + lingkar.hitungLuas());
        System.out.println("Keliling    :" + lingkar.hitungKeliling());
    }
    
}
