/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 175314111/Gregorius Bryan Osaldi
 */
public class AntrianPasien {

    private Klinik klinik;//mendeklarasikan variabel klinik dengan tipe objek Klinik
    private Pasien[] pasien;//mendeklarasikan variabel array pasien dengan tipe objek Pasien 
    private int idx, idx2;//mendeklarasikan variabel idx dan idx2 dengan tipe integer

    /**
     * dalam konstruktor ini saya membuat default jika konstruktor-nya dipanggil
     * kelas lain
     */
    public AntrianPasien() {
        this.klinik = new Klinik();
        this.pasien = new Pasien[2];
        this.idx = 0;
        this.idx2 = 0;
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

    /**
     * method ini akan menginputkan data setiap pasien dengan parameter pasien
     * yang bertipe data objek Pasien
     *
     * @param pasien
     * @throws Exception
     */
    public void addPasien(Pasien pasien) throws Exception { //method ini akan melemparkan exeption jika ada kesalahan input
        if (idx < this.pasien.length) { // apakah nilai idx lebih kecil dari banyaknya array pasien?
            this.pasien[idx] = pasien; // jika jawabannya iya maka variabel array pasien dengan index array-nya adalah idx akan diisi dengan parameter pasien
            this.idx++; //nilai idx akan ditambah 1 
        } else {
            throw new Exception("Error Pasien"); //jika if bernilai false maka akan melemparkan exeption dengan pesan "Error Pasien"
        }
    }

    /**
     * method ini menginputkan data klinik dengan parameter klinik yang bertipe
     * data objek Klinik
     *
     * @param klinik
     */
    public void addKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    /**
     * method ini memudahkan kita untuk menampilkan hasil program
     */
    public void printInfo() {
        klinik.printInfo();
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < idx; i++) {
            pasien[i].printInfo();
        }
    }
}
