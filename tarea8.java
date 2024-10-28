public class tarea8 {
    public static void main(String[] args) {
        
        //del 1 al 10
        int numero = 1; 
        while (numero <= 10) { 
            System.out.println(numero); 
            numero++; 
        }

        System.out.println(" ");
        System.out.println(" ");

        //suma numeros naturales
        int numero_a = 1;
        int suma = 0;
        while (numero_a <= 10) {
            suma += numero_a;
            numero_a++;
        }
        System.out.println("La suma de los primeros 10 números naturales es: " + suma);

        System.out.println(" ");
        System.out.println(" ");

        //contar dígitos de un número
        int vari = 12345;
        int contador = 0;
        while (vari != 0) {
            vari /= 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
        
        System.out.println(" ");
        System.out.println(" ");

        //entre uno y 10
        int par = 2;
        while (par <= 20) {
            System.out.println(par);
            par += 2;
        }

        System.out.println(" ");
        System.out.println(" ");

        //suma dígitos 
        int digito = 1234;
        int suma_dig = 0;
        while (digito != 0) {
            suma_dig += digito % 10;
            digito /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma_dig);

        System.out.println(" ");
        System.out.println(" ");

        //múltiplos
        int n_base = 3;
        int limite = 20;
        int multiplo = n_base;
        while (multiplo <= limite) {
            System.out.println(multiplo);
            multiplo += n_base;
        }

        System.out.println(" ");
        System.out.println(" ");

        //suma pares
        int nume = 987654;
        int suma_par = 0;
        while (nume != 0) {
            int ineter = nume % 10;
            if (ineter % 2 == 0) {
                suma_par += ineter;
            }
            nume /= 10;
        }
        System.out.println("La suma de los dígitos pares es: " + suma_par);

        System.out.println(" ");
        System.out.println(" ");

        // inverso
        int numerito = 10;
        while (numerito >= 1) {
            System.out.println(numerito);
            numerito--;
        }

        System.out.println(" ");
        System.out.println(" ");

        //suma impares
        int numero_01 = 1234567;
        int sumaImpares = 0;
        while (numero_01 != 0) {
            int digititit = numero_01 % 10;
            if (digititit % 2 != 0) {
                sumaImpares += digititit;
            }
            numero_01 /= 10;
        }
        System.out.println("La suma de los dígitos impares es: " + sumaImpares);

        System.out.println(" ");
        System.out.println(" ");

        //vocales
        String cadena = "pablito traga un clavito";
        int contador_vocales = 0;
        int posicion = 0;
        while (posicion < cadena.length()) {
            char letra = Character.toLowerCase(cadena.charAt(posicion));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador_vocales++;
            }
            posicion++;
        }
        System.out.println("La cadena tiene " + contador_vocales + " vocales.");
    }
}
