/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntrianKlinik;

/**
 *
 * @author admin
 */
public class AntrianPasien {

    private int tanggalAntrian, bulanAntrian, tahunAntrian;
    private Klinik klinik;
    private Pasien[] pasien= new Pasien[3];

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
    
    public Pasien[] getPasien() {
        return pasien;
    }

    public void setPasien(Pasien[] pasien) {
        this.pasien = pasien;
    }
}
