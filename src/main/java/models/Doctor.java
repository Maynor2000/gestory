package models;

import java.io.Serializable;
import java.time.LocalTime;

public class Doctor extends Empleado implements Serializable{
    private String cedula;
    
    //constructor por defecto
    public Doctor(String cedula, Integer idEmpleado) {
        super(idEmpleado);
        this.cedula = cedula;
    }
    
    //constructor parametrizado
    public Doctor(String cedula, Integer idEmpleado, String name, String firstName, String birthdate, char sex, int age, String email, int telephone, Direccion direction) {
        super(idEmpleado, name, firstName, birthdate, sex, age, email, telephone, direction);
        this.cedula = cedula;
    }
    
    //getter
    public String getCedula() {
        return cedula;
    }
    
    //setter
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Doctor{" + "cedula=" + cedula + '}';
    }
    
}
