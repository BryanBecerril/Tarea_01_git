import java.util.Scanner;
public class ej_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        //al usuario un número y un rango, y luego imprima la tabla de multiplicar de ese número desde 1
        System.out.println("¿Qué numero deseas multiplicar?");
        int num = input.nextInt();
        System.out.println(" ");
        System.out.println("¿Hasta cual numero deseas multiplicar?");
        int limite = input.nextInt();
        System.out.println(" ");

        System.out.println("Su tabla personalizada queda así: ");
        System.out.println(" ");

        for (int i = 1; i <= limite; i++) {
            int multiplicar = (num * i);
            System.out.println(num + " x  " + i + " = " + multiplicar);
        }


        //pus ahí quedó prof. mmmm
        //https://youtu.be/MzxYyYh55Vw?si=GmsQWDpeaFCqWH9Z&t=1442
        //para que sufra lo que yo sufrí.
    }
}
