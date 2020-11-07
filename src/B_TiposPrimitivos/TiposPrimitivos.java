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
public class TiposPrimitivos {

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
        byte numeroByte = 10;//Solo se puede dar el valor dentro del rango sino da lugar a error
        /*Pero se puede converir a tipo byte asi: byte numeroByte = (byte)129;
        Esto lo que hace es obligar, pero no alamacena el valor de 129, sino el valor
        de -127*/
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte: " + Byte.MAX_VALUE);
        
        
        /*Tipos primitivos flotantes: 
        float => 32 bits
        double => 64 bits
         */

    }
}
