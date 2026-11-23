 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import model.GuiaTuristico;
import service.GestorGuias;
import util.LectorArchivo;
import java.util.List;


/**z
 *
 * @author carlo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===========================================================================");
        System.out.println("LLANQUIHUE TOUR - SISTEMA DE ADMINISTRACION DE SERVICIOS Y GUIAS TURISTICOS");
        System.out.println("===========================================================================");
        
        GestorGuias gestor = new GestorGuias();
        String rutaArchivo = "src/resources/guias.txt";
        
        //1. Cargar datos desde archivo .txt
        System.out.print("1. CARGANDO DATOS DESDE ARCHIVO EXTERNO: ");
        List <GuiaTuristico> guiasCargados = LectorArchivo.cargarGuiasDesdeTxt(rutaArchivo);
        gestor.setListaGuias(guiasCargados);
        
        //2. Listado completo
        System.out.println("\n2. CATALOGO COMPLETO DE GUIAS REGISTRADOS:");
        System.out.println("......................................................................................................................");
        gestor.mostrarTodos();
        
        //3. Filtrar según especialidad
        String especialidadFiltro = "Tours Culturales";
        System.out.println("\n3. FILTRO POR ESPECIALIDAD: " + especialidadFiltro.toUpperCase());
        System.out.println("................................................................................................");
        List <GuiaTuristico> porEspecialidad = gestor.buscarPorEspecialidad(especialidadFiltro);
        for (GuiaTuristico g : porEspecialidad){
            System.out.println(g);
        }
        
        //4. Filtrar según ciudad
        String ciudadFiltro = "Puerto Montt";
        System.out.println("\n4. FILTRO POR CIUDAD: " + ciudadFiltro.toUpperCase());
        System.out.println(".............................................................................................");
        List <GuiaTuristico> porCiudad = gestor.buscarPorCiudad(ciudadFiltro);
        for (GuiaTuristico g : porCiudad){
            System.out.println(g);
        }

        System.out.println("\n================================================================================================");
        System.out.println("Sistema finalizado correctamente.");
        
        
    }
    
}
