package com.AluraONE.ConvertidorMoneda.service;
import com.AluraONE.ConvertidorMoneda.api.ConexionAPI;
import com.AluraONE.ConvertidorMoneda.model.MonedaRecord;
import com.google.gson.Gson;
import java.util.Scanner;

public class ConversorMoneda {

    private final Gson gson = new Gson(); // Crear instancia de Gson

    public void convertir(String baseCode, String targetCode) {
        String jsonResponse = ConexionAPI.getJSONResponse(baseCode, targetCode);
        MonedaRecord exchangeRate = parseJSONToRecord(jsonResponse);

        if (exchangeRate != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad a convertir: ");
            double amount = scanner.nextDouble();
            double convertedAmount = amount * exchangeRate.conversion_rate();

            String formattedOutput1 = String.format("Tasa de cambio: 1 (%s) = %.2f (%s)",
                    exchangeRate.base_code(),
                    exchangeRate.conversion_rate(),
                    exchangeRate.target_code());
            String formattedOutput2 = String.format("Monto convertido: %.2f (%s) corresponde al valor final de =>>> %.2f (%s)\n",
                    amount,
                    exchangeRate.base_code(),
                    convertedAmount,
                    exchangeRate.target_code());

            System.out.println(formattedOutput1);
            System.out.println(formattedOutput2);


        } else {
            System.out.println("No se pudo obtener la tasa de cambio. Intente más tarde.");
        }
    }

    // Metodo para analizar JSON y crear un ExchangeRateRecord con Gson
    private MonedaRecord parseJSONToRecord(String jsonResponse) {
        if (jsonResponse == null) {
            return null;
        }
        try {
            // Usar Gson para convertir el JSON en un ExchangeRateRecord
            return gson.fromJson(jsonResponse, MonedaRecord.class);
        } catch (Exception e) {
            System.out.println("Error al parsear JSON con Gson: " + e.getMessage());
            return null;
        }
    }
}

