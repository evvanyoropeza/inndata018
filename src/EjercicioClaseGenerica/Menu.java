package EjercicioClaseGenerica;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Bodega<Articulo> articulos = new Bodega<>();
        int opcion;
        Scanner in = new Scanner(System.in);
        Articulo articulo= new Articulo(123456789, true, 001, "Playera", 99.90);
        System.out.println("""
                Bienvenido a las Bodegas del Ahorro
                Ingrese la opcion deseada:
                1.-Agregar un nuevo Articulo
                2.-Editar datos de un Articulo
                3.-Buscar un Articulo por codigo de barras
                4.-Eliminar un Articulo
                5.-Buscar Articulo por nombre
                6.-Mostrar una lista de Articulos disponibles
                7.-Buscar un articulo por ID
                """);
        opcion = in.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Agregar un nuevo Articulo");
                articulos.add(articulo);
                System.out.println("El articulo fue agregado correctamente!");
                System.out.println(articulos.getLista().stream().map(
                x-> "ID: "+x.getId() +" Nombre: "+ x.getNombre()+" Codigo de barras: "+ x.getCodigoBarras()+" Precio: $"+x.getPrecio()+" Existencia: "+x.isExistencia()
                ).toList());
                break;
            case 2:
                System.out.println("Editar datos de un Articul");
                break;
            case 3:
                System.out.println("Buscar un Articulo por codigo de barras");
                break;
            case 4:
                System.out.println("Eliminar un Articulo");
                break;
            case 5:
                System.out.println("Buscar Articulo por nombre");
                break;
            case 6:
                System.out.println("Mostrar una lista de Articulos disponibles");
                break;
            case 7:
                System.out.println("Buscar un articulo por ID");
                break;
            default:
        }

        //articulos.add(new Articulo("soldado","muñeco"));

    }
}
