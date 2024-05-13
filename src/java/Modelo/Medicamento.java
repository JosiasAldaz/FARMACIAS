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
public class Medicamento {
    private int id_medicamento;
    private String nombre_medicmaneto;
    private String descripcion;
    private Tipo_medicamento tipo_medi;
    private double precio;
    private ArrayList<Detale_pedido> Lista_detalles = new ArrayList();

    public Medicamento(int id_medicamento, String nombre_medicmaneto, String descripcion, Tipo_medicamento tipo_medi, double precio) {
        this.id_medicamento = id_medicamento;
        this.nombre_medicmaneto = nombre_medicmaneto;
        this.descripcion = descripcion;
        this.tipo_medi = tipo_medi;
        this.precio = precio;
    }

    public Medicamento(Medicamento m) {
        this.id_medicamento = m.id_medicamento;
        this.nombre_medicmaneto = m.nombre_medicmaneto;
        this.descripcion = m.descripcion;
        this.tipo_medi = m.tipo_medi;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getNombre_medicmaneto() {
        return nombre_medicmaneto;
    }

    public void setNombre_medicmaneto(String nombre_medicmaneto) {
        this.nombre_medicmaneto = nombre_medicmaneto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo_medicamento getTipo_medi() {
        return tipo_medi;
    }

    public void setTipo_medi(Tipo_medicamento tipo_medi) {
        this.tipo_medi = tipo_medi;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Detale_pedido> getLista_detalles() {
        return Lista_detalles;
    }

    public void setLista_detalles(ArrayList<Detale_pedido> Lista_detalles) {
        this.Lista_detalles = Lista_detalles;
    }
    
    
    
}
