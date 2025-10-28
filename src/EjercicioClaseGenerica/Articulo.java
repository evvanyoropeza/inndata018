package EjercicioClaseGenerica;

public class Articulo {
    private int id;
    private String nombre;
    private int codigoBarras;
    private double precio;
    private boolean existencia;

    public Articulo(int codigoBarras, boolean existencia, int id, String nombre, double precio) {
        this.codigoBarras = codigoBarras;
        this.existencia = existencia;
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
