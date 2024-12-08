import java.util.Scanner;
public class ej_1 {
    public static void main (String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("Hola mundo");
        System.out.println("Cuantas conversiones?");
        int veces = in.nextInt();

        double[] guardado = new double[veces];
        double[] devol = new double[veces];


        for (int i = 0; i < veces; i++) {
            System.out.println("Ingresa el valor de celsius");
            double celcius = in.nextDouble();
            guardado[i] = celcius;
        }
        celsius_a_fahrenheit(guardado, veces, devol);
    }

    private static void celsius_a_fahrenheit (double[] guardado, int veces, double[] devol){
        for (int i = 0; i < veces; i++) {
            System.out.println("Resultado de " + guardado[i] + "° Celcius a fahrenheit");
            // Fahrenheit = Celsius * (9/5) + 32 pero con tu punto decimal pq luego no compila
            devol[i] = ((guardado[i] * (9.0 / 5.0)) + 32.0);
            System.out.println(devol[i] + "° Fahrenheit");
            System.out.println();
        }
    }

    
}