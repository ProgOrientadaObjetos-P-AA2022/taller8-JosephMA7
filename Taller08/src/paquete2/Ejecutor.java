
package paquete2;
import java.util.Locale;
import java.util.Scanner;
import paquete1.*;
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Elija una opcion: ");
        System.out.println("Ingrese los datos del docente [1]: ");
        System.out.println("Factura del docente           [2]: ");
        int opcion = entrada.nextInt();
        
        if (opcion != 1 && opcion != 2){
            System.out.println("Error al ingresar esta opcion!!");
        }else{
            entrada.nextLine();
            System.out.println("Ingrese nombre del Docente: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula del Docente: ");
            String cedula = entrada.nextLine();
            
            if(opcion == 1){
                 System.out.println("Ingrese el sueldo del Docente: ");
                 double sueldo = entrada.nextDouble();
                 System.out.println("Ingrese valor de las horas Extra: ");
                 double valorHorasExtra=entrada.nextDouble();
                 System.out.println("Ingrese el numero de horas extra: ");
                 int numeroHorasExtra = entrada.nextInt();
                 
                 DocenteNombramiento docente = new DocenteNombramiento();
                 docente.establecerNombresDocente(nombre);
                 docente.establecerCedulaDocente(cedula);
                 docente.establecerValorSueldo(sueldo);
                 docente.establecerValorHorasExtra(valorHorasExtra);
                 docente.establecerNumeroHorasExtra(numeroHorasExtra);
                 docente.establecerTotalSueldo();
                 
                 System.out.printf("\n%s\n", docente);
            }else{
                if(opcion == 2){
                    System.out.println("Ingrese valor de la factura: ");
                    double valorFactura = entrada.nextDouble();
                    double valorIvaDescuento = 0.12;
                    
                    DocenteFactura factura = new DocenteFactura();
                    factura.establecerNombresDocente(nombre);
                    factura.establecerCedulaDocente(cedula);
                    factura.establecerValorFactura(valorFactura);
                    factura.establecerValorIvaDescuento(valorIvaDescuento);
                    factura.establecerValorCancelar();
                    System.out.printf("\n%s\n", factura);
                }
            }
        }
    }
}
