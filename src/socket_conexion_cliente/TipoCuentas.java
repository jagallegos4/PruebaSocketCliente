package socket_conexion_cliente;

public class TipoCuentas {
    
    int idTipo;
    String NombreTipo;

    public TipoCuentas(int idTipo, String NombreTipo) {
        this.idTipo = idTipo;
        this.NombreTipo = NombreTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return NombreTipo;
    }

    public void setNombreTipo(String NombreTipo) {
        this.NombreTipo = NombreTipo;
    }
    
    
    
}
