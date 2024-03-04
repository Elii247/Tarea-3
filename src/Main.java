import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean visitante,empleado,estudiante;
        byte edad;
        int altura, apartamento, peso, cantidad;
        long telefono;
        String nombre,apellido;
        char genero;

      //Se ingresa en teclado
        System.out.println("Bienvenido al Edificio SkyTower");

        System.out.println("\nEl visitante es un Empleado? (true/false): ");
        empleado= scanner.nextBoolean();

        System.out.println("\nEs estudiante? (true/false): ");
        estudiante = scanner.nextBoolean();

        System.out.println("\nEs un visitante nuevo? (true/false): ");
        visitante = scanner.nextBoolean();

        System.out.println("\nNombre: ");
        nombre = scanner.next();

        System.out.println("\nApellido: ");
        apellido = scanner.next();

        System.out.println("\nEdad: ");
        edad = scanner.nextByte();

        String esMayorEdad = (edad > 18) ?"Es Mayor de edad " : "Es Menor de edad";

        System.out.println("\nGenero (M/F): ");
        genero = scanner.next().charAt(0);

        System.out.println("\nPeso del visitante (En Kg): ");
        peso = scanner.nextShort();

        System.out.println("\nAltura del visitante (cm): ");
        altura = scanner.nextInt();

        System.out.println("\nNumero de telefono: ");
        telefono = scanner.nextLong();

        System.out.println("\nNumero de apartamento: ");
        apartamento = scanner.nextInt();

        System.out.println("\nCantidad de visitantes: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        int cantidadTotalVisita = 0;
        int cantidadTotalminutos = 0;

            for(int i = 0; i < 7; i++){
                System.out.println("\nDia " + (i+1));
                System.out.println("Ingrese la cantidad de visitas para el dia " + (i+1) + ": ");
                int cantidadVisitasDia = scanner.nextInt();

                    for(int j = 0; j < cantidadVisitasDia; j++){
                        System.out.println("\ntiempo de estadia del visitante " + (j+1) + "(en minutos): ");
                        int tiempoVisita = scanner.nextInt();
                        cantidadTotalminutos += tiempoVisita;
                        cantidadTotalVisita++;
                    }
            }

            double tiempoPromedioEstadia = (double) cantidadTotalminutos / cantidadTotalVisita;
            String tiempoFormateado = String.format("%04d", (int)tiempoPromedioEstadia);


       //Se imprime en pantalla
        System.out.println("El visitante es un Empleado: " + empleado);
        System.out.println("\nEl visitante es un Estudiante: " + estudiante);
        System.out.println("\nEs un visitante nuevo: " + visitante);
        System.out.println("\nNombre: " + nombre + " " + apellido);
        System.out.println("\nEdad: " + edad);
        System.out.println("\nGenero: " + genero);
        System.out.println("\nPeso del visitante: " + peso);
        System.out.println("\nAltura del visitante: " + altura);
        System.out.println("\nNumero de telefono: " + telefono);
        System.out.println("\nNumero de apartamento: " + apartamento);
        System.out.println("\nCantidad de visitantes: " + cantidad);
        System.out.println("\nCantidad de dias: " + cantidadTotalVisita);
        System.out.println("\nTiempo de visita: " + tiempoFormateado.substring(2) + " " + "minutos");

    }
}