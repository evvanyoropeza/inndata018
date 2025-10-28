package EjercicioHerencia;

public class Jefe extends Gerente{
    String modulo;

    public Jefe(String area, int sueldo, String zona, String modulo) {
        super(area, sueldo, zona);
        this.modulo = modulo;
    }

    public Jefe(int edad, String nombre, String area, int sueldo, String zona, String modulo) {
        super(edad, nombre, area, sueldo, zona);
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
}
