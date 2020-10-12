/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5_2;

/**
 *
 * @author Daffa
 */
public class Mahasiswa {
    public String name;
    public double total;
    public double[] nilai;

    public Mahasiswa(String name, double nilai1, double nilai2, double nilai3) {
        this.nilai = new double[3];
        this.name = name;
        this.nilai[0] = nilai1;
        this.nilai[1] = nilai2;
        this.nilai[2] = nilai3;
        this.total = nilai1 + nilai2 + nilai3;
    }
    
    
}
