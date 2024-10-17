import java.util.Scanner;
public class tarea_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        int num_1 = input.nextInt();

        if (num_1 % 3 == 0 && num_1 % 5 == 0 ) {
            System.out.println("Su número es divisible entre 3 y 5");
        } else if (num_1 % 3 == 0) {
            System.out.println("Su número es divisible entre 3");
        } else if (num_1 % 5 == 0) {
            System.out.println("Su número es divisible entre 5");
        } else {
            System.out.println("Su número no es divisible entre 3 ni 5");
        }

        //SUPER EASY SON (SKULL EMOJI)

        System.out.println("Ingrese lado 1: ");
        int lado_1 = input.nextInt();

        System.out.println("Ingrese lado 2: ");
        int lado_2 = input.nextInt();

        System.out.println("Ingrese lado 3: ");
        int lado_3 = input.nextInt();

        if (lado_1 == lado_2 && lado_2 == lado_3){
            System.out.println("El triángulo es equilátero");
        } else if (lado_1 == lado_2 || lado_2 == lado_3 || lado_3 == lado_1){
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

        //NOT EVEN DROPED A SWEAT YO

        System.out.println("Ingrese su salario");
        double salario = input.nextDouble();
        double cuenta = 0.0;
    
        if (salario <= 10000.0) {
            System.out.println("No paga impuesto");
        } else if (salario <= 20000.0) {
            System.out.println("Paga 10% de impuestos");
            cuenta = (salario * 0.10);
        } else {
            System.out.println("Paga 20% de impuestos");
            cuenta = (salario * 0.20);
        }
        double salario_neto = (salario - cuenta);
        System.out.println("Su impuesto es de: " + cuenta);
        System.out.println("Lo cual, su salario total es de: " + salario_neto);

        //YOU GOT IRON LUNGS!!!!!!!!1!!1!

        System.out.println("Ingrese un número: ");
        int indeter = input.nextInt();

        if (indeter % 2 == 0){
            System.out.println("Su número es par.");
        } else {
            System.out.println("Su número es impar.");
        }

        input.close();
        
        //YOU OWE ME TEN GRAND KID 
    }
}