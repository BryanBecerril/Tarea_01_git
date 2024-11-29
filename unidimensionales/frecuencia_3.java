import java.util.Arrays;
import java.util.Scanner;
public class frecuencia_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //dado arreglo enteros, calcula frecuencia en que aparecen
        int[] arreglo_1 = {
            2,2,2,2,2,1,1,1,1,1,2,6,343,4542,24,121,45,3,10,
            69
        };

        Arrays.sort(arreglo_1);
        int contador = 1;
        for (int i = 0; i < arreglo_1.length - 1; i++) {
            if (arreglo_1[i] == arreglo_1[i + 1]) {
                contador++;
            } else {
                System.out.println("Número: " + arreglo_1[i] + " aparece " + contador + " veces.");
                contador = 1;
            }
        }
        System.out.println("Número: " + arreglo_1[arreglo_1.length - 1] + " aparece " + contador + " veces.");
    }
}
