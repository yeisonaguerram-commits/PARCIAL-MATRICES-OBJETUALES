import java.util.Scanner;

public class Menu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = sc.nextInt();
        ObjetoClases[][] Almacen = new ObjetoClases[n][n];
        boolean continuar = true;
        Metodos m = new Metodos();
        
        while (continuar) {


            System.out.println("'''''''''''''''''''''''''''");
            System.out.println("Bienvenido a compute parcial plus por YEISON GUERRA");
            System.out.println("''''''''''''''''''''''''''''");
            System.out.println("¿Que desea realizar????");
            System.out.println("1) Ingresar equipo a almacen");
            System.out.println("2) Mostrar almacen de equipos");
            System.out.println("3) Organizar almacen");
            System.out.println("4) eliminar equipo");
            System.out.println("5) Organizar cantidad");
            System.out.println("6) salir");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    Almacen = m.LlenarMatriz(Almacen);
                    break;
                case 2:
                    m.MostrarMatriz(Almacen);
                    break;
                case 3:
                    Almacen = m.OrganizarMatriz(Almacen);
                    break;
                case 4:
                    Almacen = m.EliminarEquipo(Almacen);
                    break;
                case 5:
                    Almacen = m.OrganizarCantidad(Almacen);
                    break;
                case 6:
                    System.out.println("Hasta pronto :)");
                    System.out.println("-------------------");
                    continuar = false;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }

        }

        sc.close();
    }
}