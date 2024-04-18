import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int numTurno = 0;

    public static void main(String[] args) {

        Cola cola = new Cola();

        System.out.println("BIENVENIDO AL SISTEMA DE TURNOS");
        System.out.println("Registre los usuarios para cola(ingrese 0 para terminar)");

        for (int i = 0; i < 5; i++) {
            System.out.println("Escriba su nombre para registrar su turno:");
            String nombre = scanner.nextLine();
            numTurno++;
            Turno turno = new Turno(numTurno, nombre);
            cola.insertar(turno);
            System.out.println("Su número de turno es: " + turno.getNumTurno());
        }

        System.out.println("Los turnos registrados son:");
        cola.imprimir();
        System.out.println("\n");
        System.out.println("Ahora se llamará a las personas en orden:");

        while (!cola.colaVacia()) {
            Turno turnoActual = cola.extraer();
            if (turnoActual != null) {
                System.out.println("Llamando a " + turnoActual.getNombreUsuario() + " con el turno numero "
                        + turnoActual.getNumTurno());
                System.out.println("----------------------------------------------------------------------");
            } else {
                System.out.println("La cola está vacía.");
            }

        }
        System.out.println("\n");
    }
}
