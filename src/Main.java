public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(15);
        persona1.setNombre("Andres");
        persona1.setTelefono("323323323");

        Persona persona2 = new Persona();
        persona2.setEdad(20);
        persona2.setNombre("Paola");
        persona2.setTelefono("323232323");

        // imprimir persona 1
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());

        System.out.println("-".repeat(40));
        // imprimer Persona 2
        System.out.println(persona2.getEdad());
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getTelefono());

    }
}