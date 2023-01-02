public class Main {
    public static  final double IVA = 1.19d;
    public static void main(String[] args) {

        double getIva = getIva(19.99);
        System.out.println("Precio con Iva = " + getIva);

    }

    public static double getIva(double precio){
        return precio* IVA;
    }
}