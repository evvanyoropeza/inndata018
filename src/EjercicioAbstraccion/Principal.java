package EjercicioAbstraccion;

public class Principal {
    public static void main(String[] args) {
        Elefante elefante = new Elefante("Elefante");
        Ballena ballena = new Ballena("Ballena");
        System.out.println(elefante.getNombre());
        System.out.println(elefante.comer());
        System.out.println(ballena.getNombre());
        System.out.println(elefante.respirar());
        System.out.println(ballena.comer());
        System.out.println(ballena.respirar());
    }
}
