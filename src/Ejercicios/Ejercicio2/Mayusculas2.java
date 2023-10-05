package Ejercicios.Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Mayusculas2 {
    public static void main(String[] args) throws IOException {
        String[] comando = {"Java", "-jar", "out/artifacts/CambioMayusculas/CambioMayusculas.jar"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bienvenidos al programa de CambioMayusculas2");
        System.out.println("Escribe las palabras y te las cambiare a mayusculas hasta que escribas la palabra fin");
        String respuesta = "";
        do {
            try {
                respuesta = br.readLine();


            }catch (IOException e){
                throw new RuntimeException(e);
            }
            Process cambioMayusculas = null;
            try {
                cambioMayusculas = new ProcessBuilder(comando).start();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            PrintStream psHijoCM = new PrintStream(cambioMayusculas.getOutputStream());
            psHijoCM.println(respuesta);
            psHijoCM.close();

            //LO que sea

            BufferedReader brHijoCM = new BufferedReader(new InputStreamReader(cambioMayusculas.getInputStream()));
            try {
                System.out.println(brHijoCM.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }while (!respuesta.equalsIgnoreCase("FIN"));
    }
}
