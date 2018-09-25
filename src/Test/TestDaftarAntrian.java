/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import View.DaftarAntrianDialog;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class TestDaftarAntrian {

    public static void main(String[] args) {
        DaftarAntrianDialog test = new DaftarAntrianDialog();
        test.setTitle("Daftar Antrian Pasien");
        test.setSize(550, 300);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
