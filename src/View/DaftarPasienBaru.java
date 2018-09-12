/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarPasienBaru extends JDialog {

    private JLabel judullabel;
    private JLabel NIK;
    private JLabel namaLabel;
    private JLabel alamat;
    private JTextField namaText;
    private JTextField NIKText;
    private JTextField alamatText;
    private JButton saveButton;

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
        judullabel.setBounds(80, 20, 150, 10);
        this.add(judullabel);
        
        //nama
        this.setLayout(null);
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 70, 50, 10);
        this.add(namaLabel);

        namaText = new JTextField(100);
        namaText.setBounds(150, 70, 110, 20);
        this.add(namaText);

        //Alamat
        this.setLayout(null);
        alamat = new JLabel("Alamat");
        alamat.setBounds(20, 120, 100, 15);
        this.add(alamat);

        alamatText = new JTextField(100);
        alamatText.setBounds(150, 120, 110, 20);
        this.add(alamatText);
        
        //Tanggal Lahir
        this.setLayout(null);
//        NIK=new JLabel("NIK");
//        NIK.setBounds(150, WIDTH, HEIGHT);

        //Tombol
        saveButton = new JButton("Simpan");
        saveButton.setBounds(80, 200, 80, 25);
        this.add(saveButton);
    }
}
