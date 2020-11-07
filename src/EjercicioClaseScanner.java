/*Se debe importar la clase Scanner*/
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shalc
 */
public class EjercicioClaseScanner {

    public static void main(String args[]) {
        //Mensaje a la consola, solicitando que el usuario solicite un valor
        System.out.println("Escribe tu nombre:");
        //Tipo de nuestra variable scanner (definido)
        //Con esto lo que decimos es que vamos a leer información de la consola
        Scanner consola = new Scanner(System.in);

        /*El método nextLine lo que hace es leer la linea de la consola*/
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe el título:");
        var titulo = consola.nextLine();
        System.out.println("Resultado : " + titulo + " " + usuario);
    }
}
