import java.util.Scanner;
public class ej_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suma = 0;
        System.out.println("¿Cuantos numeros deseas ingresar?");
        int cant_num = input.nextInt();
        System.out.println(" ");


        int numeros[] = new int[cant_num];
        if (cant_num <= 0){
            System.out.println("Cantidad invalida. Intente de nuevo.");
        } else{
            for (int i = 0; i < cant_num; i++) {
                System.out.println("ingrese el numero " + (i + 1) + " :");
                numeros[i] = input.nextInt();
                suma += numeros[i];
            }
            double promedio = (double) (suma / cant_num);
            if (promedio > 7){
                System.out.println("Promedio de : " + promedio + " Aprovado.");
            } else{
                System.out.println("Promedio de : " + promedio + " Reprovado.");

            }
        }
        //IRON LUNGGGGSSSS

    }
}