
import java.util.Scanner;
public class tarea_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Ingrese su nacionaidad / Recidencia.");
         String nacionalidad = input.nextLine();
         System.out.println("Ingrese su tipo de visa.");
         String visa = input.nextLine();
         System.out.println("¿Cuántos años tiene de experiencia en el puesto?");
         int exp = input.nextInt();

         if (nacionalidad.equalsIgnoreCase("mexicano")) { 
            System.out.println("Usted no requiere de visa. Usted es elegible para cualquier puesto.");
         }else if (visa.equalsIgnoreCase("trabajo")) {
             if (exp > 5){
                System.out.println("Usted es elgible para un empleo calificado.");
             } else {
                 System.out.println("Usted solo es elegible para empleos no calificados.");
             }
         } else {
            System.out.println("Su tipo de visa es inválida. Queda rechazado en nuestro programa.");
         }
         //LAST AND LUCID!!!!

          System.out.println("Ingrese su país de residencia.");
          String residencia = input.nextLine();
          input.nextLine();
          System.out.println("Ingrese su código postal.");
          String postal = input.nextLine();
          input.nextLine();
          System.out.println("¿Usted ha hecho compras previas?");
          System.out.println("Escriba ´true´ si es así, de lo contrario escriba ´false´ ");
          boolean compras = input.nextBoolean();

          if (residencia.equalsIgnoreCase("USA")){
            if (postal.startsWith("9")){
                if (compras){
                    System.out.println("Usted puede continuar con su pago usand PayPal.");
                } else {
                    System.out.println("Puede continuar. Por favor, verifique con su dirección.");
                }
            } else {
                System.out.println("Por favor, use su tarjeta de crédito.");
            }
          } else if (residencia.equalsIgnoreCase("Europa")){
              if (postal.length() == 5){
                if (compras) {
                    System.out.println("Puede proceder a través de una transferencia bancaria.");
                } else {
                    System.out.println("Por favor, verifique su cuenta bancaria.");
                }
            } else { 
                System.out.println("Lo sentimos, su compra queda rechazada");
            }
          } else {
            System.out.println("Por favor, verifique su identidad manualmente.");
          } 

          //OH 

           input.nextLine();
           System.out.println("¿Existe disponibilidad? true / false");
           boolean disponibilidad = input.nextBoolean();
           input.nextLine();
           System.out.println("Ingrese el tipo de habitación.");
           String habitacion = input.nextLine();
           System.out.println("Ingrese la cantidad de personas a registrar");
           int cantidad = input.nextInt();
           System.out.println("Ingrese la duración de la estadía (noches).");
           int duracion = input.nextInt();

           if (cantidad == 1){
             if (habitacion.equalsIgnoreCase("suite")) {
                 if (disponibilidad && duracion > 3){
                    System.out.println("El cliente cuenta con un descuento del 10%");
                 } else{
                    System.out.println("Lo sentimos, solo podemos ofrecerle una habitación estándar.");
                 }
             } else {
                System.out.println("Su hebitación asignada es...tal");
             }
           } else if (cantidad >= 2){
            if (habitacion.equalsIgnoreCase("suite") && disponibilidad){
                 if (duracion > 5){
                    System.out.println("Su habitación es.... y puede tener un paquete con desayuno incluido.");
                 } else {
                    System.out.println("Su habitación es....");
                 }
            } else {
                System.out.println("Su habitación doble estándar es...");
            }
           } else {
           System.out.println("Ingrese un número válido");
           }

           //The end.....

           input.close();
    }
}