package paquete2;

import paquete1.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoMeses;
    protected String ciudad;

    public Prestamo(Persona b, int t, String c) {
        beneficiario = b;
        tiempoMeses = t;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona bene) {
        beneficiario = bene;
    }

    public void establecerTiempoMeses(int tMes) {
        tiempoMeses = tMes;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoMeses() {
        return tiempoMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

}
