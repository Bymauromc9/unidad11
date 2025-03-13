package unidad11.ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Jugador, Integer> listaJugadores = new HashMap<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> añadirJugador();
                default -> System.out.println("hola");
            }
        } while (opcion != 5);
        entrada.close();
    }

    public static void menu() {

        System.out.println("1. Añadir jugador");
        System.out.println("2. Eliminar jugador");
        System.out.println("3. Consultar salario del jugador");
        System.out.println("4. Incrementar un 10% el salario a un empleado");
    }

    public static boolean añadirJugador() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el nombre de jugador: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce el salario del jugador: ");
        double salario = entrada.nextDouble();

        Jugador jugador = new Jugador(nombre, salario);
        if (jugador == null)
            return false;
        if (!listaJugadores.containsKey(jugador))
            listaJugadores.put(jugador, 1);
        else
            listaJugadores.put(jugador, (listaJugadores.get(jugador) + 1));
        return true;

    }

}
