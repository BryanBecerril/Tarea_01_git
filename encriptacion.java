public class Main {
    public static void main(String[] args) {

        String datos = "Juan Perez|1985-07-21|12345";

        int espacio = datos.indexOf(" ");//4
        int palito = datos.indexOf("|");//10
        //último del palito
        int ult_palito = datos.lastIndexOf("|");//21

        String nombre = datos.substring(0, espacio);
        String apellido = datos.substring(espacio + 1, palito);

        String primer_letra_nombre = String.valueOf(nombre.charAt(0)).toLowerCase();
        String primer_letra_apellido = String.valueOf(apellido.charAt(0)).toLowerCase();

        String resto_nombre = nombre.substring(1).toUpperCase();
        String resto_apellido = apellido.substring(1).toUpperCase();

        String nuevo_nombre = primer_letra_apellido + resto_nombre;
        String nuevo_apellido = primer_letra_nombre + resto_apellido;

        String nombre_completo_base = nuevo_nombre + " " + nuevo_apellido;
        System.out.println(nombre_completo_base);

        //System.out.println(nombre_completo_base);
        //???????IDK MANNNN

                //tarea nombre vocales
        String nombre_modificado = nombre_completo_base
                .replace("a", "e")
                .replace("i", "o")
                .replace("o", "u")
                .replace("e", "i")
                .replace("u", "e")
                .replace("A", "E")
                .replace("I", "O")
                .replace("O", "U")
                .replace("E", "I")
                .replace("U", "E");

        System.out.println("Nombre modificado: " + nombre_modificado);



        //segunda parte - fecha de nacimiento.

        String fecha = datos.substring(palito + 1, ult_palito);

        String ano = fecha.substring(0, 4);
        String mes = fecha.substring(5, 7);
        String dia = fecha.substring(8);

        int uno_digito = ano.charAt(0) - '0';
        int dos_dig = ano.charAt(1) - '0';
        int tres_dig = ano.charAt(2) - '0';
        int cuatro_dig = ano.charAt(3) - '0';

        int suma_ano = (uno_digito + dos_dig + tres_dig + cuatro_dig);
        int mes_por_tres = (Integer.valueOf(mes) * 3);
        int dia_menos = (Integer.valueOf(dia) - 5);

        String fehca_encriptado = suma_ano + "-" + mes_por_tres + "-" + dia_menos;
        System.out.println(fehca_encriptado);

        // ID
        String ID = datos.substring(ult_palito + 1);
        int id_numero = Integer.valueOf(ID);

        int id_potenciado = (int) Math.pow(id_numero, 2);
        int resultado_final = id_potenciado + 23;
        System.out.println(resultado_final);

        System.out.println(nombre_modificado + "|" + fehca_encriptado + "|" + resultado_final);
        
        /*
        RESULTADO DE PRINT - pEIN jIRIZ|23-21-16|152399048 
        
        todo chido 
         */
    }
}