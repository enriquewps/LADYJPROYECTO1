/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fciencias.riesgotec.javaee;

import java.util.Date;

/**
 *
 * @author yosh
 */
public class Venta {
    
    
    private String nombreCapturista;
    
    private double ventaBruta, ventaNeta, impuesto;
    
    private Date fecha;

    public double getVentaBruta() {
        return ventaBruta;
    }

    public void setVentaBruta(double ventaBruta) {
        this.ventaBruta = ventaBruta;
    }

    public double getVentaNeta() {
        return this.ventaBruta - impuesto;
    }

    public void setVentaNeta(double ventaNeta) {
        this.ventaNeta = ventaNeta;
    }

    public double getImpuesto() {
        
  
        return impuesto*0.16;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
   
    

    

    public String getNombreCapturista() {
        return nombreCapturista;
    }

    public void setNombreCapturista(String nombreCapturista) {
        this.nombreCapturista = nombreCapturista;
    }

    public double getVenta() {
        return ventaBruta;
    }

    public void setVenta(double venta) {
        this.ventaBruta = venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
