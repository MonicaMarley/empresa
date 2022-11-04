package edu.mintic.empresa.entidades;

import jakarta.persistence.Entity;

@Entity
public class Dispositivos {
    
    private int idDispositivo;
    private String nombre;
    private String referencia;
    private Empleado empleado;

    
    public Dispositivos() {
    }


    public Dispositivos(String nombre, String referencia, Empleado empleado) {
        this.nombre = nombre;
        this.referencia = referencia;
        this.empleado = empleado;
    }


    public int getIdDispositivo() {
        return idDispositivo;
    }


    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getReferencia() {
        return referencia;
    }


    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    public Empleado getEmpleado() {
        return empleado;
    }


    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


    @Override
    public String toString() {
        return "Dispositivos [idDispositivo=" + idDispositivo + ", nombre=" + nombre + ", referencia=" + referencia
                + ", empleado=" + empleado + "]";
    }
    
    

    


}
