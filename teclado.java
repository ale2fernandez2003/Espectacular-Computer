/**
 * @author (Alejandro Fern�ndez y Andrea Gonz�lez) 
 * @version (24/11/2021)
 */
public class teclado {
    // N�mero de teclas del teclado
    private int numeroTeclas;
    // Informaci�n sobre la conexi�n del teclado
    private boolean conectado;

    /**
     * Crea un teclado
     */
    public teclado(int teclas, boolean conected) {
        numeroTeclas = teclas;
        conectado = conected;
    }

    /**
     * Devuelve el n�mero de teclas.
     */
    public int getNumeroTeclas() {
        return numeroTeclas;
    }
    
    /**
     * Devuelve el estado del teclado.
     */
    public boolean getConectado() {
        return conectado;
    }
    
    /**
     * Nos permite modificar el n�mero de teclas del teclado.
     */
    public void setNumeroTeclas(int numeroDeTeclas) {
        numeroTeclas = numeroDeTeclas;
    }
    
    /**
     * Nos permite modificar el estado del teclado.
     */
    public void setConectado(boolean conexion) {
        conectado = conexion;
    }
}
