/**
 * @author (Alejandro Fernandez y Andrea Gonzalez) 
 * @version (25/11/2021)
 */
public class Ordenador {
    // Marca del ordenador
    private String marca;
    // Id del ordenador
    private long id;
    // Objeto teclado
    private Teclado teclado;

    /**
     * Crea un ordenador
     */
    public Ordenador(String fabricante, long codigoOrdenador, Teclado elTeclado) {
        marca = fabricante;
        id = codigoOrdenador;
        teclado = elTeclado;
    }
}
