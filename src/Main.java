public class Main {
    public static void main(String[] args) {
    
        int resultado = sumarTresParametros(10, 20, 30);
        System.out.println("resultado = " + resultado);

        Coche coche = new Coche();
        coche.aumentarPuertas();
        coche.aumentarPuertas();
        coche.aumentarPuertas();
        coche.aumentarPuertas();
        System.out.println("cantidad de puertas = " + coche.puertas);

    }
    
    public static int sumarTresParametros(int a, int b, int c){
        return a + b + c;
    }
}