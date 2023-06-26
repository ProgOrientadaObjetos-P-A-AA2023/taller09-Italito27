/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centro;
    private double valorCarrera;
    private double valorPagoMensual;

    public PrestamoEducativo(Persona beneficiario, int tiempoMeses, String ciudad,
            String nEstudio, InstitucionEducativa cen, double vCarrera) {
        super(beneficiario, tiempoMeses, ciudad);
        nivelEstudio = nEstudio;
        centro = cen;
        valorCarrera = vCarrera;
        valorPagoMensual = (valorCarrera / tiempoMeses) - (0.1 * (valorCarrera / tiempoMeses));
    }

    public void establecerNivelEstudio(String nEstudio) {
        nivelEstudio = nEstudio;
    }

    public void establecerCentro(InstitucionEducativa c) {
        centro = c;
    }

    public void establecerValorCarrera(double vCarrera) {
        valorCarrera = vCarrera;
    }

    public void establecerValorPagoMensual(double vPMensual) {
        valorPagoMensual = vPMensual;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentro() {
        return centro;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorPagoMensual() {
        return valorPagoMensual;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPrestamo Educativo: " + "\n"
                + "Nivel Estudio: " + nivelEstudio + "\n"
                + "Centro Educativo: " + centro + "\n"
                + "Valor Carrera: " + valorCarrera + "\n"
                + "Valor Mensual de Pago: " + valorPagoMensual + "\n";
    }
}
