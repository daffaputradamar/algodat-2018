/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarunittesting;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

/**
 *
 * @author ASUS
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PengolahPesanTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        boolean berhasil = result.wasSuccessful();
        
        System.out.println("Test Berhasil? " + berhasil);
    }
}
