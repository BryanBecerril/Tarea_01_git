import java.util.Scanner;
public class ej_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Crea un método llamado imprimirPositivos que reciba un arreglo de 
        números enteros y muestre por consola solo aquellos números que sean positivos (mayores 
        que cero). En el método main, crea un arreglo con varios números, llama al método 
        imprimirPositivos y muestra los números positivos*/
        System.out.println("Cuántos números");
        int veces = in.nextInt();

        int[] arreglo = new int[veces];

        for (int i = 0; i < veces; i++) {
            System.out.println("Ingresa el número:");
            arreglo[i] = in.nextInt();
        }

        System.out.println("Números positivos en la lista:");
        imprimir_positivos(arreglo);

    }

    private static void imprimir_positivos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) { 
                System.out.print(arreglo[i] + " ");
            }
        }
    }
}
