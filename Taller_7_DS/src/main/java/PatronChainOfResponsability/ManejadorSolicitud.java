/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author Daniel i7 pro
 */
public interface ManejadorSolicitud {

    public void manejarSolicitud(Solicitud solicitud);

    public void establecerSiguiente(ManejadorSolicitud siguiente);
}
