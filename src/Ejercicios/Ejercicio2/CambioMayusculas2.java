package Ejercicios.Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CambioMayusculas2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palafrasexto = "";
        try {
            System.out.println("Dime tu frase");
            palafrasexto = br.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        palafrasexto = palafrasexto.toUpperCase();
        System.out.println(palafrasexto);
    }
}
