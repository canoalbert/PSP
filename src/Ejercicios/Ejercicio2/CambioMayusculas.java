package Ejercicios.Ejercicio2;

import java.io.*;

public class CambioMayusculas {
    public static void main(String[] args) {
        try {
            System.out.println("¡¡¡¡Introduce una frase en minúsulas y la tranformare en mayúsculas por ti!!!!!");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            String linea;

            //Leer líneas de la entrada estándar y las convierte a mayúsculas.
            while ((linea = entrada.readLine()) != null ){
                System.out.println("Tu frase se convierte a mayusculas: ");
                String lineaMayusculas = linea.toUpperCase();
                System.out.println(lineaMayusculas);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
