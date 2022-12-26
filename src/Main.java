public class Main {
    public static void main(String[] args) {


        // primer Punto
        int numeroIf = 10;
        if(numeroIf == 0){
            System.out.println("numeroIf = 0");
        } else if(numeroIf<0){
            System.out.println("numeroIf menor que 0");
        } else {
            System.out.println("numeroIf mayor que 0");
        }

        System.out.println();

        // segundo punto
        int numeroWhile = 0;
        while (numeroWhile< 3){
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }

        System.out.println();
        // tercer punto doWhile
        do{
            System.out.println("numeroWhile en doWhile = " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);

        System.out.println();

        // cuarto punto bucle for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor = " + numeroFor);
        }
        System.out.println();

        // Quinto punto Switchcase
        String estacion = "OTOÑO";
        switch (estacion){
            case "VERANO":
            case "OTOÑO":
            case "INVIERNO":
            case "PRIMAVERA":
                System.out.println("estacion = " + estacion);
                break;
            default:
                System.out.println("No es una estación");

        }
    }
}