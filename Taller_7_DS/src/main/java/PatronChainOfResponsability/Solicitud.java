/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronChainOfResponsability;

/**
 *
 * @author Daniel i7 pro
 */
public class Solicitud {

    private boolean enPeriodoGarantia;
    private boolean tieneFalloCubierto;
    private boolean enBodega;
    private double precio;

    public Solicitud(boolean enPeriodoGarantia, boolean tipoFalloCubierto, boolean enBodega, double precio) {
        this.enPeriodoGarantia = enPeriodoGarantia;
        this.tieneFalloCubierto = tipoFalloCubierto;
        this.enBodega = enBodega;
        this.precio = precio;
    }

    public boolean estaEnPeriodoGarantia() {
        return enPeriodoGarantia;
    }

    public boolean tipoFalloCubierto() {
        return tieneFalloCubierto;
    }

    public boolean existeEnBodega() {
        return enBodega;
    }

    public double getPrecio() {
        return precio;
    }

}
