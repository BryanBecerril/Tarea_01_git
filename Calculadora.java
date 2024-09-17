import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];
        int[] cantidades = new int[3];
        double[] precio_unitario = new double[3];
        double[] descuento = new double[3];
        double[] impuestos = new double[3];

        double total_acumulado = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la información para el producto " + (i + 1) + ":");

            System.out.print("Nombre del producto: ");
            nombres[i] = scanner.nextLine();

            System.out.print("Cantidad: ");
            cantidades[i] = scanner.nextInt();

            System.out.print("Precio unitario: ");
            precio_unitario[i] = scanner.nextDouble();

            System.out.print("Porcentaje de descuento: ");
            descuento[i] = scanner.nextDouble();

            System.out.print("Porcentaje de impuestos: ");
            impuestos[i] = scanner.nextDouble();

            scanner.nextLine();
        }
        scanner.close();

        for (int i = 0; i < 3; i++) {

            double precio_sin_descuento = cantidades[i] * precio_unitario[i];
            double monto_descontado = precio_sin_descuento * (descuento[i] / 100.0);
            double precio_con_descuento = precio_sin_descuento - monto_descontado;
            double monto_impuestos = precio_con_descuento * (impuestos[i] / 100.0);
            double precio_total = precio_con_descuento + monto_impuestos;

            total_acumulado += precio_total;

            System.out.println("\nInformación del producto " + (i + 1) + ":");
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Cantidad: " + cantidades[i]);
            System.out.println("Precio total sin descuento: " + precio_sin_descuento);
            System.out.println("Monto descontado: " + monto_descontado);
            System.out.println("Precio con descuento: " + precio_con_descuento);
            System.out.println("Impuestos aplicados: " + monto_impuestos);
            System.out.println("Precio total a pagar: " + precio_total);
        }

        System.out.println("\nTotal acumulado a pagar por los tres productos: " + total_acumulado);
    }
}