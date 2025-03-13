package unidad11.ejercicio3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Persona> listaPersonas = new HashSet<>();
        listaPersonas.add(new Persona("Mauricio", "630720540", "mauromircam@gmail.com", 5, 1, 2006));
        listaPersonas.add(new Persona("Pablo", "630720544", "pablohros@gmail.com", 16, 2, 2006));
        listaPersonas.add(new Persona("Alberto", "630720543", "josealfredoroberto@gmail.com", 18, 9, 2006));

        for (Persona persona : listaPersonas) {

            System.out.println(persona);
        }
    }
}
