package MODELOVENDEDORES;

import DAO.ra3DAO;
import MODELO.conexk;
import POO.clientesPOO;
import POO.hisventasPOO;
import POO.listarFacturasPOO;
import POO.productosPOO;
import POO.vendedoresPOO;
import VISTAS2.vendedores;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ra3DAORelacional implements ra3DAO{
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexk acceso = new conexk();

     @Override
    public LinkedList<clientesPOO> listarClientes(String nombre, String nit, String correo, String genero) {
        
        String sql = "SELECT * FROM clientes WHERE nombre LIKE '%"+nombre+"%' AND correo LIKE '%"+correo+"%' "
                + "AND nit LIKE '%"+nit+"%' AND genero LIKE '%"+genero+"%';";
        
      
        try {
            LinkedList<clientesPOO> listar = new LinkedList<>();
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();    
     
            while (rs.next()) {
                
                listar.add(new clientesPOO(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
                 
            }
            return listar;
   
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public productosPOO obtenerPro(int codigo) {
        String sql = "select id_producto,nombre,precio from productos where id_producto= ?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                productosPOO ah = new productosPOO(rs.getInt(1),rs.getString(2),rs.getDouble(5));
                return ah;
            } else {
              JOptionPane.showMessageDialog(null,"Algo ha salido mal");  
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
        return null;
    }

    @Override
    public LinkedList<productosPOO> listarProducto(int cod) {
        String sql = "select id_producto,nombre,cantidad,precio from productos where id_producto= ?";
        
      
        try {
            LinkedList<productosPOO> listar = new LinkedList<>();
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
           ps.setInt(1, cod);
            rs = ps.executeQuery();    
     
            while (rs.next()) {
                
                listar.add(new productosPOO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
                 return listar;
            }
            
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Articulo no encontrado");
        }
        return null;
    }
    //pendiente
   @Override
    public void crearhisVentas(hisventasPOO ah) {
        
        String sql = "insert into hisventa(id_cliente,fecha,total,accion) values (?,?,?,?);";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ah.getId_cliente());
            ps.setString(2, ah.getFecha());
            ps.setString(3, ah.getTotal());
            ps.setString(4, ah.getAccion());
            ps.executeUpdate();
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");}
    }

   
   

    @Override
    public void modificarProducto(int codigo, int cantidad) {
        String sql = "update productos set cantidad=cantidad-? WHERE id_producto = ?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setInt(2, codigo);
            ps.setInt(1, cantidad);
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
    }

    @Override
    public clientesPOO mostrarCliente(String nit) {
        String sql = "Select * from clientes where nit = ?";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nit);
            rs = ps.executeQuery();
            if(rs.next()){
                clientesPOO vp = new clientesPOO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
                return vp;
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ALgo salio mal: "+e);
        }
        return null;
    }

    @Override
    public LinkedList<listarFacturasPOO> listarFacturas() {
        String sql = "SELECT hisventa.no_factura,clientes.nit,clientes.nombre,hisventa.fecha,"
                + "hisventa.total,hisventa.accion FROM hisventa INNER JOIN clientes ON "
                + "hisventa.id_cliente = clientes.id_cliente;";
         try {
            LinkedList<listarFacturasPOO> listar = new LinkedList<>();
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();    
     
            while (rs.next()) {
                
                listar.add(new listarFacturasPOO(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getBytes(6)));
                 
            }
            return listar;
   
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
   
    @Override
    public void ejecutarPDF (int id){
        String sql = "Select accion from hisventa where no_factura = ?";
        
        byte[] b = null;
        
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);
            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF,0,tamanoInput);
            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);
            
            out.close();
            bos.close();
            
            
        }catch(Exception e){}
    }
     
     @Override
    public LinkedList<listarFacturasPOO> listarfacturasU(String factura,String nit, String nombre, String fecha) {
        
        String sql = "SELECT hisventa.no_factura,clientes.nit,clientes.nombre,hisventa.fecha, "
                + "hisventa.total,hisventa.accion FROM hisventa INNER JOIN clientes ON hisventa.id_cliente ="
                + " clientes.id_cliente WHERE hisventa.no_factura LIKE '%"+factura+"%' AND clientes.nombre LIKE '%"+nombre+"%' AND "
                + "clientes.nit LIKE '%"+nit+"%' AND hisventa.fecha LIKE '%"+fecha+"%';";
        
      
        try {
            LinkedList<listarFacturasPOO> listar = new LinkedList<>();
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();    
     
            while (rs.next()) {
                
                listar.add(new listarFacturasPOO(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getBytes(6)));
                 
            }
            return listar;
   
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
        
}
