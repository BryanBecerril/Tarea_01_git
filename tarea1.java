public class Main {
    public static void main(String[] args) {
        //stating
        String nombre = "Carlos Martinez";
        String IP = "192.168.0.1";
        String numero = "12345";

        //Converitr vocales
        String nombre_mod = nombre
                .replace("a", "1")
                .replace("e", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("u", "5")
                .replace("A", "1")
                .replace("E", "2")
                .replace("I", "3")
                .replace("O", "4")
                .replace("U", "5");

        //Primero a ultimo
        StringBuilder Inter = new StringBuilder(nombre_mod);

        char char_uno = nombre_mod.charAt(0);
        char char_dos = nombre_mod.charAt(nombre_mod.length() - 1);
        Inter.setCharAt(0, char_dos);
        Inter.setCharAt(Inter.length() - 1, char_uno);
        String nombre_final = Inter.toString();
        System.out.println(nombre_final);

        //dirección IP

            String[] separacion = IP.split("\\.");

            // Convertir cada octeto a hexadecimal
            int uno_1 = Integer.valueOf(separacion[0]);
            int dos_1 = Integer.valueOf(separacion[1]);
            int tres_1 = Integer.valueOf(separacion[2]);
            int cuatro_1 = Integer.valueOf(separacion[3]);

            String IP_FINAL = Integer.toHexString(uno_1) + "." +
                    Integer.toHexString(dos_1) + "." +
                    Integer.toHexString(tres_1) + "." +
                    Integer.toHexString(cuatro_1);
            System.out.println(IP_FINAL);

            //cliente npumero
        double numero_mod = Integer.valueOf(numero);
        double numero_final = (((numero_mod * 3) + 15) / 2);
        System.out.println(numero_final);

        String completado = "Datos cirados: " + nombre_final + "|" + numero_final + "|" + IP_FINAL;
        System.out.println(completado);
    }
}