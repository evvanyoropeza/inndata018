package EjercicioClaseCompuesta;

public class Principal {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla("panel", "X5HW");
        Procesador procesador= new Procesador("M4", "Apple");
        Celular celular = new Celular("128MB","Telcel",pantalla,procesador);

        System.out.println("Mi Celular tiene una pantalla "+celular.getPantalla().getModelo()+" y tienen un procesador "+celular.getProcesador().getNombre());
    }
}
