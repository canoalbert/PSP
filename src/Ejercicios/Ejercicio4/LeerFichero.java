package Ejercicios.Ejercicio4;

import java.io.*;

public class LeerFichero {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String respuesta = "";

        try {
            respuesta = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fichero = new File(respuesta);
        BufferedReader brFile;
        try {

            brFile = new BufferedReader(new FileReader(fichero));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String linea = null;
        try {
            while ((linea = brFile.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
