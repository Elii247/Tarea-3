import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean visitante = false, empleado = false;
        byte edad = 90, cantidad = 10;
        int altura = 68, apartamento = 200, peso = 400;
        long telefono = 1823638932;
        String nombre = "10" ;
        char genero = '2';
      //Se ingresa en teclado
        System.out.println("El visitante es un Empleado (Si/No): ");
        scanner.nextBoolean();
        System.out.println("\nEs un visitante nuevo (Si/No): ");
        scanner.nextBoolean();
        System.out.println("\nNombre: ");
        scanner.next();
        System.out.println("\nEdad: ");
        scanner.nextByte();
        System.out.println("\nGenero: ");
        scanner.next().charAt(0);
        System.out.println("\nPeso del visitante (En Kg): ");
        scanner.nextShort();
        System.out.println("\nAltura del visitante (cm): ");
        scanner.nextInt();
        System.out.println("\nNumero de telefono: ");
        scanner.nextLong();
        System.out.println("\nNumero de apartamento: ");
        scanner.nextInt();
        System.out.println("\nCantidad de visitantes: ");
        scanner.nextInt();
       //Se imprime en pantalla
        System.out.println("El visitante es un Empleado: " + empleado);
        System.out.println("\nEs un visitante nuevo: " + visitante);
        System.out.println("\nNombre: " + nombre);
        System.out.println("\nEdad: " + edad);
        System.out.println("\nGenero: " + genero);
        System.out.println("\nPeso del visitante: " + visitante);
        System.out.println("\nNumero de telefono: " + telefono);
        System.out.println("\nNumero de apartamento: " + apartamento);
        System.out.println("\nCantidad de visitantes: " + cantidad);

    }
}