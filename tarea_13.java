public class Inventario {

    public static void main(String[] args) {
        String producto = "12345; Laptop HP Pavilion; 1500.99; Electrónica";

        int longitud = producto.length();
        System.out.println("1. Longitud de la cadena: " + longitud);

        String idProducto = producto.substring(0, producto.indexOf(";"));
        System.out.println("2. ID del producto: " + idProducto);

        String nombreProducto = producto.substring(producto.indexOf(";") + 2, producto.lastIndexOf(";"));
        System.out.println("3. Nombre del producto: " + nombreProducto);

        String nombreMayusculas = nombreProducto.toUpperCase();
        System.out.println("4. Nombre del producto en mayúsculas: " + nombreMayusculas);

        String precioString = producto.substring(producto.lastIndexOf(";") + 2, producto.lastIndexOf(";") + 9);
        double precio = Double.parseDouble(precioString);
        System.out.println("5. Precio del producto: " + precio);

        char caracterPosicion10 = nombreProducto.charAt(9);
        System.out.println("6. Carácter en la posición 10 del nombre: " + caracterPosicion10);

        int primeraOcurrenciaA = nombreProducto.indexOf('a');
        System.out.println("7. Primera ocurrencia de la letra 'a': " + primeraOcurrenciaA);

        int ultimaOcurrenciaO = nombreProducto.lastIndexOf('o');
        System.out.println("8. Última ocurrencia de la letra 'o': " + ultimaOcurrenciaO);

        String categoria = producto.substring(producto.lastIndexOf(";") + 10);
        String precioYCategoria = precio + " " + categoria;
        System.out.println("9. Precio y categoría concatenados: " + precioYCategoria);

        String subcadenaNombre = nombreProducto.substring(6);
        System.out.println("10. Subcadena desde la posición 7: " + subcadenaNombre);
    }
}
