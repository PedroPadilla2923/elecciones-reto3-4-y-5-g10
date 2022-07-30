package Clases;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class ClsPersona {
    
    private String numeroDocumento;
    private String nombre;
    private String numeroCelular;
    private String correo;

    public ClsPersona(String numeroDocumento, String nombre, String numeroCelular, String correo) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correo = correo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
