import java.util.Scanner;
public class ej_10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingresa el primer numero:");
    int num_1 = input.nextInt();
    System.out.println(" ");
    System.out.println("Ingresa el segundo numero:");
    int num_2 = input.nextInt();
    System.out.println(" ");
    System.out.println("Ingresa el tercer numero");
    int num_3 = input.nextInt();
    System.out.println(" ");

    System.out.println("Posiciones de menor a mayor: ");
    System.out.println(" ");

    if (num_1 <= num_2 && num_2 <= num_3) {
        System.out.println(num_1 + ", " + num_2 + ", " + num_3);
    } else if (num_1 <= num_3 && num_3 <= num_2) {
        System.out.println(num_1 + ", " + num_3 + ", " + num_2);
    } else if (num_2 <= num_1 && num_1 <= num_3) {
        System.out.println(num_2 + ", " + num_1 + ", " + num_3);
    } else if (num_2 <= num_3 && num_3 <= num_1) {
        System.out.println(num_2 + ", " + num_3 + ", " + num_1);
    } else if (num_3 <= num_1 && num_1 <= num_2) {
        System.out.println(num_3 + ", " + num_1 + ", " + num_2);
    } else {
        System.out.println(num_3 + ", " + num_2 + ", " + num_1);
    }
    //me dolió hasta en el alma profe no me haga esto yo que lo quiero tanto :c
    }
}