package POO;
public class clientesPOO {

    private int id;

    private String nombre;

    private int nit;

    private String correo;
    
    private String genero;

    
    //clientes
    public clientesPOO(int id, String nombre, int nit, String correo, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.genero = genero;
    }
    
    //clientes 
    public clientesPOO(String nombre, int nit, String correo, String genero) {
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.genero = genero;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public int getCantidad() {
//        return cantidad;
//    }
//
//    public void setCantidad(int cantidad) {
//        this.cantidad = cantidad;
//    }
//
//    public double getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(double precio) {
//        this.precio = precio;
//    }
//
//    public String getDireccion() {
//        return direccion;
//    }
//
//    public void setDireccion(String direccion) {
//        this.direccion = direccion;
//    }
//
//    public int getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(int telefono) {
//        this.telefono = telefono;
//    }
//
//    public int getCaja() {
//        return caja;
//    }
//
//    public void setCaja(int caja) {
//        this.caja = caja;
//    }
//
//    public int getVentas() {
//        return ventas;
//    }
//
//    public void setVentas(int ventas) {
//        this.ventas = ventas;
//    }
    
    
    
    
    
}
