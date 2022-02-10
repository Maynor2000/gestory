/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import models.Empleado;
import models.Persona;

/**
 *
 * @author may_a
 */
public class Repository{

    public Repository() {

    }
    public ArrayList<Object> leerDatos(String nombreArchivo){
        // Aquí cargaríamos el archivo serializado y como es el arrayList de animales
        // se lo asignaríamos a listaAnimales.
        ArrayList<Object> datos = new ArrayList();
        try{
            FileInputStream archivo1 = new FileInputStream(nombreArchivo+".dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo1);
            datos =(ArrayList<Object>) entrada.readObject();
            entrada.close();
            archivo1.close();
        }
        catch(IOException e){
             System.out.println("Problemas con el archivo");
        }
        catch(Exception e){
            System.out.println("Error al leer un objeto");
        }
        return datos;
    }
        //Escribir datos de los empleados
    public void escribirDatos(ArrayList<Object> dato,String nombreArchivo){
        try{
            ArrayList<Object>datos = leerDatos(nombreArchivo);
            
            FileOutputStream archivo = new FileOutputStream(nombreArchivo+".dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            
            for(Object a:datos){dato.add(a);}
            salida.writeObject(dato);
            salida.close();
            archivo.close();
        }
        catch(IOException e){
            System.out.println("Problemas con el archivo");
        }
        
    }
}
