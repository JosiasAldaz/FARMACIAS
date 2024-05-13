/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Detale_pedido {
    private int id_detalle;
    private int cantidad;
    private Distribuidor distri;
    private Medicamento medi;
    private Pedido pedido;

    public Medicamento getMedi() {
        return medi;
    }

    public void setMedi(Medicamento medi) {
        this.medi = medi;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Detale_pedido(Medicamento medi, Pedido pedido) {
        this.medi = medi;
        this.pedido = pedido;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Distribuidor getDistri() {
        return distri;
    }

    public void setDistri(Distribuidor distri) {
        this.distri = distri;
    }

    public Detale_pedido(int id_detalle, int cantidad, Distribuidor distri, Medicamento medi, Pedido pedido) {
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.distri = distri;
        this.medi = medi;
        this.pedido = pedido;
    }

    public Detale_pedido(Detale_pedido deta) {
        this.id_detalle = deta.id_detalle;
        this.cantidad = deta.cantidad;
        this.distri = deta.distri;
        this.medi = deta.medi;
        this.pedido = deta.pedido;
    }
    
    
}
