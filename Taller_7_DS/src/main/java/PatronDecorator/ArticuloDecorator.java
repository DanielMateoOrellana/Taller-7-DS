/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDecorator;

/**
 *
 * @author Daniel i7 pro
 */
public abstract class ArticuloDecorator implements Articulo {

    Articulo wrapper;

    public ArticuloDecorator(Articulo wrapper) {
        this.wrapper = wrapper;
    }

    public Articulo getWrapper() {
        return wrapper;
    }

    public void setWrapper(Articulo wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void obtenerDescripcion() {
        // lógica de obtener descripción
    }
}
