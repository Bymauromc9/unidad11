package unidad11.ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
     public static HashMap<String, Double> listaJugadores = new HashMap<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> añadirJugador();
                case 2 -> eliminarJugador();
                case 3 -> consultarSalario();
                case 4 -> incrementarSalario();
                case 5 -> mostrarPlantilla();
                case 6 -> System.out.println("Hasta pronto...");
                default -> System.out.println("Opcion incorrecta, introduce una opcion correcta");
            }
        } while (opcion != 6);
         
        entrada.close();
    }

    public static void menu() {

        System.out.println("1. Añadir jugador");
        System.out.println("2. Eliminar jugador");
        System.out.println("3. Consultar salario del jugador");
        System.out.println("4. Incrementar un 10% el salario a un empleado");
        System.out.println("5. Mostrar plantilla");
        System.out.println("6. Salir");

    }

    public static boolean añadirJugador() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el nombre de jugador: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce el salario del jugador: ");
        double salario=entrada.nextInt();
        if(listaJugadores.containsKey(nombre)){
            System.out.println("Jugador repetido");
            return false;
        }
        else
            listaJugadores.put(nombre, salario);

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

    public static boolean eliminarJugador(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador");
        String nombre= entrada.nextLine();

        if(listaJugadores.remove(nombre)!=null){
            System.out.println("Jugador eliminado");
            listaJugadores.remove(nombre);
            return true;
        }else
            System.out.println("Jugador no encontrado");
        
            return false;
    }

    public static boolean consultarSalario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador");
        String nombre=entrada.nextLine();
        double salario=listaJugadores.get(nombre);
        if(salario!=0){
            System.out.println("Su salario es de: "+salario);
            return true;
        }
        else
            System.out.println("No se ha encontrado ese jugador");

        return false;
    }


    public static boolean incrementarSalario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador");
        String nombre=entrada.nextLine();
        double salario=listaJugadores.get(nombre);
        if(salario!=0){
            listaJugadores.put(nombre, (int)salario*1.1);
            return true;
        }else
            System.out.println("No se ha encontrado jugador");
            
            return false;
    }

    public static void mostrarPlantilla(){
        Map.Entry<String,Double> jugador;
        Iterator<Map.Entry<String,Double>> it = listaJugadores.entrySet().iterator();
        while (it.hasNext()) {
            jugador=(Entry<String, Double>)it.next();
            System.out.println(jugador.getKey()+" cobra "+jugador.getValue());
            
        }

    }


}

=======
}
>>>>>>> 1198b67c2d08e78417da1bea77166e65046de256
