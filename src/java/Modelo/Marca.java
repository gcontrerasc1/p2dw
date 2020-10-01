/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Guilmar Contreras
 */
public class Marca extends Producto{
        private int idproducto,idmarca;
        
    public Marca(){}

    public Marca(int idproducto, int idmarca) {
        this.idproducto = idproducto;
        this.idmarca = idmarca;
    }

    public Marca(int idproducto, int idmarca, int existencia, int precio_costo, int precio_venta, String producto, String descripcion) {
        super(idproducto, idmarca, existencia, precio_costo, precio_venta, producto, descripcion);
        this.idproducto = idproducto;
        this.idmarca = idmarca;
    }

        @Override
    public int getIdproducto() {
        return idproducto;
    }

        @Override
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

        @Override
    public int getIdmarca() {
        return idmarca;
    }

        @Override
    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }
    
}
