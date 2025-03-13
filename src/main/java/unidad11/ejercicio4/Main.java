package unidad11.ejercicio4;

import java.util.LinkedHashSet;


public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Persona> listaPersonas=new LinkedHashSet();
        listaPersonas.add(new Persona("Mauricio", "630720540", "mauromircam@gmail.com", 2006, 1, 5));
        listaPersonas.add(new Persona("Pablo", "630720544", "mauromircam@gmail.com", 2006, 2, 16));
        
        listaPersonas.add(new Persona("Alberto", "630720541", "josealfredoroberto@gmail.com", 2006, 8, 7));
        listaPersonas.add(new Persona("Alberto", "630720541", "josealfredoroberto@gmail.com", 2006, 8, 7));

        System.out.println(listaPersonas);

         /*
            Ha cambiado que el linkedHasSet lo unico que cambia es que se ordena por orden
            de insercion en cambio HashSet no.

        */
    }

}
