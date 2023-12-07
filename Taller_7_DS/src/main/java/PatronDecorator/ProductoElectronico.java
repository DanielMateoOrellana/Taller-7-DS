/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDecorator;

import PatronStrategy.MedioTransporte;
import java.util.List;

/**
 *
 * @author Daniel i7 pro
 */
public class ProductoElectronico implements Articulo {

    int id;
    String nombre;
    String marca;
    String modelo;
    double peso;
    double precio;
    List<Articulo> articulos;

    public ProductoElectronico(int id, String nombre, String marca, String modelo, double peso, double precio, List<Articulo> articulos) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.precio = precio;
        this.articulos = articulos;
    }

    @Override
    public void obtenerDescripcion() {
        // lógica de obtener descripción
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
