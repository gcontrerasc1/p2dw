/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Guilmar Contreras
 */
public class Producto {
   private int idproducto, idmarca, existencia,precio_costo,precio_venta;
   private String producto,descripcion;
   Conexion cn;
   
   public Producto(){}

    public Producto(int idproducto, int idmarca, int existencia, int precio_costo, int precio_venta, String producto, String descripcion) {
        this.idproducto = idproducto;
        this.idmarca = idmarca;
        this.existencia = existencia;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.producto = producto;
        this.descripcion = descripcion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(int precio_costo) {
        this.precio_costo = precio_costo;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  public int agregar(){
      int retorno = 0;
      try{
          PreparedStatement parametro;
          cn = new Conexion();
          String query ="INSERT INTO parcial2.productos (idproducto,producto,idmarca,descripcion,precio_costo,precio_venta,existencia)VALUES(?,?,?,?,?,?,?);";
          cn.abrir_conexion();
          parametro = (PreparedStatement)cn.conexionBD.prepareStatement(query);
          parametro.setInt(1, getIdproducto());
          parametro.setString(2, getProducto());
          parametro.setInt(3, getIdmarca());
          parametro.setString(4, getDescripcion());
          parametro.setInt(5, getPrecio_costo());
          parametro.setInt(6, getPrecio_venta());
          parametro.setInt(7, getExistencia());
          retorno = parametro.executeUpdate();
          cn.cerrar_conexion();                 
      }catch(SQLException ex){
          System.out.println(ex.getMessage());
      }
       return 0;
  }
  public int modificar(){return 0;}
  public int eliminar(){return 0;}
}
   