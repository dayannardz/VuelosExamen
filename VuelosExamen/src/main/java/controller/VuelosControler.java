/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Vuelos;
import view.VueloView;

/**
 *
 * @author Pamel
 */
public class VuelosControler {
    
    private static List<Vuelos> vuelos = new ArrayList<>();
    
    private static Vuelos model;
    private static VueloView view;
   
    private static List<Vuelos> listadv = new ArrayList<>();
    
    public VuelosControler(Vuelos model, VueloView view){
        this.model = model;
        this.view = view;
        
    }
    public void CRUDVuelo(Vuelos model){
        view.CRUDVuelo(model);
    }
    public static void createVuelo() {
        view.createVuelo(model);
    }
    public static void readVuelo(){
        view.readVuelo(model);
    }
    public static void updateVuelo(){
        view.updateVuelo(model);
    }
    public static boolean deleteVuelo(String codigo){
        boolean respuesta = vuelos.removeIf(v -> v.getcodigo().equalsIgnoreCase(codigo));
        return respuesta;
    }
    
    public static Vuelos buscarVuelo(String codigo) {
        return vuelos.stream().filter(v -> v.getcodigo().equalsIgnoreCase(codigo)).findFirst().orElse(null);
        
    }

    
    
    public static List<Vuelos> vuelosOrdenados() {
        
        listadv.sort((v1, v2) -> v2.getfecha_completa().compareTo(v1.getfecha_completa()));
        return listadv;
    }

    public static Vuelos vueloPasajeros() {
        listadv.sort((v2, v1) -> (v2.getnumeropasajeros().compareTo(v1.getnumeropasajeros())));

            
        Vuelos ultimo = listadv.get(0);
        return ultimo;
    }
    
    public static Vuelos llegada(){
        return vuelosOrdenados().get(0);
    }
    

     public static void guardarVuelo(String codigo, String origen, String destino, Integer numeroPasajeros, Date fecha_completa ){
    model.setCodigo(codigo);
    model.setOrigen(origen);
    model.setDestino(destino);

    model.setNumeroPasajeros(numeroPasajeros);
    model.setFecha_completa(fecha_completa);
    view.updateTable(model);

    
     }
    
    public static void addList() {
    try {
        Vuelos v = new Vuelos(model.getCodigo(), model.getOrigen(), model.getDestino(), model.getFecha_llegada(), model.getNumeroPasajeros());
        listadv.add(v);
        vuelos.add(v); 
    } catch (ParseException ex) {
        Logger.getLogger(VuelosControler.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    
}
