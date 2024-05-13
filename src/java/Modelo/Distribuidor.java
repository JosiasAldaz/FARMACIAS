/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Distribuidor {
    private int ID_distribuidor;
    private String nombre;

    public int getID_distribuidor() {
        return ID_distribuidor;
    }

    public void setID_distribuidor(int ID_distribuidor) {
        this.ID_distribuidor = ID_distribuidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Distribuidor(int ID_distribuidor, String nombre) {
        this.ID_distribuidor = ID_distribuidor;
        this.nombre = nombre;
    }
    
    
}
