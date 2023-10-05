package Ejercicios.Ejercicio3.DirUltimaLinea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class DirUltimaLinea {
    public static void main(String[] args) throws IOException {
        String[] comandoDir = { "cmd", "/C", "dir"};

        String[] comandoLS = {"ls", "-la"};

        String[] comandoUL = {"Java", "-jar", "out/artifacts/UltimLinea/UltimLinea.jar"};

        Process procesDIR = null;
        try {
            procesDIR = new ProcessBuilder(comandoDir).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedReader brDIR = new BufferedReader(new InputStreamReader(procesDIR.getInputStream()));

        Process UltimaLinea = null;
        try {
            UltimaLinea = new ProcessBuilder(comandoUL).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PrintStream psUltimaLinea = null;
        psUltimaLinea = new PrintStream(UltimaLinea.getOutputStream());

        String  respuesta = "";
        try {
            while ((respuesta = brDIR.readLine()) != null){
                psUltimaLinea.println(respuesta);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        psUltimaLinea.close();

        System.out.println("Y la ultima linea es.....");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BufferedReader brUltimaLinea = new BufferedReader(new InputStreamReader(UltimaLinea.getInputStream()));
        try {
            System.out.println(brUltimaLinea.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
