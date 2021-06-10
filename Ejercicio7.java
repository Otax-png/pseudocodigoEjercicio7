import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorCeros = 0;
        int numero;
        int porcentajePares, porcentajeImpares, porcentajeCeros;

        System.out.println("A continuacion se generarán 15 numeros aleatorios");

        for (int i = 1; i < 15; i++) {

            numero = ((int)Math.floor(Math.random()*36 - 0 +1) + 0);
            System.out.println(numero);

            if (numero % 2 == 0){
                contadorPares++;
            } else if(numero == 0){
                contadorCeros++;
            } else{
                contadorImpares++;
            }
        }

        porcentajePares = (contadorPares * 100)/15;
        porcentajeImpares = (contadorImpares * 100)/15;
        porcentajeCeros = (contadorCeros * 100)/15;

        System.out.println("Porcentaje de numeros pares " + porcentajePares + "%");
        System.out.println("Porcentaje de numeros impares " + porcentajeImpares + "%");
        System.out.println("Porcentaje de ceros generados " + porcentajeCeros + "%");
    }
}