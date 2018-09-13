/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarPasienBaru extends JFrame {

    private JLabel judullabel;
    private JLabel tanggalLahir;
    private JLabel bulanLahir;
    private JLabel tahunLahir;
    private JLabel namaLabel;
    private JLabel alamat;
    private JTextField namaText;
    private JTextField alamatText;
    private JButton saveButton;
    private JComboBox tanggalButton;
    private JComboBox bulanButton;
    private JComboBox tahunButton;

    public DaftarPasienBaru() {
        init();
    }

    public DaftarPasienBaru(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        //judul 
        this.setLayout(null);
        judullabel = new JLabel("DAFTAR PASIEN BARU");
        judullabel.setBounds(200, 15, 150, 10);
        this.add(judullabel);

        //nama
        this.setLayout(null);
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 50, 50, 15);
        this.add(namaLabel);

        namaText = new JTextField(100);
        namaText.setBounds(150, 50, 110, 20);
        this.add(namaText);

        //Alamat
        this.setLayout(null);
        alamat = new JLabel("Alamat");
        alamat.setBounds(20, 80, 100, 15);
        this.add(alamat);

        alamatText = new JTextField(100);
        alamatText.setBounds(150, 80, 110, 20);
        this.add(alamatText);

        //Tanggal Lahir
        this.setLayout(null);
        tanggalLahir = new JLabel("Tanggal Lahir");
        tanggalLahir.setBounds(20, 110, 150, 15);
        this.add(tanggalLahir);

        //Tombol Tanggal Lahir
        String[] tanggal = {"Pilih", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
            "25", "26", "27", "28", "29", "30", "31"};
        tanggalButton = new JComboBox(tanggal);
        tanggalButton.setBounds(150, 110, 60, 20);
        this.add(tanggalButton);

        //Bulan Lahir
        this.setLayout(null);
        bulanLahir = new JLabel("Bulan");
        bulanLahir.setBounds(215, 110, 100, 15);
        this.add(bulanLahir);

        //Tombol Bulan Lahir
        String[] bulan = {"Pilih", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
            "Agustus", "September", "Oktober", "November", "Desember"};
        bulanButton = new JComboBox(bulan);
        bulanButton.setBounds(250, 110, 100, 20);
        this.add(bulanButton);

        //Tahun Lahir
        this.setLayout(null);

        //Tombol Simpan
        saveButton = new JButton("Simpan");
        saveButton.setBounds(80, 200, 80, 25);
        this.add(saveButton);
    }
}
