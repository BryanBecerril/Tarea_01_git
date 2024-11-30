import java.util.Random;
import java.util.Scanner;

public class diagonales {
    public static void main(String[] args) {
        //Dada una matriz cuadrada n×n, calcula y muestra la suma 
        //de los elementos de la diagonal principal y de la secundaria.
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int mayor = 100, menor = 1;
        System.out.println("Matríz de cuanto?");
        int ene = input.nextInt();
  

        int matriz[][] = new int[ene][ene];
        for (int i = 0; i < ene; i++) {
            for (int j = 0; j < ene; j++) {
                matriz[i][j] = random.nextInt((mayor - menor) + 1) + menor;
            }
        }
        System.out.println("Matriz ");
        for (int i = 0; i < ene; i++) {
            for (int j = 0; j < ene; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int suma = 0, anti_suma = 0;

        for (int i = 0; i < ene; i++) {
            for (int j = 0; j < ene; j++) {
                if (i == j){
                    suma += matriz[i][j];
                }
            }
        }
        for (int i = 0; i < ene; i++) {
            int j = (ene - 1) - i; 
            anti_suma += matriz[i][j];
        }
        System.out.println("Suma de la diagonal principal: " + suma);
        System.out.println("Suma de la diagonal secundaria: " + anti_suma);
    }
}
