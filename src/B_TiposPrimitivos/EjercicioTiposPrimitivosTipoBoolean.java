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
public class EjercicioTiposPrimitivosTipoBoolean {

    public static void main(String args[]) {
        //tipo booleano, solo almacena true o false
        boolean varBoolean = true;//Definición de una variable
        System.out.println("varBoolean = " + varBoolean);

        //Como utilizar los tipos booleanos
        //Si varBoolean es positivo me sacara el mensaje el valor es verdadero y no falso
        if (varBoolean) {
            System.out.println("El valor es verdadero");
        } else {
            System.out.println("El valor es falso");
        }

        //Algoritmo de edad
        var edad = 20;
        //var esAdulto = edad >= 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad +18");
        } else {
            System.out.println("Eres menor de edad -18");
        }
    }
}
