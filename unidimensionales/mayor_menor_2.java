import java.util.Scanner;
public class mayor_menor_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int almacen[] = new int[15];

        System.out.println("Ingresa un número (Entero)");
        almacen[0] = input.nextInt(); 

        int mayor = almacen[0], menor = almacen[0];
        int index_mayor = 0, index_menor = 0;

        for (int i = 1; i < almacen.length; i++) {
            System.out.println("Ingresa un número (Entero)");
            almacen[i] = input.nextInt(); 

            if (almacen[i] > mayor) {
                mayor = almacen[i];
                index_mayor = i;
            }
            if (almacen[i] < menor) {
                menor = almacen[i];
                index_menor = i;
            }
        }

        System.out.println(" ");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("Su posición es: " + index_mayor);
        System.out.println( " ");
        System.out.println("El número menor es: " + menor);
        System.out.println("Su posición es: " + index_menor);

        input.close();
    }
}
