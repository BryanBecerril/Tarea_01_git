public class Direccion {
    public static void main(String[] args) {
        String direccionOriginal = "       Av. Libertador, 1234, Ciudad de México, C.P. 06000      ";

        System.out.println("Dirección original: '" + direccionOriginal + "'");

        String direccion = direccionOriginal.trim();
        System.out.println("Dirección corregida (sin espacios extra): '" + direccion + "'");

        int longitud = direccion.length();
        System.out.println("Cantidad de caracteres: " + longitud);

        char primerCaracter = direccion.charAt(0);
        System.out.println("Primer carácter: '" + primerCaracter + "'");

        char ultimoCaracter = direccion.charAt(direccion.length() - 1);
        System.out.println("Último carácter: '" + ultimoCaracter + "'");

        String direccionMayusculas = direccion.toUpperCase();
        System.out.println("Dirección en mayúsculas: '" + direccionMayusculas + "'");

        String direccionMinusculas = direccion.toLowerCase();
        System.out.println("Dirección en minúsculas: '" + direccionMinusculas + "'");

        String[] componentes = direccion.split(", ");
        String calle = componentes[0].replace("Av. ", "");
        String numero = componentes[1];
        String ciudad = componentes[2].replace("Ciudad de ", "");
        String codigoPostal = componentes[3].replace("C.P. ", "");

        System.out.println("Calle: " + calle);
        System.out.println("Número: " + numero);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Código Postal: " + codigoPostal);

        int posicion15 = direccion.indexOf("15");
        if (posicion15 != -1) {
            System.out.println("Primera aparición del número '15' está en la posición: " + posicion15);
        } else {
            System.out.println("El número '15' no está presente en la dirección.");
        }

        String direccionCorregida = direccion.replace(",", "")
                                             .replace(".", "")
                                             .replace(" ", "");
        System.out.println("Dirección corregida (sin comas, puntos ni espacios): '" + direccionCorregida + "'");

        String direccionSinEspacios = direccion.replace(" ", "");
        System.out.println("Dirección sin espacios: '" + direccionSinEspacios + "'");

        String direccionAbreviada = calle + ", " + numero + ", " + ciudad + ", " + codigoPostal;
        System.out.println("Dirección abreviada: '" + direccionAbreviada + "'");
    }
}