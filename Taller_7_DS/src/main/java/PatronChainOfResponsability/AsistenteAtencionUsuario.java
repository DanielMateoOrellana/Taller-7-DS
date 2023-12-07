/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author Daniel i7 pro
 */
public class AsistenteAtencionUsuario extends BaseManejador {

    public AsistenteAtencionUsuario(ManejadorSolicitud siguiente) {
        super(siguiente);
    }

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        // Verificar si el producto está en periodo de garantía
        if (solicitud.estaEnPeriodoGarantia()) {
            super.manejarSolicitud(solicitud);
        } else {
            System.out.println("El producto no está en periodo de garantía.");
        }
    }
}
