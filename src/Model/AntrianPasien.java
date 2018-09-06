/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 175314111/Gregorius Bryan Osaldi
 */
public class AntrianPasien {

    private Klinik klinik;//mendeklarasikan variabel klinik dengan tipe objek Klinik
    private ArrayList<Pasien> pasienList = new ArrayList<Pasien>();//mendeklarasikan variabel array pasien dengan tipe objek ArrayList

    /**
     * dalam konstruktor ini saya membuat default jika konstruktor-nya dipanggil
     * kelas lain
     */
    public AntrianPasien() {

    }

    /**
     * method akan mengembalikan nilai klinik jika dipanggil
     *
     * @return
     */
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * method akan mengatur nilai klinik dengan parameter klinik yang tipe
     * data-nya objek Klinik
     *
     * @param klinik
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public ArrayList<Pasien> getPasien() {
        return pasienList;
    }

    public void setPasien(ArrayList<Pasien> pasien) {
        this.pasienList = pasien;
    }

    public void tanggalSekarang() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
        System.out.println(ft.format(date));
    }

    public void Mendaftar(Pasien pasien) {
        pasienList.add(pasien);
    }

    /**
     * method ini memudahkan kita untuk menampilkan hasil program
     */
    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        
    }
}
