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
public class Tipo_medicamento {
    private int ID_medicamento;
    private String tipo_medicamento;
    private ArrayList<Medicamento> Lista_medicamentos = new ArrayList();

    public Tipo_medicamento(int ID_medicamento, String tipo_medicamento) {
        this.ID_medicamento = ID_medicamento;
        this.tipo_medicamento = tipo_medicamento;
    }

    public Tipo_medicamento(Tipo_medicamento tipo) {
        this.ID_medicamento = tipo.ID_medicamento;
        this.tipo_medicamento = tipo.tipo_medicamento;
    }

    public int getID_medicamento() {
        return ID_medicamento;
    }

    public void setID_medicamento(int ID_medicamento) {
        this.ID_medicamento = ID_medicamento;
    }

    public String getTipo_medicamento() {
        return tipo_medicamento;
    }

    public void setTipo_medicamento(String tipo_medicamento) {
        this.tipo_medicamento = tipo_medicamento;
    }

    public ArrayList<Medicamento> getLista_medicamentos() {
        return Lista_medicamentos;
    }

    public void setLista_medicamentos(ArrayList<Medicamento> Lista_medicamentos) {
        this.Lista_medicamentos = Lista_medicamentos;
    }
    
}
