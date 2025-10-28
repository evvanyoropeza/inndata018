package EjercicioHerencia;

public class Gerente extends Trabajador{
    String zona;

    public Gerente(String area, int sueldo, String zona) {
        super(area, sueldo);
        this.zona = zona;
    }

    public Gerente(int edad, String nombre, String area, int sueldo, String zona) {
        super(edad, nombre, area, sueldo);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
