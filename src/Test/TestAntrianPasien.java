/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianPasien;
import Model.Pasien;

/**
 *
 * @author greg
 */
public class TestAntrianPasien {

    public static void main(String[] args) {
        Pasien test = new Pasien(
                "Puspa", // nama pasien
                12, // tanggal lahir
                01, // bulan lahir
                1974, // tahun lahir
                "19740112" // NIK
        );

        Pasien test1 = new Pasien(
                "Budi", // nama pasien
                10, // tanggal lahir
                01, // bulan lahir
                1999, // tahun lahir
                "19990110" // NIK
        );
        AntrianPasien antrian = new AntrianPasien();
        antrian.Mendaftar(test);
        antrian.Mendaftar(test1);

        for (int i = 0; i < antrian.getPasien().size(); i++) {
            System.out.println("Nama : " + antrian.getPasien().get(i).getNama());
        }

        Pasien cari = AntrianPasien.cariPasien("19990110", 10, 01, 1999);
        for (int i = 0; i < antrian.getPasien().size(); i++) {
            System.out.println("Nama Hasil Pencarian = " + cari.getNama());
        }
    }

}
