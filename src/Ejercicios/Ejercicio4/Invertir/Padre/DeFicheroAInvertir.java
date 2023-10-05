package Ejercicios.Ejercicio4.Invertir.Padre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class DeFicheroAInvertir {
    public static void main(String[] args) {
        String[] coamndoLeerFichero = {"Java", "-jar", "out/artifacts/LeerFichero/LeerFichero.jar"};
        String[] comandoInvertir = {"Java", "-jar", ""};

        try {
            Process procesoLeerFichero = new ProcessBuilder(coamndoLeerFichero).start();
            Process procesoInvertir = new ProcessBuilder(comandoInvertir).start();
            BufferedReader brteclado = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Escribe la tuta del fichero y te dire su contenido de manera inversa");
            String respuesta ="";
            PrintStream psLeerFichero = new PrintStream(procesoLeerFichero.getOutputStream());

            String liena = null;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
