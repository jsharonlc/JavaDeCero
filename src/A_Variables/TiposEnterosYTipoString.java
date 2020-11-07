package A_Variables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shalc
 */
public class TiposEnterosYTipoString {
    public static void main(String args[]) {
        /*DEFINIMOS LA VARIABLE
        Cuando se imprima primero se imprimera su valor de 28 y luego el de 14 que es el nuevo valor
        */
        int miVariableEntera = 28;
        System.out.println(miVariableEntera);
        //Le asignamos otro valor, ya fue definida por eso no especificamos el tipo de dato
        //Modificación de el valor de la variable
        miVariableEntera = 14;
        System.out.println(miVariableEntera);
        
        
        
        /*____________________________________________________________*/
        /*Variables de Tipo String*/
        //Para las cadenas se utiliza ""
        /*String miVariableNombre = "Hola Sharon";
        System.out.println(miVariableNombre);*/
        
        /*EJERCICIO!!!, volver a ytilizar esta variable pero asignarle el valor de Adios*/
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);
    }
    
}
