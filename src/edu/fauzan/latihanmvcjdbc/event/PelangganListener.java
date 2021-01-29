/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fauzan.latihanmvcjdbc.event;

import edu.fauzan.latihanmvcjdbc.entity.Pelanggan;
import edu.fauzan.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM      : 10119901
 * Nama     : Fauzan Muhammad Abdussalam
 * Kelas    : IF-10K
 * Latihan MVC JDBC
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);    
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
}
