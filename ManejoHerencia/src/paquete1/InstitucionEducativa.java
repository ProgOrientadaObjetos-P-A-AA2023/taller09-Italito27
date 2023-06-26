
package paquete1;

/**
 *
 * @author Italo
 */
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerSiglas(String sig) {
        siglas = sig;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }
    
}
