package ProgramacionOrientadaObjetos;

public class Animal {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Polvoron",3,"Blanco","Meztizo");
        Gato miGato = new Gato("Pelusa",1,"Negro","Bombay");

        System.out.print("Hola mi nombre es "+miPerro.getNombre()+" y mi sonido es ");
        miPerro.sonido();
        System.out.print("Hola mi nombre es "+miGato.getNombre()+" y mi sonido es ");
        miGato.sonido();
    }
}
