package Clases;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class ClsVotante extends ClsPersona {
   
    private String direccion;
    private String ciudad;

    public ClsVotante(String direccion, String ciudad, String numeroDocumento, String nombre, String numeroCelular, String correo) {
        super(numeroDocumento, nombre, numeroCelular, correo);
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
