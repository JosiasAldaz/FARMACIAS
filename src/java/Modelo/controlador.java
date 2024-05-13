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
public class controlador {
    
    ArrayList<Medicamento> Lista_medicamentos = new ArrayList();
    ArrayList <Tipo_medicamento> Lista_tipos = new ArrayList();
    ArrayList <Sucursal_farmacia> Lista_sucursales = new ArrayList();
    ArrayList <Distribuidor> Lista_distribuidores = new ArrayList();
    categoria categoria1 = new categoria();
    
    public boolean Datos(){
        
        //LLENAR DATOS A MIS LISTAS
        Tipo_medicamento tipo1 = new Tipo_medicamento(1, "ANALGÉSICO");
        Tipo_medicamento tipo2 = new Tipo_medicamento(2, "ANALÉPTICO");
        Tipo_medicamento tipo3 = new Tipo_medicamento(3, "ANESTÉSICO");
        Tipo_medicamento tipo4 = new Tipo_medicamento(4, "ANTIÁCIDO");
        Tipo_medicamento tipo5 = new Tipo_medicamento(5, "ANTIDEPRESIVO");
        Tipo_medicamento tipo6 = new Tipo_medicamento(6, "ANTIBIÓTICO");
        //objeto relacional
        
        //DISTRIBUIDORES
        Distribuidor dist1 = new Distribuidor(1,"COFARMA");
        Distribuidor dist2 = new Distribuidor(1,"EMPSEPHAR");
        Distribuidor dist3 = new Distribuidor(1,"CEMEFAR");
        //MEDICAMENTOS
        Medicamento medi1 = new Medicamento(1, "PARACETAMOL", "ANALGÉSICO CON PROPIEDADES DESINFLAMATORIAS", tipo1,25.70);
        Medicamento medi2 = new Medicamento(2, "TRENBUTEROL", "ANALGÉSICO CON PROPIEDADES DESINFLAMATORIAS", tipo5,80.55);
        Medicamento medi3 = new Medicamento(3, "TESTOTERONA", "ANALGÉSICO CON PROPIEDADES DESINFLAMATORIAS", tipo1,150);
        //FARMACIAS
        Sucursal_farmacia farmacia1 = new Sucursal_farmacia(1, "Farmacias Cruz Azul", "Octavio Chacón Moscoso", true);
        Sucursal_farmacia farmacia2 = new Sucursal_farmacia(2, "Farmacias SANA SANA", "AV de la Independencia", true);
        
        
        Lista_tipos.add(tipo1);
        Lista_tipos.add(tipo2);
        Lista_tipos.add(tipo3);
        Lista_tipos.add(tipo4);
        Lista_tipos.add(tipo5);
        Lista_tipos.add(tipo6);
        //lista distribuidores
        Lista_distribuidores.add(dist1);
        Lista_distribuidores.add(dist2);
        Lista_distribuidores.add(dist3);
        //Lista de farmacias
        Lista_sucursales.add(farmacia1);
        Lista_sucursales.add(farmacia2);
        //Lista medicamentos
        Lista_medicamentos.add(medi1);
        Lista_medicamentos.add(medi2);
        Lista_medicamentos.add(medi3);
        //
        categoria1.getLista_medicamneto().add(tipo1);
        categoria1.getLista_medicamneto().add(tipo2);
        categoria1.getLista_medicamneto().add(tipo3);
        categoria1.getLista_medicamneto().add(tipo4);
        categoria1.getLista_medicamneto().add(tipo5);
        categoria1.getLista_medicamneto().add(tipo6);
        return true;
    }
    
    public ArrayList<String> Mostrar_tipos(){
        Datos();
        ArrayList <String> lista_medicamentos = new ArrayList();
        for (int i = 0; i < Lista_tipos.size(); i++) {
            lista_medicamentos.add(Lista_tipos.get(i).getTipo_medicamento());
        }
        return lista_medicamentos;
    }
}
