public class Cola {

    private Nodo inicioCola;
    private Nodo finalCola;

    String Cola;

    public Cola() {
        this.inicioCola = null;
        this.finalCola = null;
    }

    public boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        }
        return false;
    }

    public void insertar(Turno dato) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.turno = dato;
        nuevo_nodo.siguiente = null;

        if (colaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }

    public Turno extraer() {
        if (!colaVacia()) {
            Turno numTurno = inicioCola.turno;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return numTurno;
        } else {
            return null;
        }
    }

    public void imprimir() {
        Nodo actual =  inicioCola;
        System.out.print("Cola: ");
        while (actual != null) {
            System.out.print(actual.getTurno().getNumTurno() + "(" + actual.getTurno().getNombreUsuario() + ") ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    }


