/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shalc
 */
public class ConcatenacionJava {

    public static void main(String[] args) {
        //Union de variables
        var titulo = "Ingeniera";
        var usuario = "Sharon";

        //Para que no quede todo jutno se concatena con un " "
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        //Var de tipo entero, no puede coincidir con las palabras reservadas
        /*PALABRAS RESERVADAS
        abstract, continue, for, new, switch, assert, default, goto, package, synchronized
        boolean, do, if, private, this. break, double, implements, protected, throw
        byte, else, import, public, throws, case, enum, instanceof, return, transient,
        catch, extends, int, short, try, char, final, long, static, void,
        class, finally, long, strictfp, volatile, const, float, native,super, while */
        var i = 3;
        var j = 5;
        System.out.println(i + j);//Se realiza la suma de las variables
        System.out.println(i + j + " " + "usuario");
        System.out.println(usuario + i + j);//Aquí en realidad no lo suma solo lo contatena
        //Lo de arriba se debe a que en java se conoce como contexto cadena
        //Si se encuentra número primero lo suma, pero si primero se encuentra strings directamente lo concatena
    
        /*En este caso si uso queremos que nos aparezca la suma, usamos () para que se realice la suma
        Esto quiere decir que estamos modificando la prioridad en la evaluación, de izq a derecha se ve evalua*/
        System.out.println(usuario + (i+j));
    }
}
