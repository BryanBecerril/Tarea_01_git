import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int num_mayor = 100;
        int num_menor = 1;
        List<Integer> numeros = new ArrayList<>();
        int suma = 0;


        for (int i = 0; i < 10; i++) {
            Double numero_aleatorio = Math.random() * (num_mayor - num_menor + 1) + num_menor;
            int numero = numero_aleatorio.intValue();
            numeros.add(numero);
            suma += numero;
        }

        System.out.println("Números aleatorios generados: " + numeros);

        System.out.println("Raíces cuadradas de los números generados:");
        for (int numero : numeros) {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("Raíz cuadrada de " + numero + " es: " + raizCuadrada);
        }


        double promedio = suma / (double)numeros.size();
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);

        double sumaDesviacionesCuadradas = 0;
        for (int numero : numeros) {
            double desviacion = numero - promedio;
            sumaDesviacionesCuadradas += Math.pow(desviacion, 2);
        }

        double varianza = sumaDesviacionesCuadradas / numeros.size();
        double desviacionEstandar = Math.sqrt(varianza);

        System.out.println("La desviación estándar es: " + desviacionEstandar);
    }
}