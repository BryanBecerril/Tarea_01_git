import java.util.Scanner;
public class ej_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantos numeros deseas ingresar?");
        int cant_num = input.nextInt();
        System.out.println(" ");
        int numeros[] = new int[cant_num];

        int pares = 0;
        int impares = 0;

        int num_par[] = new int[cant_num]; 
        int num_impar[] = new int[cant_num];

        int index_par = 0;
        int index_impar = 0;

        if (cant_num <= 0){
            System.out.println("Cantidad invalida. Intente de nuevo.");
        } else{ 
            for (int i = 0; i < cant_num; i++) {
                System.out.println("ingrese el numero " + (i + 1) + " :");
                numeros[i] = input.nextInt();
                if (numeros[i] % 2 == 0){
                    pares += 1;
                    num_par[index_par] = numeros[i];
                    index_par += 1;

                }else{
                    impares += 1;
                    num_impar[index_impar] = numeros[i];
                    index_impar += 1;
                }
            }

            //para que vea el esfuerzo de además agregar a un arreglo los numeros impares/pares e imprimirlos.
            //nomas para que sepa lo mucho que lo aprecio.
            //                                  <3
            System.out.println(" ");
            System.out.println("Cantidad de numeros pares: " + pares);
            System.out.println("Numeros pares fueron: ");
            for (int i = 0; i < index_par; i++) {
                System.out.print(num_par[i] + " , ");   
            }
            System.out.println(" ");
            System.out.println("Cantidad de numeros impares: " + impares);
            System.out.println("Numeros impares fueron: ");
            for (int i = 0; i < index_impar; i++) {
                System.out.print( num_impar[i] + " , ");                
            }



        }

    }
}
