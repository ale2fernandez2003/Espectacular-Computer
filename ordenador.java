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
     * Crea un ordenador.
     */
    public Ordenador(String fabricante, long codigoOrdenador, Teclado elTeclado) {
        marca = fabricante;
        id = codigoOrdenador;
        teclado = elTeclado;
    }
    
    /**
     * Devuelve la marca del ordenador.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Devuelve la ID del ordenador.
     */
    public long getId () {
        return id;
    }
    
    /**
     * Devuelve el estado del teclado.
     */
    public Teclado getElTeclado() {
        return teclado;
    }
    
    /**
     * Nos permite cambiar la ID del ordenador.
     */
    public void setId (long codigoOrdenador) {
        id = codigoOrdenador;
    }
    
    /**
     * Nos permite cambiar el fabricante del ordenador.
     */    
    public void setMarca (String fabricante) {
        marca = fabricante;
    }
    
    /**
     * Nos permite cambiar el estado.
     */    
    public void setTeclado (Teclado nuevoTeclado) {
        nuevoTeclado = teclado;
    }
    
    /**
     * Imprime el estado del ordenador.
     */    
    public void imprimirDetalles () {
    System.out.println ("El ordenador es de marca " + marca + ", con Id: " + id + ". ¿El teclado está conectado? " + teclado.getConectado() + ". Tiene " + teclado.getNumeroTeclas() + " teclas.");
    }
}