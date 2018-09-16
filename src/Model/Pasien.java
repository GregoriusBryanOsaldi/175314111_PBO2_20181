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
 * @author DELL
 */
public class Pasien {

    private String nama, alamat, tempatLahir;
    private String nomorRekamMedis, NIK;
    private int tanggalLahir, bulanLahir, tahunLahir;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public Pasien() {
    }

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String NIK) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.NIK = NIK;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }

    public String getNama() {
        return nama;
    }

    /*
    dalam method ini kita akan mengembalikan value nama
     */
    public void setNama(String nama) {
        this.nama = nama;
        /*
        dalam method ini kita akan mengatur value nama dengan parameter alamat
         */
    }

    public String getAlamat() {
        return alamat;
        /*
        dalam method ini kita akan mengembalikan value alamat
         */
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        /*
        dalam method ini kita akan mengatur value alamat dengan parameter alamat
         */
    }

    public String getTempatLahir() {
        return tempatLahir;
        /*
        dalam method ini kita akan mengembalikan value tempatLahir
         */
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
        /*
        dalam method ini kita akan mengatur value tempatLahir dengan parameter tempatLahir
         */
    }

    public int getTanggalLahir() {
        return tanggalLahir;
        /*
        method ini mengembalikan value tanggalLahir
         */
    }

    public void setNIK(String NIK) throws Exception {
        if (NIK.length() == 16) {
            this.NIK = NIK;
        } else {
            throw new Exception("Nomor Induk Kependudukan terdiri dari 16 karakter");
        }
    }

    public String getNIK() {
        return NIK;
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public void setNomorRekamMedis(String nomorRekamMedis) throws Exception {
        if (nomorRekamMedis.length() == 16) {
            this.nomorRekamMedis = NIK;
        } else {
            throw new Exception("Nomor Rekam Medis terdiri dari 16 karakter ");
        }
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
            }
        } else {
            throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
        }
        /*
        Dalam method ini kita mengatur(set)tanggal lahir dokter.
        jika tanggal lahir yang diinputkan lebih besar dari 0 maka akan masuk kedalam if. kemudian dicek
        kembali apakah tanggal lahir kurang dari sama dengan 31. jika true maka akan masuk kedalam if dan jika tidak
        masuk kedalam else dan melemparkan exeption

        jika tanggal lahir kurang dari sama dengan 0 maka akan masuk kedalah else dan melemparkan exception.
        
         */
    }

    public int getBulanLahir() {
        return bulanLahir;
        /*
        dalam method ini kita akan mengembalikan value bulanLahir
         */
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Bulan lahir yang anda masukkan tidak valid");
            }
        } else {
            throw new Exception("Bulan lahir yang anda masukkan tidak valid");
        }
        /*
        Dalam method ini kita mengatur(set)bulan lahir dokter.
        jika tanggal lahir yang diinputkan lebih besar dari 0 maka akan masuk kedalam if. kemudian dicek
        kembali apakah bulan lahir kurang dari sama dengan 12. jika true maka akan masuk kedalam if dan jika tidak
        masuk kedalam else dan melemparkan exeption

        jika bulan lahir kurang dari sama dengan 0 maka akan masuk kedalah else dan melemparkan exception.
        
         */
    }

    public int getTahunLahir() {
        return tahunLahir;
        /*
        dalam method ini kita akan mengembalikan value tahunLahir
         */
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun lahir yang anda masukkan tidak valid");
        }
        /*
        Dalam method ini kita mengatur(set)tahun lahir dokter.
        jika tahun lahir yang diinputkan lebih besar dari 0 maka akan masuk kedalam if. 
        jika tanggal lahir kurang dari sama dengan 0 maka akan masuk kedalah else dan melemparkan exception.
        
         */
    }

    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
        /*
        method ini digunakan untuk mebuat format tanggal kelahiran dengan objek Date
         */
    }

    public static ArrayList<Pasien> daftarPasienKlinik() {
        return daftarPasien;
    }

    public static void tambahPasienBaru(Pasien pasienBaru) {
        daftarPasien.add(pasienBaru);
    }

    public static Pasien cariPasien(String NoRM) {
        Pasien result = null;
        boolean found = false;
        for (int i = 0; i < daftarPasien.size() && found == false; i++) {
            if (daftarPasien.get(i).NIK.equals(NoRM)) {
                found = true;
                result = daftarPasien.get(i);
            }
        }
        return result;
    }

    public void printInfo() {
        System.out.printf("%-25s", "Nomor Rekam Medis Pasien");
        System.out.println(": " + getNomorRekamMedis());
        System.out.printf("%-25s", "Nama Pasien");
        System.out.println(": " + nama);
        System.out.printf("%-25s", "Tempat, Tanggal Lahir");
        System.out.print(": " + tempatLahir + " , ");
        getTanggalKelahiran();
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + alamat);
        System.out.println("");
        /*
        method ini membuat kita lebih mudah saat akan menampilkannya di main
         */
    }
}
