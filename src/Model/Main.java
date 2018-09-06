/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        //Deklarasi 
        Klinik klinik = new Klinik();
        Dokter dokter = new Dokter();
        Pasien pasien1 = new Pasien();
        AntrianPasien antrian = new AntrianPasien();

        //Klinik 
        klinik.setIdKlinik("1234521KL");
        klinik.setNama("Sanata Dharma");

        //Dokter
        try {
            dokter.setNama("Kiwiliam");
            dokter.setNomorPegawai("12343");
            dokter.setTempatLahir("Tajem");
            dokter.setTanggalLahir(12);
            dokter.setBulanLahir(5);
            dokter.setTahunLahir(1999);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        dokter.setAlamat("Maguwoharjo");

        //Pasien 1
        try {
            pasien1.setNama("Gregorius Bryan Osaldi");
            pasien1.setAlamat("Jalan Paingan 6, Maguwoharjo, Kab.Sleman, Daerah Istimewa Yogyakarta");
            pasien1.setTempatLahir("Sukaraya");
            pasien1.setTanggalLahir(3);
            pasien1.setBulanLahir(05);
            pasien1.setTahunLahir(2000);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        //Mendaftar
        antrian.setKlinik(klinik);
        antrian.Mendaftar(pasien1);
        
        //Print Output
        antrian.getKlinik().printInfo();
        dokter.printInfo();
        for (int i = 0; i <antrian.getPasien().size(); i++) {
            antrian.printInfo();
        }
    }
}
