public class ObjetoClases {
    String Nombre;
    int Codigo;
    double Precio;
    int Cantidad;
    int Estado;
    public ObjetoClases(String nombre, int codigo, double precio, int cantidad, int estado) {
        Nombre = nombre;
        Codigo = codigo;
        Precio = precio;
        Cantidad = cantidad;
        Estado = estado;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int estado) {
        Estado = estado;
    }

    
}