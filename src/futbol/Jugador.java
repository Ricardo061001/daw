package futbol;
/**
 * Clase Jugador
 * @author ricardo
 * @version 1.0
 * @since 02/04/2024
 */
public class Jugador {
    // Atributos
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Jugador
     * @param nombre El nombre del jugador
     * @param edad La edad del jugador
     */
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    /**
     * Método para obtener el nombre del jugador
     * @return El nombre del jugador
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método para obtener la edad del jugador
     * @return La edad del jugador
     */
    public int getEdad() {
        return this.edad;
    }
}

