/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_TiposPrimitivos;

/**
 *
 * @author Shalc
 */
public class EjercicioTiposPrimitivosTipoFlotante {
    public static void main(String args[]) {
        /*Tipos primitivos flotantes: 
        float => 32 bits
        double => 64 bits
         */
        
        //Literal de tipo flotante float numeroFloat = 10.0F o el de abajo;, sin pérdida de precisión
        float numeroFloat = (float)10.0;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo float: " + Float.MAX_VALUE);
        
        
        //Literal de tipo double convertida a una variable de tipo flotante
        float numeroFloatPrueba = (float)3.4028236E38D;
        System.out.println("numeroFloatPrueba = " + numeroFloatPrueba);
    
    
    
        /*TIPO DOUBLE*/
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo double: " + Double.MAX_VALUE);
        
    }
    
}
