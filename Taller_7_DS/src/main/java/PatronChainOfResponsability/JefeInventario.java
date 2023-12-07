/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author Daniel i7 pro
 */
public class JefeInventario extends BaseManejador {

    public JefeInventario(ManejadorSolicitud siguiente) {
        super(siguiente);
    }

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        // Verificar existencia del producto en bodega para reposición
        if (solicitud.existeEnBodega()) {
            if (solicitud.getPrecio() > 1000) {
                // Si el precio supera los 1000 dólares, se requiere aprobación del gerente
                System.out.println("Se necesita la aprobación del gerente.");
            } else {
                System.out.println("Producto listo para cambio.");
            }
        } else {
            System.out.println("El producto no está disponible en bodega.");
        }
    }

}
