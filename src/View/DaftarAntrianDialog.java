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
public class DaftarAntrianDialog extends JDialog {

    private JLabel judullabel;
    private JLabel noRM;
    private JLabel namaLabel;
    private JLabel alamat;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JButton saveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        //judul 
        this.setLayout(null);
        judullabel = new JLabel("DAFTAR PASIEN");
        judullabel.setBounds(80, 20, 150, 10);
        this.add(judullabel);

        //no RM
        this.setLayout(null);
        noRM = new JLabel("No Rekam Medis");
        noRM.setBounds(20, 70, 100, 10);
        this.add(noRM);

        noRMText = new JTextField();
        noRMText.setBounds(150, 70, 110, 15);
        this.add(noRMText);

        //nama
        this.setLayout(null);
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 120, 50, 10);
        this.add(namaLabel);

        namaText = new JTextField(100);
        namaText.setBounds(150, 120, 110, 15);
        this.add(namaText);

        //Alamat
        this.setLayout(null);
        alamat = new JLabel("Alamat");
        alamat.setBounds(20, 170, 100, 15);
        this.add(alamat);

        alamatText = new JTextField(100);
        alamatText.setBounds(150, 170, 110, 15);
        this.add(alamatText);

        //Tombol
        saveButton = new JButton("Simpan");
        saveButton.setBounds(80, 230, 80, 25);
        this.add(saveButton);
    }

}
