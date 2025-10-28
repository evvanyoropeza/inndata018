package EjercicioAbstraccion;

public class Elefante extends Animal{
    public Elefante(String nombre) {
        super (nombre);
    }

    @Override
    public String comer() {
        return "Come cacahuates";
    }

    @Override
    public String respirar() {
        return "Respira por la trompa";
    }
}
