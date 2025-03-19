package unidad11.ejercicio5;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        HashSet<Persona_v2> listaPersonas=new HashSet();
=======
        LinkedHashSet<Persona_v2> listaPersonas = new LinkedHashSet();
>>>>>>> 1198b67c2d08e78417da1bea77166e65046de256
        listaPersonas.add(new Persona_v2("Mauricio", "630720540", "mauromircam@gmail.com", 2006, 1, 5));
        listaPersonas.add(new Persona_v2("Pablo", "630720544", "mauromircam@gmail.com", 2006, 2, 16));

        listaPersonas.add(new Persona_v2("Alberto", "630720541", "josealfredoroberto@gmail.com", 2006, 8, 7));
        listaPersonas.add(new Persona_v2("AlbertO", "630720541", "josealfredoroberto@gmail.com", 2006, 8, 7));

        System.out.println(listaPersonas);

    }

}
