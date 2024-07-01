package socket_conexion_cliente;

public class Asiento {
    
    private int idAsiento;
    private int idCabecera;
    private int idCuenta;
    private String cuenta;
    private String fecha;
    private String detalle;
    private double debe;
    private double haber; 

    public Asiento() {
        this.idAsiento = 0;
        this.idCabecera = 0;
        this.idCuenta = 0;
        this.cuenta = "";
        this.fecha = "";
        this.detalle = "";
        this.debe = 0;
        this.haber = 0;
    }

    public Asiento(int idAsiento, int idCabecera, int idCuenta, String cuenta, String fecha, String detalle, double debe, double haber) {
        this.idAsiento = idAsiento;
        this.idCabecera = idCabecera;
        this.idCuenta = idCuenta;
        this.cuenta = cuenta;
        this.fecha = fecha;
        this.detalle = detalle;
        this.debe = debe;
        this.haber = haber;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public int getIdCabecera() {
        return idCabecera;
    }

    public void setIdCabecera(int idCabecera) {
        this.idCabecera = idCabecera;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }
    

    @Override
    public String toString() {
        return "Asiento{" + "idAsiento=" + idAsiento + ", idCabecera=" + idCabecera + ", idCuenta=" + idCuenta + ", cuenta=" + cuenta + ", fecha=" + fecha + ", detalle=" + detalle + ", debe=" + debe + ", haber=" + haber + '}';
    }  
}
