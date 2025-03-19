package unidad11.ejercicio6;

public class Jugador {
    private String nombre;
    private double salario;

    public Jugador(String nombre, double salario) {
        setNombre(nombre);
        setSalario(salario);
        System.out.println("Jugador instanciado correctamente");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
