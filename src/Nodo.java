/**
 * Nodo
 */
public class Nodo {

    Turno turno;
    Nodo siguiente;
    public Nodo(){}
    public Nodo(Turno turno, Nodo siguiente) {
        this.turno = turno;
        this.siguiente = siguiente;
    }
    public Turno getTurno() {
        return turno;
    }
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    

}