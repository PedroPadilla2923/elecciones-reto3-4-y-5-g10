package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import static javax.swing.text.html.HTML.Tag.SELECT;

/**
 *
 * @author Pedro Padilla Rabace
 */

public class MdlCandidato {
    
    ClsJdbc jdbc;
    
    public MdlCandidato(){
        
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
       
    }
    
    public boolean agregarCandidato(ClsCandidato candidato){
        
        return true;   
    }
    
    public LinkedList<ClsCandidato> ObtenerCandidatos(){
        
        try {
            
            LinkedList<ClsCandidato> listaCandidatos = new LinkedList<>();
            
            String sql = "SELECT * FROM tblCandidaros" ;
            PreparedStatement sentencia  = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();
            
            while(resultados.next()){
                String partidoPolitico = resultados.getString("partido_politico");
                String descripcion = resultados.getString("descripcion");
                String numeroDocumento = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                String numeroCelular = resultados.getString("numero_celular");
                String correo = resultados.getString("correo");
                
                ClsCandidato candi = new ClsCandidato(partidoPolitico, descripcion, numeroDocumento, nombre, numeroCelular, correo);
            
                listaCandidatos.add(candi);
            }
            
            return listaCandidatos;
           
        } catch (Exception e){
            System.out.println("Uy Sucedio un Error" + e.getMessage());
            return null;
        
        }
    
    }
    
}
