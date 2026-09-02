import java.util.Scanner;

public class menu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = sc.nextInt();
        ObjetoAlmacen[][] almacen1 = new ObjetoAlmacen[n][n];
        ObjetoAlmacen[][] almacen2 = new ObjetoAlmacen[n][n];
        ObjetoAlmacen[][] almacen3 = new ObjetoAlmacen[n][n * n];
        boolean continuar = true;
        Metodos m = new Metodos();

        while (continuar) {


            System.out.println("'''''''''''''''''''''''''''");
            System.out.println("Bienvenido a ");
            System.out.println("''''''''''''''''''''''''''''");
            System.out.println("¿Que desea realizar????");
            System.out.println("1) Ingresar almacen 1");
            System.out.println("2) Ingresar almacen 2");
            System.out.println("3) Mostrar almacen 1");
            System.out.println("4) Mostrar almacen 2");
            System.out.println("5) unificar total en almacenes");
            System.out.println("6) almacenaje total");
            System.out.println("7) Mostrar almacenaje total");
            System.out.println("8) salir");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    almacen1 = m.LlenarMatriz(almacen1);
                    break;
                case 2:
                    almacen2 = m.LlenarMatriz2(almacen2);
                    break;
                case 3:
                    m.MostrarMatriz(almacen1);
                    break;
                case 4:
                    m.MostrarMatriz2(almacen2);
                    break;
                case 5:
                    m.UnificarMatrices(almacen1, almacen2);
                    break;
                case 6:
                    almacen3 = m.AlmacenTotal(almacen1, almacen2, almacen3);
                    break;
                case 7:
                    m.MostrarMatriz3(almacen3);
                    break;
                case 8:
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