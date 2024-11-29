import java.util.Scanner;
public class palindromo_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe tu palabra o frase:");
        String palabra = input.nextLine();
        palabra = palabra.toLowerCase();

        String caracteres[] = new String[palabra.length()];
        int inicio = 0, fin = palabra.length() - 1;
        boolean palindromo = true;

        while (inicio < fin) {
            caracteres[inicio] = String.valueOf(palabra.charAt(inicio));
            caracteres[fin] = String.valueOf(palabra.charAt(fin));

            if (palabra.charAt(inicio) != palabra.charAt(fin)){
                palindromo = false;
                break;
            }     
            inicio++;
            fin--;
        }

        System.out.print("Caracteres almacenados: ");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i] + " ");
        }

        System.out.println(" ");
        
        if (palindromo){
            System.out.println("La palabra o frase es un palindromo.");
        } else{
            System.out.println("La frase o palabra no es palíndroma.");
        }
    }
}
