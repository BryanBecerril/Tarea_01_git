public class reversa_4 {
    public static void main(String[] args) {
        // Crea un arreglo unidimensional con 10 números enteros. Escribe un programa que imprima 
        // el arreglo en orden inverso, sin modificar el arreglo original.
        int[] arreglo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("Arreglo sin modificar: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Arreglo al revés: ");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
