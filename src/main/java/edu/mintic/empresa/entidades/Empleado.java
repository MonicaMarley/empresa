package edu.mintic.empresa.entidades;

import java.util.List;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
//@Table(name = "tbl_empleado") //para poder nombrar la clase diferente a la tabla

public class Empleado {
    
    //@Column(name = "id_empleado") //para nombrar la columna diferente a los atributos

    private @Id @GeneratedValue long idEmpleado;
    private String nombre;
    private String apellido;
    private double salario;
    private String cargo;
    @OneToMany(mappedBy = "empleado")
    private List<Dispositivos> dispositivos;
    
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, double salario, String cargo,List<Dispositivos> dispositivos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.cargo = cargo;
        this.dispositivos = dispositivos;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }   



    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + "\n"
                + idEmpleado + ", nombre=" + "\n"
                + nombre + ", apellido=" + "\n"
                + apellido + ", salario=" + "\n"
                + salario + ", cargo=" + "\n"
                + cargo + "]";
    }

    public List<Dispositivos> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<Dispositivos> dispositivos) {
        this.dispositivos = dispositivos;
    }
      
    


}
