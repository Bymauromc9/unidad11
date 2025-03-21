package unidad11.ejercicio2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Parking_v2 {
    public static LinkedList<String> listaParking = new LinkedList<>();

    public static void menu() {
        System.out.println("1. Aparcar");
        System.out.println("2. Desaparcar");
        System.out.println("3. Mostrar lista matriculas");
        System.out.println("4. Salir");
    }

    public static void aparcar(String matricula) {
        if (matricula == null || matricula.isBlank() || !matricula.matches("[0-9]{4}[A-Z]{3}")) {
            throw new IllegalArgumentException(
                    "AVISO: La matricula debe contener 4 numeros primero y luego 3 letras en mayuscula");
        }

        listaParking.push(matricula);
        System.out.println("Vehiculo aparcado con matricula: " + matricula);
    }

    public static void desaparcar() {
        if (listaParking.size() < 1) {
            System.out.println("El parking esta vacio");
            return;
        } else
            System.out.println("Desparacando el coche con matricula: " + listaParking.peek());
        listaParking.poll();
    }

    public static void mostrarLista() {
        int contador = 1;
        if (listaParking.size() < 1) {
            System.out.println("El parking esta vacio");
            return;
        } else {
            for (String coche : listaParking) {
                System.out.println("Vehiculo " + contador + ": " + coche);
                contador++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println();
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    entrada.nextLine();
                    System.out.println("Introduce la matricula del coche: ");
                    String matricula = entrada.nextLine();
                    aparcar(matricula);
                }
                case 2 -> desaparcar();
                case 3 -> mostrarLista();
                case 4 -> System.out.println("Hasta pronto...");
                default -> System.out.println("Opcion erronea...");
            }
        } while (opcion != 4);

    }

}
