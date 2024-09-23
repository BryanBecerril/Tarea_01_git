public class Main {
    public static void main(String[] args) {

        String palabra = "supercalifragilisticoespialidoso";
        System.out.println("La palabra es: " + palabra);

        int lon_pal = palabra.length();
        System.out.println("Longitud: " + lon_pal);

        char car_10 = palabra.charAt(10);
        System.out.println("Carácter en la posición 10: " + car_10);

        String mayusculas = palabra.toUpperCase();
        System.out.println("Mayusculas: " + mayusculas);

        String subcadenas = palabra.substring(5, 15);
        System.out.println("Subcadena de 5 a 15: " + subcadenas);

        int ocurrencia_i = palabra.indexOf("i");
        System.out.println("Primera ocurrencia de i: " + ocurrencia_i);

        int ocurrencia_o = palabra.lastIndexOf("o");
        System.out.println("Ultima ocurrencia de o: " + ocurrencia_o);

        String minusculas = palabra.toLowerCase();
        System.out.println("Minusculas: " + minusculas);

        String cadena_desde = palabra.substring(7);
        System.out.println("Subcadena desde 7: " + cadena_desde);

        int ultima_li = palabra.lastIndexOf("li");
        System.out.println("Ultima ocurrencia de li: " + ultima_li);
    }
}