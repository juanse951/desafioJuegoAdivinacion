import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0 ;
        System.out.println(numeroAleatorio);

        for (int i = 0; i < 5; i++) {
            System.out.println("Trata de adivinar el número aleatorio en máximo 5 intentos, este es tu intento #: " + (i+1));
            intentos = teclado.nextInt();

            if (numeroAleatorio < intentos){
                System.out.println("El número es menor");
            } else if (intentos == numeroAleatorio){
                System.out.println("Acertaste! en: " + (i+1) + " intentos");
                break;
            }
            else {
                System.out.println("El número es mayor");
            }
        }
    }
}


/*Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100,
 y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe
 informar si el número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

Para generar un número aleatorio en Java: new Random().nextInt(100);

Utiliza el Scanner para obtener los datos del usuario.

Utiliza una variable para contar los intentos.

Utiliza un bucle para controlar los intentos.

Utiliza la instrucción ‘break;’ para salir del bucle.

¡Buena suerte!*/


/*Solucion del instructor

public class JuegoDeAdivinacion {
    public static void main(String[] args) {

                Scanner lector = new Scanner(System.in);
                int numeroGenerado = new Random().nextInt(100); // genera un número aleatorio entre 0 y 100
                int intentos = 0;

                while (intentos < 5) {
                    System.out.print("Introduzca un número entre 0 e 100: ");
                    int numeroDelUsuario = lector.nextInt();
                    intentos++;

                    if (numeroDelUsuario == numeroGenerado) {
                        System.out.println("Felicidades, adivinaste el número en " + intentos + " intentos!");
                        break; // interrumpe el loop while
                    } else if (numeroDelUsuario < numeroGenerado) {
                        System.out.println("El número que escribiste es menor al número generado.");
                    } else {
                        System.out.println("El número que escribiste es mayor al número generado.");
                    }
                }

                if (intentos == 5) {
                    System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + numeroGenerado);
                }
            }
        }
 */