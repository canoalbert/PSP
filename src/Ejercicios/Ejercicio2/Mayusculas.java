package Ejercicios.Ejercicio2;

import java.io.*;

public class Mayusculas {
    public static void main(String[] args) {
        try {
            //Creo un proceso hijo llamado CambioMayusculas.
            ProcessBuilder builder = new ProcessBuilder("java", "-jar", "out/artifacts/CambioMayusculas/CambioMayusculas.jar");
            builder.redirectErrorStream(true);
            Process procesoHijo = builder.start();

            //Se obtienes los streams de entrada y salida del padre y el hijo
            OutputStream padreToHijo = procesoHijo.getOutputStream();
            InputStream hijoToPadre = procesoHijo.getInputStream();
            BufferedReader entradaPadre = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader entradaHijo = new BufferedReader(new InputStreamReader(hijoToPadre));

            String liena;

            //Leer líneas de la entrada estándar del padre y enviarlas al hijo.
            while ((liena = entradaPadre.readLine()) != null){
                //Se envia al hijo.
                padreToHijo.write((liena + "\n").getBytes());
                padreToHijo.flush();

                //Al recivir la respuesta se lee y la muestra en mayusculas.
                String respuestaHijo = entradaHijo.readLine();
                System.out.println(respuestaHijo);
            }

            //Cerrar streams
            padreToHijo.close();
            hijoToPadre.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
