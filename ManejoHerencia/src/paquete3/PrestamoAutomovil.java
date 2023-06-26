package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAuto;
    private double valorMensualPago;

    public PrestamoAutomovil(Persona beneficiario, int tiempoMeses, String ciudad,
            String tAuto, String mAuto, Persona g1, double vAuto) {
        super(beneficiario, tiempoMeses, ciudad);
        tipoAuto = tAuto;
        marcaAuto = mAuto;
        garante1 = g1;
        valorAuto = vAuto;
        valorMensualPago = valorAuto / tiempoMeses;
    }

    public void establecerTipoAuto(String tAuto) {
        tipoAuto = tAuto;
    }

    public void establecerMarcaAuto(String mAuto) {
        marcaAuto = mAuto;
    }

    public void establecerGarante1(Persona g1) {
        garante1 = g1;
    }

    public void establecerValorAuto(double vAuto) {
        valorAuto = vAuto;
    }

    public void establecerValorMensualPago(double vMenPago) {
        valorMensualPago = vMenPago;
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public double obtenerValorMensualPago() {
        return valorMensualPago;
    }

     @Override
    public String toString() {
        return super.toString()
                + "\nPrestamo Automovil: \n"
                + "Tipo de Automovil: " + tipoAuto + "\n"
                + "Marca del Automovil: " + marcaAuto + "\n"
                + "Garante 1: " + garante1 + "\n"
                + "Valor del Automovil: " + valorAuto + "\n"
                + "Valor Mensual de Pago: " + valorMensualPago + "\n";
    }
}
