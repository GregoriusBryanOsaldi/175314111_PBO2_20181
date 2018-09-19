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

    private int tanggalAntrian, bulanAntrian, tahunAntrian;
    private Klinik klinik;//mendeklarasikan variabel klinik dengan tipe objek Klinik
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();//mendeklarasikan variabel array pasienList dengan tipe objek ArrayList
    private static ArrayList<AntrianPasien> antrianPasien = new ArrayList<AntrianPasien>();

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

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
        return daftarPasienAntri;
    }

    /**
     * method akan mengatur nilai pasienList sama dengan nilai parameter pasien
     *
     * @param pasien
     */
    public void setPasien(ArrayList<Pasien> pasien) {
        this.daftarPasienAntri = pasien;
    }

    /**
     * method untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     */
    public void Mendaftar(Pasien pasien) {
        daftarPasienAntri.add(pasien);
    }

    public static AntrianPasien cariPasien(String noRM) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).daftarPasienAntri.equals(noRM)) {
                return antrianPasien.get(i);
            }
        }
        return null;
    }

    public static Pasien cariPasien(String noRM, int tanggal, int bulan, int tahun) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            for (int j = 0; j < antrianPasien.get(i).daftarPasienAntri.size(); j++) {
                if (antrianPasien.get(i).daftarPasienAntri.get(j).getNIK().equals(noRM)) {
                    if (antrianPasien.get(i).daftarPasienAntri.get(j).getTanggalLahir() == tanggal) {
                        if (antrianPasien.get(i).daftarPasienAntri.get(j).getBulanLahir() == bulan) {
                            if (antrianPasien.get(i).daftarPasienAntri.get(j).getTahunLahir() == tahun) {
                                return antrianPasien.get(i).daftarPasienAntri.get(j);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * method ini memudahkan kita untuk menampilkan hasil program
     */
    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < daftarPasienAntri.size(); i++) {
            daftarPasienAntri.get(i).printInfo(); //mengeprint data pasien setiap index
        }
    }
}
