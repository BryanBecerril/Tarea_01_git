import java.util.Scanner;
public class ej_3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //easy pici lemon squisi h
        
        System.out.println("¿Cuantos numeros desea de la secuencia fibonacci?");
        int cant_num = input.nextInt();
        System.out.println(" ");

        if (cant_num <= 0){
            System.out.println("Cantidad invalida. Intente de nuevo.");
        } else{
            int a = 0;
            int b = 1;
            for (int i = 0; i < cant_num; i++) {
                System.out.print(a + ", ");
                int siguiente = (a + b);
                a = b;
                b = siguiente;
            }
        }
        


    }
}