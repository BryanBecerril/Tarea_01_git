public class acronimo {
    public static void main(String[] args) {
        
        String frase  = "Furry ahh Love";
        String acronimo = " ";

        boolean es_inicio = true;

        for (int inicio = 0; inicio < frase.length(); inicio++) {
            if (es_inicio && frase.charAt(inicio) != ' '){
                acronimo += frase.charAt(inicio);
                es_inicio = false;
            } else if (frase.charAt(inicio) == ' ') {
                es_inicio = true;
            }
        }
        acronimo = acronimo.toUpperCase();
        System.out.println("El acronimo es: " + acronimo);



    }
}
