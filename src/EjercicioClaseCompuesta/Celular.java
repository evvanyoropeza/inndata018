package EjercicioClaseCompuesta;

public class Celular extends Dispositivo{
    private String compania;
    private String capacidad;
    private Pantalla pantalla;
    private Procesador procesador;

    public Celular(String capacidad, String compania, Pantalla pantalla, Procesador procesador) {
        this.capacidad = capacidad;
        this.compania = compania;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
