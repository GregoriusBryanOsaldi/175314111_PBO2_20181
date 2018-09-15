/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
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
        menuBar=new JMenuBar();
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
            pasienBaru.setSize(500, 510);
            pasienBaru.setVisible(true);
        }
        if (e.getSource() == tambahAntrian) {
            DaftarAntrianDialog antrianDialog = new DaftarAntrianDialog();
            antrianDialog.setSize(300, 400);
            antrianDialog.setVisible(true);
        }
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
    }
    
}
