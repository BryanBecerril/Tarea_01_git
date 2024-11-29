import java.util.Random;
import java.util.Scanner;

public class fil_col_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;

        // Pedir filas y columnas
        System.out.println("¿Cuántas filas?");
        int filas = input.nextInt();
        System.out.println("¿Cuántas columnas?");
        int columnas = input.nextInt();

        int bloque[][] = new int[filas][columnas];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                bloque[i][j] = random.nextInt((max - min) + 1) + min;
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(bloque[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Suma de las filas:");
        for (int i = 0; i < filas; i++) {
            int suma_fil = 0;
            for (int j = 0; j < columnas; j++) {
                suma_fil += bloque[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + suma_fil);
        }

        System.out.println("Suma de las columnas:");
        for (int j = 0; j < columnas; j++) {
            int suma_col = 0;
            for (int i = 0; i < filas; i++) {
                suma_col += bloque[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + suma_col);
        }

        input.close();
    }
}
