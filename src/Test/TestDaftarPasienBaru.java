/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import View.DaftarPasienBaru;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class TestDaftarPasienBaru {

    public static void main(String[] args) {
        DaftarPasienBaru test = new DaftarPasienBaru();
        test.setTitle("Daftar Pasien Baru");
        test.setSize(550, 350);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
