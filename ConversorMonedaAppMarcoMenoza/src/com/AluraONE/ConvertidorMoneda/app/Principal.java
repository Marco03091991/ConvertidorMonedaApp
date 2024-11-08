package com.AluraONE.ConvertidorMoneda.app;
import com.AluraONE.ConvertidorMoneda.service.ConversorMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConversorMoneda convertirMoneda = new ConversorMoneda();
        boolean salir = false;

        while (!salir) {
            System.out.println("*******************************************************\n" +
                    "Sea bienvenido/a al  Conversor de Moneda =]\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    "1) Dólar =>> Peso Argentino\n" +
                    "2) Peso Argentino =>> Dólar\n" +
                    "3) Dólar =>> Real Brasileño\n" +
                    "4) Real Brasileño =>> Dólar\n" +
                    "5) Dólar =>> Peso Colombiano\n" +
                    "6) Peso colombiano =>> Dólar\n" +
                    "7) Salir\n"+
                    "Elija una opción valiida:\n"+
                    "*******************************************************");
            int option = lectura.nextInt();

            switch (option) {
                case 1 -> convertirMoneda.convertir("USD", "ARS");
                case 2 -> convertirMoneda.convertir("ARS", "USD");
                case 3 -> convertirMoneda.convertir("USD", "BRL");
                case 4 -> convertirMoneda.convertir("BRL", "USD");
                case 5 -> convertirMoneda.convertir("USD", "COP");
                case 6 -> convertirMoneda.convertir("COP", "USD");
                case 7 -> {
                    System.out.println("Gracias por usar el conversor de moneda. ¡Hasta luego!");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
        lectura.close();
    }
}