import java.util.Scanner;

public class mayor_menor_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int almacen[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el número " + (i+1) + " (Entero)");
            almacen[i] = input.nextInt();
            
        }

    }
}
