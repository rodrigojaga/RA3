package DAO;

import POO.clientesPOO;
import POO.hisventasPOO;
import POO.listarFacturasPOO;
import POO.productosPOO;
import java.util.LinkedList;

public interface ra3DAO {
    
    public LinkedList<clientesPOO> listarClientes(String nombre, String nit, String correo, String genero);
    
    public productosPOO obtenerPro(int codigo);
    
    public LinkedList<productosPOO> listarProducto(int cod);
    
    public void crearhisVentas(hisventasPOO ah);
    
    public void modificarProducto(int codigo, int cantidad);
    
    public clientesPOO mostrarCliente(String nit);
    
    public LinkedList<listarFacturasPOO> listarFacturas();
    public void ejecutarPDF (int id);
}
