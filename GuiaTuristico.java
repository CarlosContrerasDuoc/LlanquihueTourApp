/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class GuiaTuristico {
    //Atributos encapsulados.
    private String rut;
    private String nombreCompleto;
    private String telefono;
    private String especialidad;
    private int tiempoExperiencia;
    private Direccion direccion; //Composicion

    public GuiaTuristico() {
    }

    public GuiaTuristico(String rut, String nombreCompleto, String telefono, String especialidad, int tiempoExperiencia, Direccion direccion) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.tiempoExperiencia = tiempoExperiencia;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
public String toString() {
    return String.format(
        "RUT: %s | Nombre: %s | Telefono: %s | Especialidad: %s | Experiencia: %d años | Direccion: %s",
        rut, nombreCompleto, telefono, especialidad, tiempoExperiencia, direccion
    );
}
}
 

