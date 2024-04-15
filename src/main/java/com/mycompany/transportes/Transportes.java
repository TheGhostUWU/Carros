/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author 97114
 */
public class Transportes {

    public static void main(String[] args) {
       //Crear un vehiculo terrestre
       
       VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Mattel", "Terreneitor", 4);
       VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha", "Yamaha", "Motor prr prr");
       VehiculoAereo vehiculoAereo=new VehiculoAereo("Fenix", "TurboSach", 2);
       VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("Eleska", "U.R.S", 4);
       
       //Mostrar informacion de los vehiculos
       System.out.println("Informacion del vehiculo Terrestre:");
       vehiculoTerrestre.mostrarinfo();
       
       System.out.println("Informacion del vehiculo Acuatico:");
       vehiculoAcuatico.mostrarinfo();
       
       System.out.println("Informacion del vehiculo Esspacial:");
       vehiculoAereo.mostrarinfo();
       
       System.out.println("Informacion del vehiculo Aereo:");
       vehiculoEspacial.mostrarinfo();
    }
}
