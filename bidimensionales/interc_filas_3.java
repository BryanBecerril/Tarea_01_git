import java.util.Random;
import java.util.Scanner;
public class interc_filas_3 {
     public static void main(String[] args) {
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
        System.out.println(" ");

        System.out.println("fila que deseas mover... (ej. si quiere 1, escriba 0. Reste 1)");
        int fila_s = input.nextInt();
        System.out.println("¿A que lugar la va a cambiar? (otra fila) (ej. si quiere 1, escriba 0. Reste 1)");
        int fila_m = input.nextInt();

        int[] temp = matriz[fila_s];
        matriz[fila_s] = matriz[fila_m];
        matriz[fila_m] = temp;

        System.out.println("Arreglo modificado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        //(I GOT IRON LUNGS)
    }
}
