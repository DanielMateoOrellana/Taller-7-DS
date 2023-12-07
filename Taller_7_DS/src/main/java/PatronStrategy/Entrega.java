/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronStrategy;

import PatronDecorator.Articulo;
import java.util.List;

/**
 *
 * @author Daniel i7 pro
 */
public class Entrega {
    private MedioTransporte md;
    private List<Articulo> articulos;

    public Entrega(MedioTransporte md, List<Articulo> articulos) {
        this.md = md;
        this.articulos = articulos;
    }

    public void distribuir(List<Articulo> articulos){
        
    }
    
    public MedioTransporte getMd() {
        return md;
    }

    public void setMd(MedioTransporte md) {
        this.md = md;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    
}
