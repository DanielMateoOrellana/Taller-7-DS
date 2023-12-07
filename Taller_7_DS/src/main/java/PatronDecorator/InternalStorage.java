/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDecorator;

import PatronStrategy.MedioTransporte;

/**
 *
 * @author Daniel i7 pro
 */
public class InternalStorage extends ArticuloDecorator{

    private int memoriaInterna;

    public InternalStorage(int memoriaInterna, Articulo wrapper) {
        super(wrapper);
        this.memoriaInterna = memoriaInterna;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }
    
    @Override
    public void obtenerDescripcion(){
        // lógica de obtener descripción
    }
}
