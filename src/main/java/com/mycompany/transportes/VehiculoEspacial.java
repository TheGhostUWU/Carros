/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author 97114
 */
public class VehiculoEspacial extends Vehiculo {
        private int numTurbinas;
    
    public VehiculoEspacial(String marca, String modelo, int numTurbinas){
        super(marca, modelo);
        this.numTurbinas=numTurbinas;
    }
    
    
    public void mostrainfo(){
        super.mostrarinfo();
        System.out.println("Numero de Turbinas: "+numTurbinas);
}
}
