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

        System.out.println("-".repeat(60)+"\n");


        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(30);
        trabajador1.setNombre("Felipe");
        trabajador1.setTelefono("5555555");
        trabajador1.setSalario(456789);

        System.out.println("Trabajador 1:");
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Nombre: " + trabajador1.getNombre());
        System.out.println("Telefono: " + trabajador1.getTelefono());
        System.out.println("Salario: " + trabajador1.getSalario());


    }
}