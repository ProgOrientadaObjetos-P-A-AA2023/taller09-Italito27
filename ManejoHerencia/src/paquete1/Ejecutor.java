package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        List<Prestamo> prestamos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione el tipo de préstamo:");
            System.out.println("1. Préstamo de automóvil");
            System.out.println("2. Préstamo educativo");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del préstamo de automóvil:");

                    System.out.print("Nombre del beneficiario: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Apellido del beneficiario: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Username del beneficiario: ");
                    String username = scanner.nextLine();

                    System.out.print("Tiempo de préstamo en meses: ");
                    int tiempoMeses = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea

                    System.out.print("Ciudad del préstamo: ");
                    String ciudad = scanner.nextLine();

                    System.out.print("Tipo de automóvil: ");
                    String tipoAuto = scanner.nextLine();

                    System.out.print("Marca de automóvil: ");
                    String marcaAuto = scanner.nextLine();

                    System.out.print("Nombre del garante: ");
                    String nombreGarante = scanner.nextLine();

                    System.out.print("Apellido del garante: ");
                    String apellidoGarante = scanner.nextLine();

                    System.out.print("Username del garante: ");
                    String usernameGarante = scanner.nextLine();

                    System.out.print("Valor del automóvil: ");
                    double valorAuto = scanner.nextDouble();

                    Persona beneficiario = new Persona(nombre, apellido, username);
                    Persona garante1 = new Persona(nombreGarante, apellidoGarante, usernameGarante);
                    PrestamoAutomovil prestamoAuto = new PrestamoAutomovil(beneficiario, tiempoMeses, ciudad,
                            tipoAuto, marcaAuto, garante1, valorAuto);
                    prestamos.add(prestamoAuto);
                    break;

                case 2:
                    System.out.println("Ingrese los datos del préstamo educativo:");

                    System.out.print("Nombre del beneficiario: ");
                    nombre = scanner.nextLine();

                    System.out.print("Apellido del beneficiario: ");
                    apellido = scanner.nextLine();

                    System.out.print("Username del beneficiario: ");
                    username = scanner.nextLine();

                    System.out.print("Tiempo de préstamo en meses: ");
                    tiempoMeses = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ciudad del préstamo: ");
                    ciudad = scanner.nextLine();

                    System.out.print("Nivel de estudio: ");
                    String nivelEstudio = scanner.nextLine();

                    System.out.print("Nombre del centro educativo: ");
                    String nombreCentro = scanner.nextLine();

                    System.out.print("Siglas del centro educativo: ");
                    String siglasCentro = scanner.nextLine();

                    System.out.print("Valor de la carrera: ");
                    double valorCarrera = scanner.nextDouble();

                    beneficiario = new Persona(nombre, apellido, username);
                    InstitucionEducativa centro = new InstitucionEducativa(nombreCentro, siglasCentro);
                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(beneficiario, tiempoMeses, ciudad,
                            nivelEstudio, centro, valorCarrera);
                    prestamos.add(prestamoEducativo);
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo prestamo = prestamos.get(i);
            System.out.println(prestamo);
            System.out.println("--------------------");
        }
    }
}
