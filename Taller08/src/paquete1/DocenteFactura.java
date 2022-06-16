
package paquete1;

public class DocenteFactura extends Docente {
    double valorFactura;
    double valorIvaDescuento;
    double valorCancelar;
    
    public void establecerValorFactura(double c){
        valorFactura = c;
    }
    
    public void establecerValorIvaDescuento(double c){
        valorIvaDescuento = c;
    }
    
    public void establecerValorCancelar(){
        valorCancelar = valorFactura - ((valorFactura*valorIvaDescuento));
    }
    
    public double obtenerValorFactura(){
        return valorFactura;
    }
    
    public double obtenerValorIvaDescuento(){
        return valorIvaDescuento;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    @Override
    public String toString(){
        String cadena = String.format("Factura Docente\n"
                +"Nombre: %s\n"
                +"Cedula: %s\n"
                +"Valor de la Factura: %.2f\n"
                +"Iva Descuento: %.2f\n"
                +"Valor a Cancelar: %.2f\n",
                obtenerNombresDocente(),
                obtenerCedulaDocente(),
                obtenerValorFactura(),
                obtenerValorIvaDescuento(),
                obtenerValorCancelar());
        return cadena;
    }
    
}
