package models;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

public class Paciente extends Persona implements Serializable{
    
   //atributos
   private int idPaciente; 
   private boolean primeraVez;
   private List metodoEntero;
   
   //constructor por defecto
    public Paciente(){
    }
    public Paciente(int idPaciente, boolean primeraVez, List metodoEntero) {
        this.idPaciente = idPaciente;
        this.primeraVez = primeraVez;
        this.metodoEntero = metodoEntero;
    }
    
    //constructor parametrizado
    public Paciente(int idPaciente, boolean primeraVez, List metodoEntero, String name, String firstName, String birthdate, char sex, int age, String email, int telephone, Direccion direction) {
        super(name, firstName, birthdate, sex, age, email, telephone, direction);
        this.idPaciente = idPaciente;
        this.primeraVez = primeraVez;
        this.metodoEntero = metodoEntero;
    }
    
    //getter
    public int getIdPaciente() {
        return idPaciente;
    }

    public boolean isPrimeravez() {
        return primeraVez;
    }

    public List getMetodEntero() {
        return metodoEntero;
    }
    
    //setter
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setPrimeravez(boolean PrimeraVez) {
        this.primeraVez = PrimeraVez;
    }

    public void setMetodoEntero(List metodoEntero) {
        this.metodoEntero = metodoEntero;
    }
    
    @Override
    public String toString() {
        return "Paciente{" + "idpaciente=" + idPaciente + ", primeravez=" + primeraVez + ", metodoentero=" + metodoEntero + '}';
    }
}
