import java.util.Scanner;
public class ej_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Crea un método llamado calcularMedia que reciba un arreglo de números 
        enteros y devuelva la media (promedio) de esos números. En el método main, crea un 
        arreglo de enteros, llama al método calcularMedia y muestra el resultado.
        */
        System.out.println("Cuantos numeros");
        int veces = in.nextInt();
        double[] arreglo = new double[veces];
        double suma = 0;
        double prom = 0;

        for (int i = 0; i < veces; i++) {
            System.out.println("Ingresa el numero");
            double numero = in.nextDouble();
            arreglo[i] = numero;
        }
        System.out.println("El promedio es: " + sacar_media(arreglo, prom, suma));
    }
    private static double sacar_media(double[] arreglo, double prom, double suma){
            for (int i = 0; i < arreglo.length; i++) {
                suma += arreglo[i];
            }
            prom = suma / arreglo.length;
        return prom;
    }
}
