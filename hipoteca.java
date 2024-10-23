import java.util.Scanner;
public class hipoteca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese su nombre.");
        String nombre = input.nextLine();
        if (nombre.matches(".*\\d.*")){
            System.out.println("Su nombre contiene números. Intente de nuevo.");
            return;}

            
        input.nextLine();

        System.out.println("Ingrese su puntaje crediticio. (Entre 300 y 850)");
        int puntaje = input.nextInt();
        if (puntaje < 300 || puntaje > 850) {
            System.out.println("Puntaje crediticio fuera de rango. Debe estar entre 300 y 850.");
        }

        input.nextLine();
        System.out.println("Ingrese sus ingresos mensuales.");
        double ingresos = input.nextDouble();
        System.out.println("Ingrese la cantidad solicitada para su crédito.");
        double hipoteca = input.nextDouble();
        input.nextLine();
        System.out.println("¿Cuál es la duración del préstamo en años?");
        int anos = input.nextInt();
        System.out.println("¿Cuál es su porcentaje de ahorro personal?");
        int ahorro = input.nextInt();


        double tasa_interes = 0.0;
        double relacion_ingreso = 0;


        if (puntaje < 600){
            System.out.println("Su solicitud fue rechazada.");
        }else if (puntaje <= 600 && puntaje <= 740){
            System.out.println("La taza de interés es del 6%");
            tasa_interes = 0.06;
            relacion_ingreso = 3.0;
        } else if (puntaje > 740) {
            System.out.println("Taza de interés es del 4%");
            tasa_interes = 0.04;
            relacion_ingreso = 2.5;
        }
        
        int total_pagos = anos * 12;
        double tasa_mensual = tasa_interes / 12;
        double cuota_mensual = (hipoteca * tasa_mensual) / (1 - Math.pow(1 + tasa_mensual, - total_pagos));

        if (ingresos / cuota_mensual < relacion_ingreso){
            System.out.println("Solicitud rechazada: sus ingresos no son suficientes en relación con la cuota mensual.");
        }
        System.out.println("Solicitud aprobada.");
        System.out.printf("Tasa de interés aplicada: %.2f%%\n", tasa_interes * 100);
        System.out.printf("Cuota mensual: %.2f\n", cuota_mensual);
        System.out.printf("Monto total a pagar en " + anos + "cuota mensual: " + cuota_mensual + "total pagos: " + total_pagos);

    }
}