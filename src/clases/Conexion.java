/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author louis
 */
public class Conexion {
    
    
    public double conectarApiDivisa(String divisa_entrada, String divisa_salida){
        System.out.println("Ejecutando...");
        String apiUrl1 = "https://v6.exchangerate-api.com/v6/6abf9744304e2d8782895fb5/latest/USD";
        String apiUrl = "https://v6.exchangerate-api.com/v6/6abf9744304e2d8782895fb5/latest/" + divisa_entrada;
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Verificar el código de respuesta HTTP
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Convertir la respuesta a un objeto JSON
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Obtener las tasas de cambio 
                JSONObject rates = jsonResponse.getJSONObject("conversion_rates");
                
                
                double salida = rates.getDouble(divisa_salida);
                                 
                System.out.println(salida);
                
                System.out.println("Fin ejecucion");
                return salida;
                
            } else {
                System.out.println("Error: Response code - " + responseCode);
            }

            conn.disconnect();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No fue posible conectarse", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        
       return 0; 
    }
    /**
    public static void main(String[] args) {
        
        Conexion conection = new Conexion();
        double valor = conection.conectarApiDivisa("MXN", "EUR");
        System.out.println(valor);
    }
    */
}
