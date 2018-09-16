/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import View.CariPasien;
import javax.swing.JFrame;

/**
 *
 * @author greg
 */
public class TestCari {
    public static void main(String[] args) {
        CariPasien cari=new CariPasien();
        cari.setTitle("Cari Pasien");
        cari.setLocationRelativeTo(null);
        cari.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cari.setSize(480, 150);
        cari.setVisible(true);
    }
}
