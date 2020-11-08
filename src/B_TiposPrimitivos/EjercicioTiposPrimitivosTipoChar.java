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
public class EjercicioTiposPrimitivosTipoChar {
    public static void main(String args[]) {
        //Los cahr se escriben con comillas simples para declararlos
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        

        //Lista de caracteres unicode
        
        //Formas de representar los caracteres
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        //Tipo char Decimal
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        //Tipo char Simbolo
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //Tipo var
        //En este caso detecta que es de tipo unicode y lo imprime como un char
         var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        //Tipo var Decimal
        //Aquí se encontro uno de tipo int
        var varCharDecimal1 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal1);
        
        //Tipo var Simbolo
        //var de tipo char y no entero
        var varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo1);
        
        //Un tipo char se puede convertir  a tipo enter, aquí lo que se visualiza es su tipo decimal
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        //No es el mismo valor la letra a, que la letra A en unicode, ya que tiene distinto valor
        int letra = 'a';
        System.out.println("letra = " + letra);
    }
}
