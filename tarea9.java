import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //A
        System.out.println("Registrar el punto A");

        System.out.print("Registrar X: ");
        double x1 = sc.nextDouble();
        System.out.print("Registrar Y: ");
        int y1 = sc.nextInt();

        //B
        System.out.println("Registrar el punto B");

        System.out.print("Registrar X2: ");
        int x2 = sc.nextInt();
        System.out.print("Registrar Y2: ");
        int y2 = sc.nextInt();

        //C
        System.out.println("Registrar el punto C");

        System.out.print("Registrar X: ");
        int x3 = sc.nextInt();
        System.out.print("Registrar Y: ");
        int y3 = sc.nextInt();

        //LADO A
        double lado_a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre el punto A y B es de: " + lado_a);

        //LADO B
        double lado_b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        System.out.println("La distancia entre el punto B y C es de: " + lado_b);

        //LADO C
        double lado_c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        System.out.println("La distancia entre el punto A y C es de: " + lado_c);

        //suma lados
        double perimetro = (lado_a + lado_b + lado_c);

        //area (Fórmula de Herón)
        double s_2 = perimetro / 2;
        System.out.println("El semiperimetro es: " + s_2);

        double area_2 = Math.sqrt(s_2 * (s_2 - lado_a) * (s_2 - lado_b) * (s_2 - lado_c));
        System.out.println("El area es: " + area_2);

        //Altura
        double altura = (2 * area_2) / lado_b;
        System.out.println("El altura es: " + altura);

        //COSENO
        double coseno = (Math.pow(lado_b, 2) + Math.pow(lado_c, 2) - Math.pow(lado_a, 2)) / (2 * lado_b * lado_c);
        System.out.println("El coseno en radianes es: " + coseno);

        double coseno_grados = Math.toDegrees(Math.acos(coseno));
        System.out.println("El coseno en grados es: " + coseno_grados);

        //Triángulo equilátero
        double diferencia_A_B = Math.abs(lado_a - lado_b);
        double diferencia_B_C = Math.abs(lado_b - lado_c);
        double diferencia_C_A = Math.abs(lado_c - lado_a);

        double diferencia_total = (diferencia_A_B + diferencia_B_C + diferencia_C_A);
        System.out.println("La diferencia total entre los lados es: " + diferencia_total);

        // PUNTO MEDIO
        double p_medio_x = ((x1 + x2) / 2.0);
        double p_medio_y = ((y1 + y2) / 2.0);

        System.out.println("El punto medio entre A y B es: " + p_medio_x +" y " + p_medio_y);

    }
}