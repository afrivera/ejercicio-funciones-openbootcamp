public class Main {
    public static void main(String[] args) {

        String [] nombres = { "Andres", "Felipe", "Rivera"};

        String concatNombres = "";

        for (int i = 0; i < nombres.length; i++) {
            concatNombres+= nombres[i];

        }
        System.out.println(concatNombres);
    }
    
}