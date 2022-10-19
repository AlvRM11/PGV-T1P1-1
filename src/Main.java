import java.io.IOException;
import java.util.Scanner;

/**
 * Código hecho con comandos Linux
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProcessBuilder pb = new ProcessBuilder();
        pb.command("firefox");
        Process p = null;

        System.out.println("Introduzca el número de veces que desea abrir el navegador:");
        int navNum = sc.nextInt();

        for (int i = 0; i < navNum; i++) {
            try{
                p = pb.start();
                p.waitFor();
            }
            catch (IOException | InterruptedException e) {
                System.out.println("Error al lanzar el proceso");
            }
        }
    }
}