package EjercicioClaseCompuesta;

public class Procesador {
    String provedor;
    String nombre;

    public Procesador(String nombre, String provedor) {
        this.nombre = nombre;
        this.provedor = provedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
}
