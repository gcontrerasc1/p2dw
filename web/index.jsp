<%-- 
    Document   : index
    Created on : 23/09/2020, 11:16:47 AM
    Author     : Guilmar Contreras
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.table.DefaultTableModel" %>
<%@page import="Modelo.Producto" %>
<%@page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body>
        <h1>Formulario de Productos</h1>
        <div class="container">
            <form action="sr_producto" method="post" class="form-group"></form>
            <label for="lbl_producto">Producto:</label>
                <input type="text" name="txt_producto" id="txt_producto" class="form-control" placeholder="Cereal" required>                           
                <label for="lbl_idmarca">ID Marca:</label>
                <input type="text" name="txt_idmarca" id="txt_idmarca" class="form-control" placeholder="C1000" required>              
                <label for="lbl_descripcion">Descripcion:</label>
                <input type="text" name="txt_descripcion" id="txt_descripicion" class="form-control" placeholder="Azucarado" required>
                <label for="lbl_costo">Costo:</label>
                <input type="text" name="txt_costo" id="txt_costo" class="form-control" placeholder="25" required>
                <label for="lbl_venta">Venta:</label>
                <input type="text" name="txt_venta" id="txt_venta" class="form-control" placeholder="45" required>
                <label for="lbl_existencia">Existencia:</label>
                <input type="text" name="txt_existencia" id="txt_existencia" class="form-control" required>
                <br>
                <button name="btn_agregar" id="btn_agregar" value="agregar" class="btn btn-success">Agregar</button>
                <button name="btn_modificar" id="btn_modificar" value="modificar" class="btn btn-primary">Modificar</button>
                <button name="btn_eliminar" id="btn_eliminar" value="eliminar" class="btn btn-danger">Eliminar</button>
        </div>
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
