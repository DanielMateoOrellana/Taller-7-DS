/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDecorator;

/**
 *
 * @author Daniel i7 pro
 */
public class AndroidTV extends ArticuloDecorator {

    private boolean haveAndroid;

    public AndroidTV(boolean haveAndroid, Articulo wrapper) {
        super(wrapper);
        this.haveAndroid = haveAndroid;
    }

    public boolean isHaveAndroid() {
        return haveAndroid;
    }

    public void setHaveAndroid(boolean haveAndroid) {
        this.haveAndroid = haveAndroid;
    }

    @Override
    public void obtenerDescripcion() {
        // lógica de obtener descripción
    }
}
