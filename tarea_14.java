public class Main {
    public static void main(String[] args) {
        /*En la empresa de mi apá ocupan un cifrado para el
        registro de correos de usurario.

        Digamos un correo cualquiera; tendrá que funcionar
        independiente al correo registrado*/
        //Ocupan invertir el nombre del usuario antes de @
        String info = "Elon.Reeve.Musk@Tesla.com|2024-10-03|56069948.75";

        // Separar partes de la info
        String[] partes = info.split("\\|");
        String correo = partes[0];    // "Elon.Reeve.Musk@Tesla.com"
        String fecha = partes[1];      // "2024-10-03"
        String salario = partes[2];    // "56069948"

        // Separar correo x partes
        String[] partes_correo = correo.split("@");
        String nombre_usuario = partes_correo[0];
        String dominio = partes_correo[1];

        // Invertio
        StringBuilder reversar = new StringBuilder(nombre_usuario);
        reversar.reverse();
        String nombre_invertido = reversar.toString();
        String correo_fin = nombre_invertido + "@" + dominio;
        System.out.println("Correo: " + correo_fin);

        //Fecha de ascenso - separar para sumar el ano
        String ano = fecha.substring(0, 4);
        String mes = fecha.substring(5, 7);
        String dia = fecha.substring(8, 10);

        int ano_encrip = (Integer.valueOf(ano) + Integer.valueOf(mes) + Integer.valueOf(dia));
        String fecha_fin = ano_encrip + "-" + mes + "-" + dia;
        System.out.println("Fecha de ascenso: " + fecha_fin);

        //ora el salario
        //queremos tajar por el decimal
        String[] separa_salario = salario.split("\\.");
        String entero = separa_salario[0];
        String decimal = separa_salario[1];

        // Convertir las partes a enteros
        int parte_entera = Integer.valueOf(entero);
        int parte_decimal = Integer.valueOf(decimal);

        int diferencia = parte_entera - parte_decimal;
        int valor_absoluto = Math.abs(diferencia);
        int salario_fin = valor_absoluto * 2;
        System.out.println("Salario: " + salario_fin);

        String cifrado = correo_fin + "|" + fecha_fin + "|" + salario_fin;
        System.out.println("Cifrado completo: " + cifrado);
        
        

    }
}