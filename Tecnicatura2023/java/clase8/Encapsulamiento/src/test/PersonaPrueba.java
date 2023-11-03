
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Osvaldo", 57.000, false);
    
         System.out.println("Persona1: "+persona1);
        
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre="Juan Ignacio"; Ya no se puede utilizar
        //System.out.println("Nombre es:"+persona1.nombre); Error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 en el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        
        
         System.out.println("Persona1: "+persona1.toString());
        
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //Y Imprimir, luego modificer sus valores y volver a imprimir
        
        Persona persona5 = new Persona ("nehuel", 107.000, false);
        
        System.out.println("persona5 con el nombre modificado: "+persona5.getNombre());
        System.out.println("persona5 con resultado para el sueldo: "+persona5.getSueldo());
        System.out.println("persona5 para obtener el booleano: "+persona5.isEliminado());
        
        persona5.setNombre("Pedro");
        persona5.setSueldos(124.000);
        
        System.out.println("persona5 con el nombre modificado: "+persona5.getNombre());
        System.out.println("persona5 con resultado para el sueldo: "+persona5.getSueldo());
        System.out.println("persona5 para obtener el booleano: "+persona5.isEliminado());
    
        System.out.println("Persona1: "+persona1.toString());
    }
    
}
