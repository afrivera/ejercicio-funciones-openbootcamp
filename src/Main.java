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


        // segundo punto
        int numeroWhile = 0;
        while (numeroWhile< 3){
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }
    }
}