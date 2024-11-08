package com.AluraONE.ConvertidorMoneda.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {

    private static final String API_KEY = "cd588ffb0d64a7c0c5ac7f8d";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    // Metodo para obtener la respuesta JSON de la API
    public static String getJSONResponse(String baseCode, String targetCode) {
        String urlString = BASE_URL + baseCode + "/" + targetCode;

        try {
            // Crear cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Crear solicitud HTTP GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .GET()
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar si la respuesta fue exitosa (status code 200)
            if (response.statusCode() == 200) {
                return response.body(); // Retornar el cuerpo de la respuesta como String
            } else {
                System.out.println("Error al conectar con la API. Código de respuesta: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println("Error en la solicitud HTTP: " + e.getMessage());
        }

        return null; // Retornar null si hubo un error
    }
}