import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        {

            //A
            System.out.println("Registrar el punto A");

            System.out.print("Registrar X: ");
            double x1 = sc.nextInt();
            System.out.print("Registrar Y: ");
            int y1 = sc.nextInt();

            //B
            System.out.println("Registrar el punto B");

            System.out.print("Registrar X2: ");
            int x2 = sc.nextInt();
            System.out.print("Registrar Y2: ");
            int y2 = sc.nextInt();

            //Distancia A y B
            double distance_AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("La distancia entre el punto A y B es de: " + distance_AB);

            //Ángulo
            double angulo_rad = Math.atan2(y2 - y1, x2 - x1);
            System.out.println("Angulo entre estos dos puntos en radianes es: " + angulo_rad);

            //angulo en grados
            double angulo_grad = Math.toDegrees(angulo_rad);
            System.out.println("Angulo en grados es: " + angulo_grad);

            double confir = (angulo_rad * (180 / Math.PI));
            System.out.println("Confirmación: " + confir);


        }
    }
}