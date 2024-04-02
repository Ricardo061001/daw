package futbol;

/**
 * Clase Equipo
 * @author Ricardo
 * @version 1.0
 * @since 02/04/2024
 * @see Jugador
 */
public class Equipo {
    // Atributos
    private String nombre;
    private Jugador[] jugadores;

    /**
     * Constructor de la clase Equipo
     * @param nombre El nombre del equipo
     * @param jugadores Los jugadores del equipo
     */
    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }




}
