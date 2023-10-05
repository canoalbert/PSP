package Ejercicios.Ejercicio3.UltimaLinea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltimaLinea {
    public static void main(String[] args) {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String respuesta = "";
        String ultima = "";
        try {
            while ((respuesta = br.readLine()) != null){
                ultima = respuesta;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ultima);

    }
}
