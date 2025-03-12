package unidad11.ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
    private String nombre;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;


    /**
     * Constructor con los parametros pedidos
     * @param nombre
     * @param telefono
     * @param email
     * @param anyo
     * @param mes
     * @param dia
     */
    public Persona(String nombre, String telefono, String email, int anyo, int mes, int dia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = LocalDate.of(anyo, mes, dia);
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * HashCode para el HashSet
     */

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    /**
     * Metodo equals para ver si son validos los objetos
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fechaNacimiento == null) {
            if (other.fechaNacimiento != null)
                return false;
        } else if (!fechaNacimiento.equals(other.fechaNacimiento))
            return false;
        return true;
    }

    /**
     * Metodo toString para mostrar por pantalla la informacion de persona
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento="
                + fechaNacimiento + "]\n";
    }
    
    
    

    
}
