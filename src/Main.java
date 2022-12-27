public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setEdad(15);
        cliente1.setNombre("Andres");
        cliente1.setTelefono("323323323");
        cliente1.setCredito(12345678);

        System.out.println("Cliente 1:");
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Telefono: " + cliente1.getTelefono());
        System.out.println("Credito: " + cliente1.getCredito());



    }
}