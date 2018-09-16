/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarPasienBaru extends JFrame implements ActionListener {

    private JLabel judullabel;
    private JLabel NIK;
    private JLabel tanggalLahir;
    private JLabel bulanLahir;
    private JLabel tahunLahir;
    private JLabel namaLabel;
    private JLabel alamat;
    private JLabel jenisKelamin;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField NIKText;
    private JRadioButton lakiLaki;
    private JRadioButton perempuan;
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
        judullabel = new JLabel("PASIEN BARU");
        judullabel.setBounds(250, 15, 150, 10);
        this.add(judullabel);

        //NIK
        this.setLayout(null);
        NIK = new JLabel("NIK");
        NIK.setBounds(20, 50, 50, 15);
        this.add(NIK);

        NIKText = new JTextField(100);
        NIKText.setBounds(150, 50, 350, 20);
        this.add(NIKText);

        //nama
        this.setLayout(null);
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 80, 50, 15);
        this.add(namaLabel);

        namaText = new JTextField(100);
        namaText.setBounds(150, 80, 350, 20);
        this.add(namaText);

        //Alamat
        this.setLayout(null);
        alamat = new JLabel("Alamat");
        alamat.setBounds(20, 110, 50, 15);
        this.add(alamat);

        alamatText = new JTextField(100);
        alamatText.setBounds(150, 110, 350, 20);
        this.add(alamatText);

        //Jenis Kelamin
        this.setLayout(null);
        jenisKelamin = new JLabel("Jenis Kelamin");
        jenisKelamin.setBounds(20, 140, 100, 15);
        this.add(jenisKelamin);

        lakiLaki = new JRadioButton("Laki-Laki", true);
        lakiLaki.setBounds(150, 140, 100, 20);
        this.add(lakiLaki);

        perempuan = new JRadioButton("Perempuan", false);
        perempuan.setBounds(150, 170, 100, 20);
        this.add(perempuan);

        //Tanggal Lahir
        this.setLayout(null);
        tanggalLahir = new JLabel("Tanggal Lahir");
        tanggalLahir.setBounds(20, 200, 150, 15);
        this.add(tanggalLahir);

        //Tombol Tanggal Lahir
        String[] tanggal = {"Pilih", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
            "25", "26", "27", "28", "29", "30", "31"};
        tanggalButton = new JComboBox(tanggal);
        tanggalButton.setBounds(150, 200, 60, 20);
        this.add(tanggalButton);

        //Bulan Lahir
        this.setLayout(null);
        bulanLahir = new JLabel("Bulan");
        bulanLahir.setBounds(215, 200, 100, 15);
        this.add(bulanLahir);

        //Tombol Bulan Lahir
        String[] bulan = {"Pilih", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
            "Agustus", "September", "Oktober", "November", "Desember"};
        bulanButton = new JComboBox(bulan);
        bulanButton.setBounds(255, 200, 100, 20);
        this.add(bulanButton);

        //Tahun Lahir
        this.setLayout(null);
        tahunLahir = new JLabel("Tahun");
        tahunLahir.setBounds(360, 200, 100, 15);
        this.add(tahunLahir);

        //Tombol Tahun Lahir
        String[] tahun = {"Pilih", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908",
            "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918",
            "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928",
            "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938",
            "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948",
            "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958",
            "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968",
            "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978",
            "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988",
            "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
        tahunButton = new JComboBox(tahun);
        tahunButton.setBounds(400, 200, 100, 20);
        this.add(tahunButton);

        //Tombol Simpan
        saveButton = new JButton("Simpan");
        saveButton.setBounds(240, 250, 80, 30);
        this.add(saveButton);
        saveButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            try {
                Pasien daftar = new Pasien();
                daftar.setNama(namaText.getText());
                daftar.setAlamat(alamatText.getText());
                daftar.setNomorRekamMedis(NIKText.getText());
                Pasien.tambahPasienBaru(daftar);
                JOptionPane.showMessageDialog(null, namaText.getText() + "\n\tAnda Terdaftar");
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }

    }

}
