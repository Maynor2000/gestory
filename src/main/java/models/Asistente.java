package models;

import java.io.Serializable;
import java.time.LocalTime;

public class Asistente extends Empleado implements Serializable{
    
    //constructor
    public Asistente(Integer idEmpleado) {
        super(idEmpleado);
    }
    
    //constructor
    public Asistente(Integer idEmpleado, String name, String firstName, String birthdate, char sex, int age, String email, int telephone, Direccion direction) {
        super(idEmpleado, name, firstName, birthdate, sex, age, email, telephone, direction);
    }

    @Override
    public String toString() {
        return "Asistente{}";
    }
    
}
