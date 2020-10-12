/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajemenrumahsakit;

import backend.*;
/**
 *
 * @author root
 */
public class TestBackend {
    public static void main(String[] args) {
        Pasien pas = new Pasien().getById(5);
        System.out.println(pas.getNamaPasien());
        System.out.println(pas.getDokter().getNamaDokter());
        System.out.println(pas.getDokter().getSpesialisasi().getNama());
    }
}
