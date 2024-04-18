
public class Turno {

    private int numTurno;
    private String nombreUsuario;

    public Turno(int numTurno, String nombreUsuario) {
        this.numTurno = numTurno;
        this.nombreUsuario = nombreUsuario;
    }


    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;

    }

    public  void mostrarTurno() {
        System.out.println("Usuario " + nombreUsuario + ", su turno es el número " + numTurno);
    }





}


