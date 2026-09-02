import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjetoClases[][] LlenarMatriz(ObjetoClases[][] Almacen) {
        for (int i = 0; i < Almacen.length; i++) {
            for (int j = 0; j < Almacen.length; j++) {
                ObjetoClases o = new ObjetoClases(null, 0, 0, 0, 0);
                if (Almacen[i][j] == null || Almacen[i][j].getEstado() != 1) {
                    System.out.println("Ingrese nombre del equipo");
                    System.out.println("-----------------------------");
                    o.setNombre(sc.next());
                    System.out.println("Ingrese el codigo del equipo");
                    System.out.println("--------------------");
                    o.setCodigo(sc.nextInt());
                    System.out.println("Ingrese el precio unitario");
                    System.out.println("--------------------------");
                    o.setPrecio(sc.nextDouble());
                    System.out.println("Ingrese la cantidad de equipos de este tipo ingresados ");
                    System.out.println("------------------------");
                    o.setCantidad(sc.nextInt());

                    o.setEstado(1);
                    Almacen[i][j] = o;

                    return Almacen;
                } // fin if
            } // fin fori 2
        } // fin fori 1
        System.out.println("Almacen lleno");
        System.out.println("-------------");
        return Almacen;
    } // fin llenar matriz

        public void MostrarMatriz(ObjetoClases[][] Almacen) {
        for (int i = 0; i < Almacen.length; i++) {
            for (int j = 0; j < Almacen.length; j++) {
                if (Almacen[i][j] != null && Almacen[i][j].getEstado() == 1) {
                System.out.println("Nombre de producto: " + Almacen[i][j].getNombre());
                System.out.println("Codigo de equipo: " + Almacen[i][j].getCodigo());
                System.out.println("Cantidad: " + Almacen[i][j].getCantidad());
                System.out.println("Precio: " + Almacen[i][j].getPrecio());
                System.out.println("--------------------------------------");
                } // fin if
            } //fin fori 2
        } //fin fori 1
    }// fin mstrar matriz

    public ObjetoClases[][] OrganizarMatriz(ObjetoClases[][] Almacen) {
        for (int i = 0; i < Almacen.length; i++) {
            for (int j = 0; j < Almacen.length; j++) {
                for (int i2 = 0; i2 < Almacen.length; i2++) {
                    for (int j2 = 0; j2 < Almacen.length; j2++) {
                        if (Almacen[i][j] != null && Almacen[i][j].getEstado() == 1 && Almacen[i2][j2] != null && Almacen[i2][j2].getEstado() == 1) {
                            if (Almacen[i][j].getNombre().equalsIgnoreCase(Almacen[i2][j2].getNombre())) {
                                Almacen[i2][j2] = null;

                                
                            } // fin if 2
                             System.out.println("Seleccione la opcion hasta limpiar el almacen");
                             return Almacen; 
                        } // fin if   
                          
                    } // fin for 4        [i][j]  
                } // fin for 3            [][]
            } // fin for 2
        } // fin for 1
        System.out.println("organizao");
        return Almacen;
    } // fin metodo organizar


    public ObjetoClases[][] EliminarEquipo(ObjetoClases[][] Almacen) {
        System.out.println("Ingrese nombre a eliminar");
        String nom = sc.next();
        for (int i = 0; i < Almacen.length; i++) {
            for (int j = 0; j < Almacen.length; j++) {

                if (nom.equalsIgnoreCase(Almacen[i][j].getNombre())) {
                    Almacen[i][j] = null;

                    return Almacen;
                }

                                
            } // fin for 2
        } // fin for 1
        System.out.println("No se encontro el nombre indicado");
        return Almacen;
    } // fin metdo

        public ObjetoClases[][] OrganizarCantidad(ObjetoClases[][] Almacen) {
        System.out.println("Ingrese nombre que desea modificar cantidad");
        String nom = sc.next();
        for (int i = 0; i < Almacen.length; i++) {
            for (int j = 0; j < Almacen.length; j++) {

                if (nom.equalsIgnoreCase(Almacen[i][j].getNombre())) {
                System.out.println("Nombre de producto: " + Almacen[i][j].getNombre());
                System.out.println("Codigo de equipo: " + Almacen[i][j].getCodigo());
                System.out.println("Cantidad: " + Almacen[i][j].getCantidad());
                System.out.println("Precio: " + Almacen[i][j].getPrecio());
                System.out.println("--------------------------------------");

                System.out.println("Seleccione la cantidad nueva");
                Almacen[i][j].setCantidad(sc.nextInt());

                return Almacen;
                }

                                
            } // fin for 2
        } // fin for 1
        System.out.println("No se encontro el nombre indicado");
        return Almacen;
    } // fin metdo
}