package com.mycompany.elecciones.g10;

import Clases.ClsJdbc;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class EleccionesG10 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ClsJdbc jdbc = new ClsJdbc();
        jdbc.CrearConexion();
    }
}
