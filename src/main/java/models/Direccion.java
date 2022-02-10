
package models;

import java.io.Serializable;

public class Direccion implements Serializable{
    
    private String calle;
    private String colonia;
    private int codigoPostal;
    private String ciudad;
    private int numeroExterior;
    
    //constructor por defecto
    public Direccion(){
        
    }
    
    //constructor 
    public Direccion(String calle, String colonia, int codigoPostal, String ciudad, int numeroExterior) {
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.numeroExterior = numeroExterior;
    }
    
    //getter
    public String getCalle() {
        return calle;
    }

    public String getColonia() {
        return colonia;
    }

    public int getCodigopostal() {
        return codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getReferencia() {
        return numeroExterior;
    }
    
    //setter
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setCodigopostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setReferencia(int numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", codigopostal=" + codigoPostal + ", ciudad=" + ciudad + ", referencia=" + numeroExterior + '}';
    }
    
}
