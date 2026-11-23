/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.GuiaTuristico;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author carlo
 */
public class GestorGuias {
    
    private List<GuiaTuristico> listaGuias;

    public GestorGuias() {
    }
    
    

    public GestorGuias(List<GuiaTuristico> listaGuias) {
        this.listaGuias = listaGuias;
    }

    public List<GuiaTuristico> getListaGuias() {
        return listaGuias;
    }

    public void setListaGuias(List<GuiaTuristico> listaGuias) {
        this.listaGuias = listaGuias;
    }
    
    
    //Hacer una lista de todos los registros.
    public void mostrarTodos(){
        if (listaGuias.isEmpty()){
            System.out.println("No hay guias registrados en el sistema.");
            return;            
        }
        for (GuiaTuristico g : listaGuias){
            System.out.println(g);
        }
    }
    
    //Filtrar según especialidad.
    public List <GuiaTuristico> buscarPorEspecialidad (String especialidad){
        List <GuiaTuristico> resultado = new ArrayList<>();
        for (GuiaTuristico g : listaGuias){
            if(g.getEspecialidad().equalsIgnoreCase(especialidad)){
                resultado.add(g);
            }
        }
        return resultado;
    } 
    
    //Filtrar según ciudad de la direccion.
    public List <GuiaTuristico> buscarPorCiudad (String ciudad){
        List <GuiaTuristico> resultado = new ArrayList<>();
        for (GuiaTuristico g : listaGuias){
            if(g.getDireccion().getCiudad().equalsIgnoreCase(ciudad)){
                resultado.add(g);
            }
        }
        return resultado;
    } 
    
    
    
    
    
    
    
    
}
