public class Main {
    public static void main(String[] args) {

        String nombre_completo = "García, Juan Carlos";

        int longitud = nombre_completo.length();
        System.out.println("Longitud del nombre: " + longitud);

        int coma = nombre_completo.indexOf(',');
        String apellido = nombre_completo.substring(0, coma);
        System.out.println("Apellido: " + apellido);

        String nombre_sin_apellido = nombre_completo.substring(coma + 2);
        System.out.println("Nombre sin apellido: " + nombre_sin_apellido);

        int espacio = nombre_sin_apellido.indexOf(' ');
        String nombre_primero = nombre_sin_apellido.substring(0, espacio);
        System.out.println("Primer nombre: " + nombre_primero);

        String apellido_mayus = apellido.toUpperCase();
        System.out.println("Apellido en mayúsculas: " + apellido_mayus);

        String nombre_mayus = nombre_completo.toLowerCase();
        System.out.println("Nombre completo en nimúsculas: " + nombre_mayus);

        char caracter = nombre_completo.charAt(4);
        System.out.println("El carácter en la posición 5 es: " + caracter);

        int primera_a = nombre_completo.indexOf("a");
        System.out.println("Primera ocurrencia de ´a´: " + primera_a);

        int ultima_a = nombre_completo.lastIndexOf("a");
        System.out.println("Última ocurrencia de ´a´: " + (ultima_a + 1));
    }

}