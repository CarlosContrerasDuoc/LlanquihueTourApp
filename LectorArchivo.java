/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import model.Direccion;
import model.GuiaTuristico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author carlo
 */
public class LectorArchivo {
    public static List <GuiaTuristico> cargarGuiasDesdeTxt (String rutaArchivo){
        List <GuiaTuristico> lista = new ArrayList <>();
        
        try (BufferedReader br = new BufferedReader (new FileReader(rutaArchivo))){
            String linea;
            int numLinea = 0;
            
            while((linea = br.readLine()) !=null){
                numLinea++;
                if (linea.trim().isEmpty()) continue;
                
                String [] datos = linea.split(";");
                
                //Validamos el numero de columnas.
                if (datos.length == 8){
                try {
                    String rut = datos[0].trim();
                    String nombre = datos[1].trim();
                    String telefono = datos[2].trim();
                    String especialidad = datos [3].trim();
                    int exp = Integer.parseInt(datos [4].trim());
                    
                    String calle = datos [5].trim();
                    int numero = Integer.parseInt(datos[6].trim());
                    String ciudad = datos[7].trim();
                    
                    Direccion dir = new Direccion(calle, numero, ciudad);
                    GuiaTuristico guia = new GuiaTuristico (rut, nombre, telefono, especialidad, exp ,dir);
                    
                    lista.add(guia);
                } catch (NumberFormatException e){
                    System.out.println("Numero invalido en la linea  " + numLinea);       
                }
            }else{
                    System.out.println("La linea " + numLinea + " no tiene 8 datos.");
                    }
            }
            System.out.println("Se cargaron exitosamente " + lista.size());
        }catch (IOException e){
            System.out.println("Error al leer el archivo: '" + rutaArchivo + "': " + e.getMessage());
        }
    return lista;
    }
}
    

