package EjercicioHerencia;

public class Trabajador extends Persona{
    String area;
    int sueldo;

    public Trabajador(String area, int sueldo) {
        this.area = area;
        this.sueldo = sueldo;
    }

    public Trabajador(int edad, String nombre, String area, int sueldo) {
        super(edad, nombre);
        this.area = area;
        this.sueldo = sueldo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public void supervisar(){
        System.out.println("Reviso que la produccion este operando de forma correcta");
    }
}
