/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "WSOperation")
public class WSOperation {

    /**
     * This is a sample web service operation
     */
    controlador control = new controlador();
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "cargarproductos")
    public ArrayList<String> Productos(@WebParam(name = "nombre") String nombre) {
        return control.Mostrar_tipos();
    }
}
