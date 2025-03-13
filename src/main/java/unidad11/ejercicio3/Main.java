package unidad11.ejercicio3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Persona> listaPersonas = new HashSet<>();
        listaPersonas.add(new Persona("Pablo", "630720544", "mauromircam@gmail.com", 2006, 2, 16));
        listaPersonas.add(new Persona("Mauricio", "630720540", "mauromircam@gmail.com", 2006, 1, 5));
        listaPersonas.add(new Persona("Alberto", "630720541", "josealfredoroberto@gmail.com", 2006, 8, 7));
        listaPersonas.add(new Persona("Alberto", "630720541", "josealfredoroberto@gmail.com", 2006, 8, 7));

        System.out.println(listaPersonas);

        /*
         * 
         * Intenta hacer una inserción de una persona repetida ¿Qué ocurre? (Dos
         * personas son
         * iguales si tienen exactamente el mismo nombre).
         * Que directamente no las muestra en el toString, no muestra objetos duplicados
         * 
         * Muestra todos los valores almacenados en el HashSet ¿Tienen algún orden?
         * No tienen un orden regular, el orden va aleatoriamente
         */
    }
}
