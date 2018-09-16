/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 175314111/Gregorius Bryan Osaldi
 */
public class AntrianPasien {

    private Klinik klinik;//mendeklarasikan variabel klinik dengan tipe objek Klinik
    private ArrayList<Pasien> pasienList = new ArrayList<Pasien>();//mendeklarasikan variabel array pasienList dengan tipe objek ArrayList

    /**
     * konstruktor untuk mendeklarasikan objek AntrianPasien
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
     * method akan mengatur nilai klinik sama dengan nilai parameter klinik
     * dengan tipe data-nya objek Klinik
     *
     * @param klinik
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    /**
     * mathod akan mengembalikan nilai pasienList jika dipanggil
     *
     * @return
     */
    public ArrayList<Pasien> getPasien() {
        return pasienList;
    }

    /**
     * method akan mengatur nilai pasienList sama dengan nilai parameter pasien
     *
     * @param pasien
     */
    public void setPasien(ArrayList<Pasien> pasien) {
        this.pasienList = pasien;
    }

    /**
     * method untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     */
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
        for (int i = 0; i < pasienList.size(); i++) {
            pasienList.get(i).printInfo(); //mengeprint data pasien setiap index
        }
    }
}
