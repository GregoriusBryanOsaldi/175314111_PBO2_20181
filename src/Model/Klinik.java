/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Klinik implements Serializable{

    private String idKlinik;
    private String nama;
    private static ArrayList<Klinik> klinik = new ArrayList<Klinik>();

    /**
     * konstruktor untuk mendeklarasikan kelas Klinik
     */
    public Klinik() {

    }

    public Klinik(String idKlinik, String nama) {
        this.idKlinik = idKlinik;
        this.nama = nama;
    }

    public static void mendaftarKlinik(Klinik klinikOther) {
        klinik.add(klinikOther);
    }

    /**
     * mengembalikan nilai variabel idKlinik
     *
     * @return
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**
     * dalam method ini kita mengatur value idKlinik dengan parameter idKlinik
     *
     * @param idKlinik
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * mengembalikan nilai variabel nama
     *
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * dalam method ini kita mengatur value nama dengan parameter nama
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;

    }

    /**
     * method ini memudahkan kita untuk menampilkan hasil output
     */
    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("KLINIK " + getNama().toUpperCase() + "\n");
        System.out.printf("%-25s", "Nomor ID Klinik");
        System.out.print(": ");
        System.out.println(getIdKlinik());

    }
}
