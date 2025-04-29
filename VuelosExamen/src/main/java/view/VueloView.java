/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.VuelosControler;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JOptionPane;
import modelo.Vuelos;

/**
 *
 * @author Pamel
 */
public class VueloView {
    private static CRUDVuelo VistaCRUD;
    
    public void CRUDVuelo(Vuelos model) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VistaCRUD = new CRUDVuelo(model);
                VistaCRUD.setVisible(true);
            }
        });
    }
    
    public void createVuelo(Vuelos model) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new createFRV(model).setVisible(true);
            }
        });

    }
    
    public void readVuelo(Vuelos model) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new readVuelo(model).setVisible(true);
            }
        });
    }
    
    public void updateVuelo(Vuelos model) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new updateVuelo(model).setVisible(true);
            }
        });
    }
    public void delateVuelo(Vuelos model) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new readVuelo(model).setVisible(true);
            }
        });
    }
    
    public static void guardarVuelo(String codigo, String origen, String destino,Integer numeroPasajeros, Date Fecha_completa) {
        VuelosControler.guardarVuelo(codigo, origen, destino,numeroPasajeros,Fecha_completa);
    }
    public static void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void updateTable(Vuelos model){
        VistaCRUD.updateTabla(model);
    }
    
    public void getTableRow(Vuelos model)throws ParseException{
        VistaCRUD.updateTableRow(model);
    }
    
    
   
}
