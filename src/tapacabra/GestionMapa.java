/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tapacabra;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramón
 */
public class GestionMapa {
    private String ciudad;
    private int origen;
    private int marcadorLatitud;
    private int marcadorLongitud;
    private int zoom;
    private int tamHorizontal;
    private int tamVertical;
    
    public String getDireccion(int origen,int marcadorLatitud,int marcadorLongitud,int zoom,int tamHorizontal, int tamVertical){
                //Cambia los siguientes valores por las direciones de origen y destino deseadas
        this.origen = origen;
        this.marcadorLatitud = marcadorLatitud;
        this.marcadorLongitud = marcadorLongitud;
        this.zoom = zoom;
        this.tamHorizontal = tamHorizontal;
        this.tamVertical = tamVertical;

           String txtDireccionImagenMapa = "http://maps.google.com/maps/api/staticmap?path="+
                    ciudad+"&zoom="+zoom+"&size="+tamHorizontal+"x"+tamVertical+
                   "&markers=color:blue%7Clabel:S%7C"+marcadorLatitud+","+marcadorLongitud; 
            
            return txtDireccionImagenMapa;
           

        //http://maps.googleapis.com/maps/api/staticmap?center=36.675759,-5.445478&zoom=15&size=400x400&markers=color:blue%7Clabel:S%7C36.675759,-5.445478&sensor=false
    }

    public GestionMapa(String ciudad, int origen, int marcadorLatitud, int marcadorLongitud, int zoom, int tamHorizontal, int tamVertical) {
        this.ciudad = ciudad;
        this.origen = origen;
        this.marcadorLatitud = marcadorLatitud;
        this.marcadorLongitud = marcadorLongitud;
        this.zoom = zoom;
        this.tamHorizontal = tamHorizontal;
        this.tamVertical = tamVertical;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTamHorizontal() {
        return tamHorizontal;
    }

    public void setTamHorizontal(int tamHorizontal) {
        this.tamHorizontal = tamHorizontal;
    }

    public int getTamVertical() {
        return tamVertical;
    }

    public void setTamVertical(int tamVertical) {
        this.tamVertical = tamVertical;
    }


    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getMarcadorLatitud() {
        return marcadorLatitud;
    }

    public void setMarcadorLatitud(int marcadorLatitud) {
        this.marcadorLatitud = marcadorLatitud;
    }

    public int getMarcadorLongitud() {
        return marcadorLongitud;
    }

    public void setMarcadorLongitud(int marcadorLongitud) {
        this.marcadorLongitud = marcadorLongitud;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }
}
