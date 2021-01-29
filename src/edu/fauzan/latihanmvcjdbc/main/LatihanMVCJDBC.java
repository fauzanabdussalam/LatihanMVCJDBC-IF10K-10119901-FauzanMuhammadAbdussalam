/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fauzan.latihanmvcjdbc.main;

import edu.fauzan.latihanmvcjdbc.database.BarbershopDatabase;
import edu.fauzan.latihanmvcjdbc.entity.Pelanggan;
import edu.fauzan.latihanmvcjdbc.error.PelangganException;
import edu.fauzan.latihanmvcjdbc.service.PelangganDao;
import edu.fauzan.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author
 * NIM      : 10119901
 * Nama     : Fauzan Muhammad Abdussalam
 * Kelas    : IF-10K
 * Latihan MVC JDBC
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try 
                {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } 
                catch (SQLException ex) 
                {
                } 
                catch (PelangganException ex) 
                {
                }
            }
        });
    }
}
