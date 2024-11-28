import java.util.Scanner;
public class promedio_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido.");
        System.out.println(" ");
        System.out.println("¿De cuántos estudiantes va a registar calificación?");
        int estudiantes = input.nextInt();

        double suma = 0;
        double califs[] = new double[estudiantes];

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Ingrese las calificaciones del estudiante " + (i+1) );     
            califs[i] = input.nextDouble();
            suma += califs[i];
        }
        //prom 
        double promedd = (double) ((suma) / estudiantes);
        System.out.println("Promedio: " + promedd);
        System.out.println(" ");
        int esudiante_arriba = 0, estudiante_abajo = 0;
        //System.out.println("test " + califs[0]);
        for (int i = 0; i < estudiantes; i++) {
            if (promedd <= califs[i]){
                esudiante_arriba++;
            }else{
                estudiante_abajo++;
            }
        }

        System.out.println("Estudiantes arriba del promedio: " + esudiante_arriba);
        System.out.println(" ");
        System.out.println("Estudiantes abajo del promedio: " + estudiante_abajo);

        input.close();
        //nada mas para que arriba no diga q no se cerró xd
    }
}