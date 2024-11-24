import java.util.Scanner;
public class ej_4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el número");
        int numero = input.nextInt();
        System.out.println(" ");
        
        if (numero <= 0){
            System.out.println("Numero inválido. Intente de nuevo.");
        } else{
            boolean es_primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    es_primo = false;
                    break;
                }
            }
            if (es_primo) {
                System.out.println("El número " + numero + " es primo");
            } else {
                System.out.println("El número " + numero + " no es primo");
            }
        }
    
    }
}