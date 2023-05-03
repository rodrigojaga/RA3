package POO;
public class hisventasPOO {
    private int no_factura;
    
    private int id_cliente;
    private String fecha;
    private String total;
    private byte[] accion;

    

    public int getNo_factura() {
        return no_factura;
    }

    public void setNo_factura(int no_factura) {
        this.no_factura = no_factura;
    }

    public byte[] getAccion() {
        return accion;
    }

    public void setAccion(byte[] accion) {
        this.accion = accion;
    }

    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

   
    
    
}
