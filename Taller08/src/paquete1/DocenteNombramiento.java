
package paquete1;

public class DocenteNombramiento extends Docente {
    double valorSueldo;
    double valorHorasExtra;
    int numeroHorasExtra;
    double totalSueldo;
    
    public void establecerValorSueldo(double c){
        valorSueldo = c;
    }
     public void establecerValorHorasExtra(double c){
        valorHorasExtra = c;
    }
      public void establecerNumeroHorasExtra(int c){
        numeroHorasExtra = c;
    }
       public void establecerTotalSueldo(){
        totalSueldo = (valorHorasExtra* numeroHorasExtra) + valorSueldo;
    }
        public double obtenerValorSueldo(){
        return valorSueldo;
    }
        public double obtenerValorHorasExtra(){
        return valorHorasExtra;
    }
        public int obtenerNumeroHorasExtra(){
        return numeroHorasExtra;
    }
        public double obtenerTotalSueldo(){
            return totalSueldo;
        }
        
    @Override
        public String toString(){
            String cadena= String.format("Datos Docente\n"
                +"Nombre: %s\n"
                +"Cedula: %s\n"
                +"Sueldo del Docente: %.2f\n"
                +"Valor de Horas Extra: %.2f\n"
                +"Numero de Horas Extra: %d\n"
                +"Sueldo Total: %.2f\n",
                obtenerNombresDocente(),
                obtenerCedulaDocente(),
                obtenerValorSueldo(),
                obtenerValorHorasExtra(),
                obtenerNumeroHorasExtra(),
                obtenerTotalSueldo());
        return cadena;
        }
}
