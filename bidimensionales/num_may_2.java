import java.util.Random;
import java.util.Scanner;
public class num_may_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        //Escribe un programa que encuentre el elemento más grande en una 
        //matriz n×m y muestre su valorjunto con sus coordenadas (índices de fila y columna).

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
        System.out.println("Arreglo generado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        int ult_num = matriz[0][0], posi_fil = 0, posi_col = 0;
        System.out.print("Nmero mas grande en el arreglo: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (ult_num < matriz[i][j]){
                    ult_num = matriz[i][j];
                    posi_fil = i;
                    posi_col = j;
                }
            }
        }
        System.out.print(ult_num);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Posicion");
        System.out.println("fila    - " + (posi_fil + 1));
        System.out.println("columna - " + (posi_col + 1));
    }
}
