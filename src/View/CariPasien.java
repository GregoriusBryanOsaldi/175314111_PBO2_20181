/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author greg
 */
public class CariPasien extends JFrame implements ActionListener {

    private JLabel cariPasien;
    private JLabel noRM;
    private JTextField noRMText;
    private JButton cariButton;

    public CariPasien() {
        init();
    }

    public void init() {
        //cari pasien
        this.setLayout(null);
        cariPasien = new JLabel("CARI PASIEN");
        cariPasien.setBounds(210, 15, 100, 20);
        this.add(cariPasien);

        //no rekam medis
        this.setLayout(null);
        noRM = new JLabel("No Rekam Medis");
        noRM.setBounds(20, 50, 100, 15);
        this.add(noRM);
        
        noRMText=new JTextField(200);
        noRMText.setBounds(150, 50, 200, 20);
        this.add(noRMText);
        
        //tombol cari
        this.setLayout(null);
        cariButton=new JButton("Cari");
        cariButton.setBounds(380, 50, 60, 20);
        this.add(cariButton);
        
        cariButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cariButton) {
            
        }
    }

}
