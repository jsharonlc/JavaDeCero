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
public class EjercicioCaracteresEspeciales {

    public static void main(String args[]) {
        var nombre = "Sharon";

        //Sato de linea
        System.out.println("Nueva linea: \n" + nombre);

        //Tabulador
        System.out.println("Tabulador: \t" + nombre);

        //Retroceso, nos regresa una posición en la salida de nuestro programa
        System.out.println("Retroceso: \b" + nombre);

        //Uso de Comilla simple
        System.out.println("Comilla simple: \'" + nombre + "\'");

        //Uso de Comilla doble
        System.out.println("Comilla doble: \"" + nombre + "\"");

    }
}
