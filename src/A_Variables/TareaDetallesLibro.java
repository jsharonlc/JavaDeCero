package A_Variables;


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

/*titulo

autor

Debes imprimir la información en el siguiente formato:

Proporciona el titulo:
Proporciona el autor:
<titulo> fue escrito por <autor>
Puedes utilizar el IDE de tu preferencia para desarrollar la solución y después pegar aquí tu respuesta, ya que este editor no contiene ningún tipo de ayuda.

Preguntas de esta tarea
¿Cuál es el código del requerimiento solicitado?*/
public class TareaDetallesLibro {
    public static void main(String args[]) {
        System.out.println("Escribe el titulo:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        
        System.out.println("Escribe el autor:");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}


/*SOLUCIÓN
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }

__________________________________________________________________________
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
}*/