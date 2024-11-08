# ConvertidorMonedaApp
Reto Alura ONE
Este proyecto es una aplicación de consola en Java para realizar la conversión de monedas. Fue desarrollado como parte del entrenamiento en la especialización en back-end, con el objetivo de practicar la integración de APIs y la implementación de lógica de negocio en un entorno Java.

## Descripción:
La aplicación permite al usuario convertir montos entre diferentes monedas mediante el uso de una API externa para obtener las tasas de cambio actualizadas. El programa está organizado en varias clases, cada una con responsabilidades específicas para fomentar un diseño limpio y modular.

## Estructura del Proyecto
El proyecto está dividido en las siguientes clases y paquetes:

1 api.ConexionApi: Clase encargada de gestionar la conexión a la API externa y de recuperar las tasas de cambio en tiempo real.
2 model.MonedaRecord: Clase que representa las distintas monedas y sus propiedades.
3 service.ConversorMoneda: Clase que contiene la lógica para convertir los montos de una moneda a otra.
4 app.Principal: Clase principal que inicia la aplicación y coordina las operaciones.

## Requisitos
Java 11 o superior
Conexión a Internet para la consulta de tasas de cambio mediante la API.

Instrucciones de Uso:

### 1 Clonar este repositorio en tu máquina local.
### 2 Compilar el proyecto ejecutando
javac -d bin com/AluraONE/ConvertidorMoneda/app/Principal.java
### 3 Ejecutar la aplicación desde la clase Principal
### 4 Seguir las instrucciones en pantalla para seleccionar las monedas y el monto a convertir.

*******************************************************

Sea bienvenido/a al  Conversor de Moneda 

 
1) Dólar =>> Peso Argentino
2) Peso Argentino =>> Dólar 
3) Dólar =>> Real Brasileño
4) Real Brasileño =>> Dólar 
5) Dólar =>> Peso Colombiano
6) Peso colombiano =>> Dólar   
7) Salir
Elija una opción válida:

******************************************************

## Ejemplo de Conversión
El usuario ingresa el monto en la moneda de origen, selecciona la moneda de destino, y la aplicación muestra el valor convertido basado en la tasa de cambio actual.

## Contribución
Este proyecto es una práctica de aprendizaje, pero si deseas sugerir mejoras o reportar problemas, siéntete libre de abrir un "issue" o enviar un "pull request".

## Autor
Marco Menoza Pulido
Creado como parte de un ejercicio de aprendizaje en la especialización de back-end.
