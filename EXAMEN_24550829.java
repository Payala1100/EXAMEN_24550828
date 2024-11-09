 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_numero_mayor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class  EXAMEN_24550829{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              


    int usuarioGanas = 0;
    int computadoraGanas = 0;
    int empates = 0;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    boolean juego = true;

    while (juego) {
      System.out.println("Ingrese su elección (1. Piedra, 2. Papel, 3. Tijeras): ");
      int eleccionUsuario = scanner.nextInt();
      int eleccionComputadora = random.nextInt(3) + 1;

      String eleccionUsuarioTexto = "";
      String eleccionComputadoraTexto = "";

      switch (eleccionUsuario) {
        case 1:
          eleccionUsuarioTexto = "Piedra";
          break;
        case 2:
          eleccionUsuarioTexto = "Papel";
          break;
        case 3:
          eleccionUsuarioTexto = "Tijeras";
          break;
        default:
          eleccionUsuarioTexto = "Opción inválida";
      }

      switch (eleccionComputadora) {
        case 1:
          eleccionComputadoraTexto = "Piedra";
          break;
        case 2:
          eleccionComputadoraTexto = "Papel";
          break;
        case 3:
          eleccionComputadoraTexto = "Tijeras";
          break;
      }

      System.out.println("Usuario: " + eleccionUsuarioTexto);
      System.out.println("Computadora: " + eleccionComputadoraTexto);

      if (eleccionUsuario == eleccionComputadora) {
        System.out.println("Empate!");
        empates++;
      } else if (
        (eleccionUsuario == 1 && eleccionComputadora == 3) ||
        (eleccionUsuario == 2 && eleccionComputadora == 1) ||
        (eleccionUsuario == 3 && eleccionComputadora == 2)
      ) {
        System.out.println("Usuario gana!");
        usuarioGanas++;
      } else {
        System.out.println("Computadora gana!");
        computadoraGanas++;
      }

      System.out.println("Marcador:");
      System.out.println("Usuario: " + usuarioGanas);
      System.out.println("Computadora: " + computadoraGanas);
      System.out.println("Empates: " + empates);

      System.out.println("¿Desea jugar de nuevo? (1. Sí, 2. No): ");
      int respuesta = scanner.nextInt();
      if (respuesta == 2) {
        juego = false;
        System.out.println("Gracias por jugar!");
      }
    }
  }
}

}
