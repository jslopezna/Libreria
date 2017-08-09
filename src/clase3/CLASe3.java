
/**
 *
 * @author Andres Aponte
 * @version 1
 * @since 09/08/2017
 */

package clase3;
import java.util.*;
public class CLASe3 {
      
    public static double PAGO
        (int HORAS, double pago_por_hora) {
    double pago=0;
    if(HORAS<=40){
        pago=HORAS*pago_por_hora;
       return pago;
    }else{
       if(HORAS<=48){
        HORAS=HORAS-40;
        pago=40*pago_por_hora;
        pago=pago+HORAS*pago_por_hora*2;
        return pago;
    }else{
        HORAS=HORAS-48;
        pago=40*pago_por_hora;
        pago=pago+8*pago_por_hora*2;
        pago=pago+HORAS*pago_por_hora*3;
        return pago; 
    } 
    }
    }
    
   
    public static void main(String[] args) {
       Scanner flujoENT=new Scanner (System.in);
       
        String nombre = null;
        int numHoras =0;
        double valorHora = 0;
        double valorPagar = 0;
        
        System.out.println("nombre");
        nombre=flujoENT.next();
        System.out.println("Horas TrAbAJADAS");
        numHoras=flujoENT.nextInt();
        System.out.println("valor hora");
        valorHora=flujoENT.nextDouble();
        
        valorPagar =PAGO(numHoras, valorHora);
        System.out.println("Nombre   "+nombre+ "\n "+"pago  "+valorPagar);
    }
    
}