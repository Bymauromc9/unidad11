package unidad11.ejercicio6;

public class Jugador {
    private String nombre;
    private double salario;

    public Jugador(String nombre, double salario) {
        setNombre(nombre);
        setSalario(salario);
<<<<<<< HEAD
        System.out.println("Jugador instanciado correctamente");
=======
>>>>>>> 1198b67c2d08e78417da1bea77166e65046de256
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
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", salario=" + salario + "]";
    }

>>>>>>> 1198b67c2d08e78417da1bea77166e65046de256
}
