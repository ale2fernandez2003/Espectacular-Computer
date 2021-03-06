/**
 * @author (Alejandro Fernandez y Andrea Gonzalez) 
 * @version (24/11/2021)
 */
public class Teclado {
    // Numero de teclas del teclado
    private int numeroTeclas;
    // Informacion sobre la conexi�n del teclado
    private boolean conectado;

    /**
     * Crea un teclado
     */
    public Teclado(int teclas, boolean conected) {
        numeroTeclas = teclas;
        conectado = conected;
    }

    /**
     * Devuelve el numero de teclas.
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
     * Nos permite modificar el numero de teclas del teclado.
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
    
    /**
     * Imprime el estado del teclado.
     */
    public void imprimirDetalles () {
        if (conectado) {  
            System.out.println ("El teclado esta conectado.");
        }

        else {
            System.out.println ("El teclado no esta conectado.");
        }
        System.out.println ("Tiene " +  (numeroTeclas)  + " teclas.");
    }
}
