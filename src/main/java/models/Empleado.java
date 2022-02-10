package models;

import java.io.Serializable;
import java.time.LocalTime;

public class Empleado extends Persona implements Serializable{
    
    //campos de clase
    private Integer idEmpleado;
    
    //constructor, herencia.
    public Empleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;

    }
    
    //constructor parametrizado
    public Empleado(Integer idEmpleado, String name, String firstName, String birthdate, char sex, int age, String email, int telephone, Direccion direction) {
        super(name, firstName, birthdate, sex, age, email, telephone, direction);
        this.idEmpleado = idEmpleado;

    }
    
    //getter
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    //setter
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idempleado=" + idEmpleado + '}';
    }  
}
