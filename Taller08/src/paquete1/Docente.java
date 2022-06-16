
package paquete1;


public class Docente {
    protected String nombres;
    protected String cedula;
    
    public void establecerNombresDocente(String c){
        nombres = c;
    }
    
    public void establecerCedulaDocente(String c){
        cedula = c;
    }
    
    public String obtenerNombresDocente(){
        return nombres;
    }
    
    public String obtenerCedulaDocente(){
        return cedula;
    }
    
}
