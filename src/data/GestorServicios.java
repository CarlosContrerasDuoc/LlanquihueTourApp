/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
/**
 *
 * @author carlo
 */
public class GestorServicios {
    public void mostrarServiciosPrueba() {
        System.out.println("=========================================================================================");
        System.out.println("              LLANQUIHUE TOUR - CATALOGO DE SERVICIOS TURISTICOS");
        System.out.println("=========================================================================================\n");


        // 1. Instancias de RutaGastronomica (al menos 2)
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores del Lago en Puerto Octay", 3.5, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Cocina tradicional de Llanquihue", 4.0, 4);


        // 2. Instancias de PaseoLacustre (al menos 2)
        PaseoLacustre paseo1 = new PaseoLacustre("Navegacion por el Lago Llanquihue", 2.5, "Velero");
        PaseoLacustre paseo2 = new PaseoLacustre("Recorrido por la Bahia de Frutillar", 1.5, "Barco turistico");


        // 3. Instancias de ExcursionCultural (al menos 2)
        ExcursionCultural excursion1 = new ExcursionCultural("Recorrido patrimonial por Puerto Varas", 3.0, "Casa Kuschel");
        ExcursionCultural excursion2 = new ExcursionCultural("Visita cultural en Osorno", 4.5, "Fuerte Reina Luisa");


        // Despliegue por consola utilizando el método toString()
        System.out.println("--- RUTAS GASTRONOMICAS ---");
        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println("\n--- PASEOS LACUSTRES ---");
        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println("\n--- EXCURSIONES CULTURALES ---");
        System.out.println(excursion1);
        System.out.println(excursion2);


    }
    
}
