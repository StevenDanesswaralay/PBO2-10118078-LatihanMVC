/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stevendanesswaralay.latihanmvc.controller;
import edu.stevendanesswaralay.latihanmvc.model.PelangganModel;
import edu.stevendanesswaralay.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Nim      : 10118078
 * Kelas    : IF-2
 * Deskripsi Tugas : Latihan MVC
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    } 
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && notelp.equals("")){
            
        }else{
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (notelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
        }else{
            model.simpanForm();
        }
    }
}
