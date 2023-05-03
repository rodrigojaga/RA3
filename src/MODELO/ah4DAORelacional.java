package MODELO;

import POO.sucursalesPOO;
import POO.vendedoresPOO;
import POO.clientesPOO;
import POO.productosPOO;
import DAO.ah4DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ah4DAORelacional implements ah4DAO{
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexk acceso = new conexk();

    //LinkedList<ah4> json = new LinkedList<>();
    Json js = new Json();
    
    
     @Override
    public LinkedList<clientesPOO> listarClientes() {
        String sql = "SELECT id_cliente, nombre, nit,correo,genero FROM clientes;";
        LinkedList<clientesPOO> listar = new LinkedList<>();
        LinkedList<ah4Json> listara = new LinkedList<>();
        Json js = new Json();
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                listar.add(new clientesPOO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
                
            }
            return listar;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
        return null;
    }
    @Override
    public LinkedList<sucursalesPOO> listarSucursales() {
        String sql = "SELECT * FROM sucursales";
        LinkedList<sucursalesPOO> listar = new LinkedList<>();
//        LinkedList<ah4Json> listara = new LinkedList<>();
//        Json js = new Json();
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                listar.add(new sucursalesPOO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
//                listara.add(new ah4Json(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
            }
            return listar;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
        return null;
    }
    @Override
    public LinkedList<productosPOO> listarProductos() {
         String sql = "SELECT * FROM productos";
        LinkedList<productosPOO> listar = new LinkedList<>();        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                listar.add(new productosPOO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5)));
            }
            return listar;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
        return null;
    }
    @Override
    public LinkedList<vendedoresPOO> listarVendedores() {
        String sql = "SELECT * from vendedores ";
        LinkedList<vendedoresPOO> listar = new LinkedList<>();        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                listar.add(new vendedoresPOO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),rs.getString(6)));
            }
            return listar;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
        return null;
    }
    
    
    @Override
    public clientesPOO obtener(int codigo) {
        String sql = "select * from clientes where id_cliente= ?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                clientesPOO ah = new clientesPOO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
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
    public sucursalesPOO obtenerSucu(int codigo) {
        String sql = "select * from sucursales where id_sucursal= ?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                sucursalesPOO ah = new sucursalesPOO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
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
    public productosPOO obtenerPro(int codigo) {
        String sql = "select * from productos where id_producto= ?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                productosPOO ah = new productosPOO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDouble(5));
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
    public vendedoresPOO obtenerVen(int codigo) {
        String sql = "select * from vendedores where id_vendedor= ?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                vendedoresPOO ah = new vendedoresPOO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6));
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
    public void crearClientes(clientesPOO ah) {
        String sql = "insert into clientes(nombre,nit,correo,genero) values (?,?,?,?);";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, ah.getNombre());
            ps.setInt(2, ah.getNit());
            ps.setString(3, ah.getCorreo());
            ps.setString(4, ah.getGenero());
            ps.executeUpdate();
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");}
    }
   @Override
    public void crearSucursales(sucursalesPOO ah) {
        String sql = "insert into sucursales(nombre,direccion,correo,telefono) values (?,?,?,?);";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, ah.getNombre());
            ps.setString(2, ah.getDireccion());
            ps.setString(3, ah.getCorreo());
            ps.setInt(4, ah.getTelefono());
            ps.executeUpdate();
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");}
    }
    @Override
    public void crearProductos(productosPOO ah) {
        String sql = "insert into productos(nombre,descripcion,cantidad,precio) values (?,?,?,?);";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, ah.getNombre());
            ps.setString(2, ah.getDescripcion());
            ps.setInt(3, ah.getCantidad());
            ps.setDouble(4, ah.getPrecio());
            ps.executeUpdate();
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");}
    }
    @Override
    public void crearVendedores(vendedoresPOO ah) {
        String sql = "insert into vendedores(nombre,caja,ventas,genero,password) values (?,?,?,?,?);";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, ah.getNombre());
            ps.setInt(2, ah.getCaja());
            ps.setInt(3, ah.getVentas());
            ps.setString(4, ah.getGenero());
            ps.setString(5, ah.getPassword());
            ps.executeUpdate();
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");}
    }
    
    @Override
    public void modificarCliente(clientesPOO ah) {
        String sql = "update clientes set nombre=?, nit=? , correo = ?, genero =? where id_cliente=?;";
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, ah.getNombre());
            ps.setInt(2, ah.getNit());
            ps.setString(3, ah.getCorreo());
            ps.setString(4, ah.getGenero());
            ps.setInt(5, ah.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
    }
    @Override
    public void modificarSucursal(sucursalesPOO ah) {
        String sql = "update sucursales set nombre=?, direccion=? , correo = ?, telefono =? where id_sucursal=?;";
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, ah.getNombre());
            ps.setString(2, ah.getDireccion());
            ps.setString(3, ah.getCorreo());
            ps.setInt(4, ah.getTelefono());
            ps.setInt(5, ah.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
    }
    @Override
    public void modificarProducto(productosPOO ah) {
        String sql = "update productos set nombre=?, descripcion=? , cantidad = ?, precio =? where id_producto=?;";
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, ah.getNombre());
            ps.setString(2, ah.getDescripcion());
            ps.setInt(3, ah.getCantidad());
            ps.setDouble(4, ah.getPrecio());
            ps.setInt(5, ah.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
    }
    @Override
    public void modificarVendedor(vendedoresPOO ah) {
        String sql = "update vendedores set nombre=?, caja=? , ventas = ?, genero =?,password = ? where id_vendedor=?;";
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, ah.getNombre());
            ps.setInt(2, ah.getCaja());
            ps.setInt(3, ah.getVentas());
            ps.setString(4, ah.getGenero());
            ps.setString(5, ah.getPassword());
            
            ps.setInt(6, ah.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
    }
    
    @Override
    public void eliminar(int codigo) {
        String sql = "DELETE FROM clientes WHERE id_cliente = ?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }
    @Override
    public void eliminarSucu(int codigo) {
        String sql = "DELETE FROM sucursales WHERE id_sucursal = ?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }
     @Override
    public void eliminarPro(int codigo) {
        String sql = "DELETE FROM productos WHERE id_producto = ?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }
    @Override
    public void eliminarVen(int codigo) {
        String sql = "DELETE FROM vendedores WHERE id_vendedor = ?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }

    @Override
    public LinkedList<ah4Json> listarClientesJson() {
        String sql = "SELECT id_cliente, nombre, nit,correo,genero FROM clientes;";
       
        LinkedList<ah4Json> listara = new LinkedList<>();
        Json js = new Json();
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                listara.add(new ah4Json(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
            }
            return listara;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal: \n"+e+" \n Contactese con el desarrollador");
        }
        return null;
    }

    @Override
    public vendedoresPOO login(String nombre, String password) {
        String sql = "Select nombre,password,caja from vendedores where nombre=? and password = ?";
        try{
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if(rs.next()){
                vendedoresPOO vp = new vendedoresPOO(rs.getString(1),rs.getString(2),rs.getInt(3));
                return vp;
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ALgo salio mal: "+e);
        }
        return null;
    }
    
   

    

    

    

    

    

    

    

    

    

   

    

    

    

    

    

    

    

   
    
}
