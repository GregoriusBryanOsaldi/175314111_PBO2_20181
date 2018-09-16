/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author greg
 */
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasien;
    private JMenuItem tambahAntrian;
    private JLabel mainFrameLabel;
    private JLabel mainFrame2Label;

    public MainFrame() {
        init();
    }

    public MainFrame(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        //file menu
        fileMenu = new JMenu("File");

        //main frame label
        this.setLayout(null);
        mainFrameLabel = new JLabel("Selamat Datang Selamat Berobat");
        mainFrameLabel.setBounds(80, 80, 500, 50);
        mainFrameLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        this.add(mainFrameLabel);

        this.setLayout(null);
        mainFrame2Label = new JLabel("Silahkan Daftarkan Data Diri Anda");
        mainFrame2Label.setBounds(80, 110, 500, 50);
        mainFrame2Label.setFont(new Font("Arial", Font.PLAIN, 25));
        this.add(mainFrame2Label);

        //item tambah Pasien
        tambahPasien = new JMenuItem("Tambah Pasien");
        fileMenu.add(tambahPasien);

        //item tambah Antrian
        tambahAntrian = new JMenuItem("Tambah Antrian");
        fileMenu.add(tambahAntrian);

        //item exit 
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        //menu bar
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);

        this.setJMenuBar(menuBar);

        tambahPasien.addActionListener(this);
        tambahAntrian.addActionListener(this);
        exitMenuItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahPasien) {
            DaftarPasienBaru pasienBaru = new DaftarPasienBaru();
            pasienBaru.setTitle("Daftar Pasien Baru");
            pasienBaru.setSize(550, 350);
            pasienBaru.setVisible(true);
        }
        if (e.getSource() == tambahAntrian) {
            DaftarAntrianDialog antrianDialog = new DaftarAntrianDialog();
            antrianDialog.setTitle("Daftar Antrian Pasien");
            antrianDialog.setSize(550, 350);
            antrianDialog.setVisible(true);
        }
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
    }

}
