import java.util.Random;
import java.util.Scanner;
public class traspuesta_5 {
    public static void main(String[] args) {
        //Crea un programa que calcule y muestre la matriz transpuesta 
        //de una matriz n × m. La transpuesta se obtiene intercambiando filas por columnas.
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int mayor = 100, menor = 1;
        System.out.println("¿Cuántas filas?");
        int filas = input.nextInt();
        System.out.println("¿Cuántas columnas?");
        int columnas = input.nextInt();

        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt((mayor - menor) + 1) + menor;
            }
        }
        System.out.println("Arreglo original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

    }
}
