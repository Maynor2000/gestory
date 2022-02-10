package models;

import java.io.Serializable;
import java.time.LocalTime;

public abstract class Persona implements Serializable{
    
    //campos de clase
    private String name;
    private String lastName;
    private String birthdate;
    private char sex;
    private int age;
    private String email;
    private int telephone;
    private Direccion direction;
    
    //contructor por defecto
    public Persona(){
      
    }
    
    //contructor parametrizado
    public Persona(String name, String lastName, String birthdate, char sex, int age, String email, int telephone
            , Direccion direction) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.direction = direction;
    }
    
    //getter
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public Direccion getDirection() {
        return direction;
    }
    
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setDirection(Direccion direction) {
        this.direction = direction;
    }  

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", firsname=" + lastName + ", birthdate=" + birthdate + ", sex=" + sex + ", age=" + age + ", email=" + email + ", telephone=" + telephone + ", direction=" + direction + '}';
    }
    
}
