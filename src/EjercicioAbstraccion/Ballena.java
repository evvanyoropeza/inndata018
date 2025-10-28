package EjercicioAbstraccion;

public class Ballena extends Animal{
    public Ballena(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return "Come Peces";
    }

    @Override
    public String respirar() {
        return "Respira por la espalda";
    }
}
