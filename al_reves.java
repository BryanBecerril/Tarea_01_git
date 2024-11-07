import java.util.Scanner;
public class al_reves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Primera palabra es:");
        String palabra = "Elon Musk";
        System.out.println(" ");
        System.out.println("Ingresa tu palabra");
        String palabra_2 = input.nextLine();


        StringBuilder palabraInvertida = new StringBuilder(palabra);
        palabraInvertida.reverse();
        palabraInvertida.toString();
        System.out.println(palabraInvertida);

        StringBuilder palabra_inversa = new StringBuilder(palabra_2);
        palabra_inversa.reverse();
        palabra_inversa.toString();
        System.out.println(palabra_inversa);
    }
}


