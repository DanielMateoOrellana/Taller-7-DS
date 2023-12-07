/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author Daniel i7 pro
 */
public abstract class BaseManejador implements ManejadorSolicitud {

    private ManejadorSolicitud siguiente;

    public BaseManejador(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void establecerSiguiente(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        }
    }

    public ManejadorSolicitud getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    
}
