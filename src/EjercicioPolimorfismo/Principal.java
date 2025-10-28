package EjercicioPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Tigre tigre = new Tigre();
        Caballo caballo = new Caballo();
        Pinguino pinguino = new Pinguino();

        tigre.correr();
        caballo.correr();
        pinguino.correr();

    }

}
