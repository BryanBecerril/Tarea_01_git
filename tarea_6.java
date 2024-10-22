import java.util.Scanner;
public class tarea_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Lets do this.

        System.out.println("Ingresa tu nombre completo.");
        String nombre = input.nextLine();
        System.out.println("Ingresa tu ID.");
        String ide = input.nextLine();
        input.nextLine();
        System.out.println("Ingresa tu promedio general.");
        double promedio = input.nextDouble();
        input.nextLine();
        System.out.println("¿Cuántas materias deseas inscribir?");
        int materias = input.nextInt();
        System.out.println("Ingresa la cantidad de materias aprobadas el semestre anterior.");
        int mat_aprob = input.nextInt();


        if (promedio < 7.0) {
            System.out.println("Su promedio es de " + promedio + " Usted no puede inscribir ninguna materia.");
        } else if (promedio >= 7.0 && promedio < 8.5){
            if (materias < 3){
                System.out.println("Inscripción aceptada.");
            } else {
                System.out.println("Inscripción denegada por sobrecarga académica");
            }
        } else {
            if (nombre.length() > 25){
                System.out.println("Por favor, corrija su nombre");
            } else if (ide.length() < 8) {
                System.out.println("Su ID tiene un formato incorrecto. Inscripción denegada.");
            } else if (materias <= 5){
                System.out.println("Inscripciones aprobadas.");
            } else {
                if (mat_aprob > 3){
                    System.out.println("Usted puede ingresar hasta 6 materias.");
                } else {
                    System.out.println("Ingrese hasta 5 materias solamente.");
                }
            }
        }
               
        //el ticket master
        System.out.println("Ingrese su tipo de membresía.");
        String membre = input.nextLine();
        input.nextLine();
        System.out.println("Ingrese su edad.");
        int edad = input.nextInt();
        input.nextLine();
        System.out.println("Desea comprar boletos para un evento Nacional ó Internacional");
        String boleto = input.nextLine();


        if (membre.equalsIgnoreCase("Premium")){
            if (edad < 18){
             System.out.println("Usted es menor de edad. Compra denegada.");
            } else if (edad >= 18 && edad < 25) {
                if (boleto.equalsIgnoreCase("Nacional")){
                    System.out.println("Tiene un descuento del 10% para eventos nacionales");

                } else {
                    System.out.println("Tiene un descuento del 20% en eventos internacionales");
                }
            } else {
                if (boleto.equalsIgnoreCase("internacional")){
                    System.out.println("Usted tiene descuento del 25% en eventos internacionales");
                } else {
                    System.out.println("Usted tiene descuento del 15% en eventos nacionales");
                }
            }
        } else if (membre.equalsIgnoreCase("Estándar")){
            if (edad < 18){
                System.out.println("Usted es menor de edad. Compra denegada.");
            } else {
                if (boleto.equalsIgnoreCase("nacional")){
                    System.out.println("Tiene descuento del 5% para eventos nacionales");
                } else {
                    System.out.println("No tiene descuentos aplicables.");
                }
            }
        } else {
            System.out.println("No tiene descuentos aplicables. no puede comprar boletos para eventos internacionales.");
        }

        //Seguro del IMSS


        double descuento = 0.0;
        input.nextLine();
        System.out.println("Ingrese su nombre completo.");
        String usuario = input.nextLine();
        input.nextLine();
        System.out.println("Ingrese su edad.");
        int edad_imss = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese su país de residencia.");
        String residencia = input.nextLine();
        System.out.println("Ingrese su estado civil.");
        String civil = input.nextLine();
        input.nextLine();
        System.out.println("Ingrese sus ingresos anuales.");
        double ingresos = input.nextDouble();
        input.nextLine();
        System.out.println("¿Usted tiene hijos?");
        boolean hijos = input.nextBoolean();

        if (usuario.matches(".*\\d.*")) {
            System.out.println("Error. Su nombre contiene números.");
        } else if (edad_imss < 25) {
            System.out.println("Usted no es elegible para beneficios.");
        } else {
            if (residencia.equalsIgnoreCase("México") && civil.equalsIgnoreCase("Casado")){
                if (ingresos < 300000.00 && hijos){
                    System.out.println("Usted tiene un descuento del 10%");
                    descuento = 10.0;
                } else {
                    System.out.println("Usted tiene un descuento del 5%");
                    descuento = 5.0;
                }
            } else if (residencia.equalsIgnoreCase("México") && civil.equalsIgnoreCase("Soltero")){
                if (ingresos < 400000.00){
                    System.out.println("Tiene decuento del 8%");
                    descuento = 8.0;
                } else {
                    System.out.println("No aplican descuentos.");
                }
            } else if (residencia.equalsIgnoreCase("USA")){
                if (ingresos < 500000.00 && civil.equalsIgnoreCase("Casado")) {
                    System.out.println("Aplica un 12% de descuento.");
                    descuento = 12.0;
                } else if (civil.equalsIgnoreCase("soltero") && ingresos < 200000.00){
                    System.out.println("Usted tiene un 7% de descuento.");
                    descuento = 7.0;
                }
                if (hijos){
                    System.out.println("Se suma 3% de descuento");
                    descuento += 3.0;
                } else {
                    System.out.println(" ");
                }
            } else {
                if (civil.equalsIgnoreCase("casado")){
                    System.out.println("Aplica un descuento del 5%");
                    descuento = 5.0;
                } else {
                    System.out.println("Aplica un descuento del 3%");
                    descuento = 3.0;
                }
            }
        }

        System.out.println(usuario);
        System.out.println("Descuento aplicado: " + descuento + "%");
        double impuesto_neto = (ingresos * (1 - (descuento / 100)));
        System.out.println("Monto final a pagar: " + impuesto_neto);


        input.close();
    }
}