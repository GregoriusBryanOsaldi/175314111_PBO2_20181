/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.RumahSakit;

import java.io.File;
import java.util.ArrayList;
import Model.Pasien;
import Model.RumahSakit;

/**
 *
 * @author admin
 */
public class TestRumahSakit2 {
    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit();
 
        rs.bacaObjekRumahSakit(new File("rsku.dat"));
        System.out.println("Nama RS = "+rs.getNama());
        System.out.println("Alamat = "+rs.getAlamat());
        ArrayList<Pasien> daftar = rs.getDaftarPasien();
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("Pasien = "+daftar.get(i).toString());
        }
                     
    }
}
