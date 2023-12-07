/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author Daniel i7 pro
 */
public class MiembroDepartamentoTecnico extends BaseManejador {

    public MiembroDepartamentoTecnico(ManejadorSolicitud siguiente) {
        super(siguiente);
    }

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        // Verificar si el tipo de fallo está cubierto por la garantía
        if (solicitud.tipoFalloCubierto()) {
            super.manejarSolicitud(solicitud);
        } else {
            System.out.println("El tipo de fallo no está cubierto por la garantía.");
        }
    }

}
