package Ejercicios.Ejercicio4.Invertir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Invertir {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();
        String respuesta = "";

        try {
            while (!(respuesta = br.readLine()).equals("FIN")) {
                lista.add(respuesta);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = lista.size()-1; i>0; i--){
            System.out.println(lista.get(i));
        }
    }
}
