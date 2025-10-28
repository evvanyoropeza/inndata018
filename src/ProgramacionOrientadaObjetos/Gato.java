package ProgramacionOrientadaObjetos;

public class Gato {

        //Atributos
        private String nombre;
        private int edad;
        private String color;
        private String raza;
        //Getter y Setters
        public String getNombre() {
        return nombre;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        public String getColor() {
        return color;
    }

        public void setColor(String color) {
        this.color = color;
    }

        public int getEdad() {
        return edad;
    }

        public void setEdad(int edad) {
        this.edad = edad;
    }


        public String getRaza() {
        return raza;
    }

        public void setRaza(String raza) {
        this.raza = raza;
    }

        //Metodo Constructor con argumentos inicializa los atributos de la clase
    public Gato(String nombre, int edad, String color, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.raza = raza;
    }
        //Metodo contructor sin argumentos
    public Gato(){

    }
        //Metodos
        public void sonido(){
        System.out.println("Miau, Miau");
    }
        public void comer(){
        System.out.println("Estoy comiendo un pescado");
    }
        public void dormir(){
        System.out.println("Zzzzzz...");
    }


}
