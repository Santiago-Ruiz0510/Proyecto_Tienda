import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto.Nodo.ListasLigadas lista1= new Producto.Nodo.ListasLigadas();
        lista1.mostrarProducto();
        Tienda tienda1= new Tienda();
        int Opcion = 0;
        String cedula = " " ;

        System.out.println("---------Bienvenido a Tienda.SAS---------");
        System.out.println("---------¿Que deseas hacer hoy?---------");
        System.out.println("1. Acceder al menu de ventas");
        System.out.println("2. Salir del programa");
        Opcion = Integer.parseInt(sc.nextLine());

        switch (Opcion){
            case 1:{
                Tienda.MenuVentas();
                break;
            }
            case 2:{

            }
        }
    }
}