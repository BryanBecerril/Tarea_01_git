import java.util.Scanner;

public class InformacionUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sección 1: Domicilio completo
        System.out.println("Por favor, ingresa tu domicilio completo:");

        System.out.print("Calle: ");
        String calle = scanner.nextLine();

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Colonia: ");
        String colonia = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("Código Postal: ");
        String codigoPostal = scanner.nextLine();

        // Sección 2: Datos escolares
        System.out.println("\nAhora, ingresa los datos de tu escolaridad:");

        System.out.print("Nombre de tu primaria: ");
        String primaria = scanner.nextLine();

        System.out.print("Nombre de tu secundaria: ");
        String secundaria = scanner.nextLine();

        System.out.print("Nombre de tu preparatoria: ");
        String preparatoria = scanner.nextLine();

        // Sección 3: Datos de tu deporte favorito
        System.out.println("\nDatos de tu deporte favorito:");

        System.out.print("Nombre del deporte: ");
        String deporte = scanner.nextLine();

        System.out.print("Posición que juegas (si aplica): ");
        String posicion = scanner.nextLine();

        System.out.print("¿Desde cuándo lo practicas?: ");
        String tiempoPractica = scanner.nextLine();

        System.out.print("¿Cuál es tu equipo favorito (si aplica)?: ");
        String equipoFavorito = scanner.nextLine();

        // Mostrar toda la información ingresada
        System.out.println("\n--- Resumen de la información ingresada ---");

        // Mostrar domicilio
        System.out.println("\nDomicilio completo:");
        System.out.println("Calle: " + calle);
        System.out.println("Número: " + numero);
        System.out.println("Colonia: " + colonia);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Estado: " + estado);
        System.out.println("Código Postal: " + codigoPostal);

        // Mostrar datos escolares
        System.out.println("\nDatos escolares:");
        System.out.println("Primaria: " + primaria);
        System.out.println("Secundaria: " + secundaria);
        System.out.println("Preparatoria: " + preparatoria);

        // Mostrar datos del deporte favorito
        System.out.println("\nDeporte favorito:");
        System.out.println("Deporte: " + deporte);
        System.out.println("Posición que juegas: " + posicion);
        System.out.println("Práctica desde: " + tiempoPractica);
        System.out.println("Equipo favorito: " + equipoFavorito);

        scanner.close();
    }
}