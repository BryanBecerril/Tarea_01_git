import java.util.Scanner;
public class ej_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //adivina adivinador quien no me adivine le doy un coscorrón
        int azar = (int)(Math.random() * 100) + 1;
        //System.out.println("Pureba numero al azar del 1 al 100: " + azar);

        System.out.println("Adivina el numero! Está de entre 1 y 100, padre");
        int intento = input.nextInt();

        while (intento != azar) {
            if (intento < azar) {
                System.out.println("Te falta tantitito para llegar!!!!1!!");
            } else {
                System.out.println("Te pasaste!!!! Calale otra vez.");
            }
            intento = input.nextInt();
        }
        System.out.println("ADIVINASTE!!!!1!!!!11!");
    }
}


