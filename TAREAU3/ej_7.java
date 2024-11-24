import java.util.Scanner;
public class ej_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //palindromos
        System.out.println("Ingrese el número:");
        int numero = input.nextInt();
        System.out.println(" ");
        //1 2 1

        String posicion = String.valueOf(numero);
        int inicio = 0;
        int fin = posicion.length() - 1;

        boolean es_palindromo = true;
        while (inicio < fin) {
            if (posicion.charAt(inicio) != posicion.charAt(fin)) {
                es_palindromo = false;
                break;
            }
            inicio++;
            fin--;
        }

        if (es_palindromo){ 
            System.out.println("Es un número palíndromo");
        } else {
            System.out.println("No es un número palíndromo");
        }


    }
}
