/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Pedido {
    private int id_pedido;
    private int cantidad;
    private double total;
    private ArrayList<Detale_pedido> Lista_detalles = new ArrayList();

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Detale_pedido> getLista_detalles() {
        return Lista_detalles;
    }

    public void setLista_detalles(ArrayList<Detale_pedido> Lista_detalles) {
        this.Lista_detalles = Lista_detalles;
    }

    public Pedido(int cantidad, double total) {
        this.cantidad = cantidad;
        this.total = total;
    }

    public Pedido(int id_pedido, int cantidad, double total) {
        this.id_pedido = id_pedido;
        this.cantidad = cantidad;
        this.total = total;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Pedido(Pedido p) {
        this.id_pedido = p.id_pedido;
        this.cantidad = p.cantidad;
        this.total = p.total;
    }
    
    
}
