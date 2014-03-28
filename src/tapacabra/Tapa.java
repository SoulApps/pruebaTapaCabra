package tapacabra;

public class Tapa {
    
    private String bar;
    private String tapa;
    private String direccion;
    private String latitud;
    private String longitud;

    public Tapa() {
    }    
    
    public Tapa(String bar, String tapa, String direccion, String latitud, String longitud) {
        this.bar = bar;
        this.tapa = tapa;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getBar() {
        return bar;
    }

    public  void setBar(String bar) {
        this.bar = bar;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return  "bar : " + bar + " , tapa : " + tapa +'.';
    }

   
            
    
    
}
