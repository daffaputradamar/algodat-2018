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
public class Lingkaran {
    public double phi, r;
    
    public double hitungLuas() {
        double hasil = phi * Math.pow(r, 2);
        return hasil;
    }
    
    public double hitungKeliling() {
        double hasil = 2 * phi * r;
        return hasil;
    }
}
