/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDecorator;

import java.util.List;

/**
 *
 * @author Daniel i7 pro
 */
public class ScreenResolutions extends ArticuloDecorator {

    private String resolucionPantalla;

    public ScreenResolutions(String resolucionPantalla, Articulo wrapper) {
        super(wrapper);
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    
    @Override
    public void obtenerDescripcion(){
        // lógica de obtener descripción
    }
    
}
