/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontarea1;

/**
 *
 * @author Iván Andrés Mogollón Sumárraga
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    public static void main(String[] args) {
     System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
     System.out.println("\t\t   Sede Latacunga\n");
     System.out.println("Nombre y Apellido: Andrés Mogollón S. ");
     System.out.println("Carrera: Ing.Automotriz");
     System.out.println("Materia: Programacion [7450] ");
     System.out.println("Fecha: 18/07/2020");
     System.out.println("\t\tColeccion\n");

    Collection TareasProyecto=new ArrayList<String>();
    TareasProyecto.add("Desmontaje de llantas");
    TareasProyecto.add("Limpieza de discos");
    TareasProyecto.add("Comprobación del estado de los discos");
    TareasProyecto.add("Comprobación del estado de las zapatas");
    TareasProyecto.add("Limpieza de zapatas");
    TareasProyecto.add("Revision de Mangueras");
    TareasProyecto.add("Verificación de la calibración del freno de mano");
    TareasProyecto.add("Inspeccionamos fugas de líquido de freno");
    System.out.println("Número de tareas a desarrollar: "+TareasProyecto.size());
    System.out.println("Las Tareas a desarrollar son: ");
    System.out.println(TareasProyecto.toString());

    System.out.println("Número de tareas a desarrollar "+TareasProyecto.size());
    System.out.println("Las tareas que desarrollamos son: ");
    System.out.println(TareasProyecto.toString());
    System.out.println("\n\t Sé un punto de referencia de calidad. ...");
    System.out.println("\t\t\t-Steve Jobs");
    }
}
