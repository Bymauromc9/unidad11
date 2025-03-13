package unidad11.ejercicio6;

public class Jugador {
    private String nombre;
    private double salario;

    public Jugador(String nombre, double salario) {
        setNombre(nombre);
        setSalario(salario);
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

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", salario=" + salario + "]";
    }

}
