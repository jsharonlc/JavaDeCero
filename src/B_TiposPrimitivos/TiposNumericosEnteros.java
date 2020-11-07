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
public class TiposNumericosEnteros {

    public static void main(String args[]) {
        /*El tipo boolean en Java es un tipo primitivo y puede almacenar
    solo e valor true o false. Su valor por default es false*/

    /*Tipos primitivos enteros: 
        byte => 8 bits - Rango -128 a 127
        short => 16 bits - Rango 32,768 a 32,767
        char => 16 bits 
        int => 32 bits, es el más común
        long => 64 bits
         */
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo short: " + Short.MAX_VALUE);
    
        
        //Tipo primitivo int
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor mínimo integer: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo integer: " + Integer.MAX_VALUE);
        
        //Literales tipo long, esta puede ser una l minúscula o mayúscula
        //Se recomienda que la L sea mayúscula para no confuncirla con un 1
        int numeroIntPrueba = (int)2147483648L;//Tipo superior de tipo long
        /*Pero esto se imprimira en valor negativo por que al imprimirlo estamos perdiendo 
        la precisión, hay que  tener cuidado*/
        System.out.println("numeroIntPrueba = " + numeroIntPrueba);
        
        
        //Tipo long
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor mínimo long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo long: " + Long.MAX_VALUE);
        
        /*Si nos pasamos el long para que no aparezca el error tiene que ser
        tipo double D o flotante F, con el long por delante*/
        long numeroLongPrueba = (long)9223372036854775808F;
    }
}
