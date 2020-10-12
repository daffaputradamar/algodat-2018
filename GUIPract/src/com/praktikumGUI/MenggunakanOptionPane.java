package com.praktikumGUI;

import javax.swing.*;

public class MenggunakanOptionPane {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Siapa namamu?");
        
        int pilihan = JOptionPane.showConfirmDialog(null, "Coding itu mudah kan, " + nama + "?");
        
        if (pilihan == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Tentu saja! Bahkan anak umur 4 tahun sudah bisa coding java");
        } else {
            JOptionPane.showMessageDialog(null, "Susah sih ! Soalnya saya Malas");
        }
    }
}
