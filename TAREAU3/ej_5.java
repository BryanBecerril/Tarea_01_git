import java.util.Scanner;
public class ej_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número:");
        int numero = input.nextInt();
        System.out.println(" ");

        if (numero <= 0) {
            System.out.println("Número inválido. Intente de nuevo.");
        } else {
            boolean tiene_divisores = false;
            System.out.print("Los divisores de " + numero + " son: ");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + ", ");
                    if (i != 1 && i != numero) {
                        tiene_divisores = true;
                    }
                }
            }


            if (!tiene_divisores) {
                System.out.println("El número " + numero + " no tiene divisores aparte de 1 y él mismo.");
            }
        }
    }
}
