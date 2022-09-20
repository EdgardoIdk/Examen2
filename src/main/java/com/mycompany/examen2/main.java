/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen2;

/**
 *
 * @author edgar
 */
public class main {
    static conexionDB connMongo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        connMongo = new conexionDB();
        connMongo.setBD();
        
        
        Maquinaria hola = new Maquinaria();
        hola.setVisible(true);
    }
    
}
