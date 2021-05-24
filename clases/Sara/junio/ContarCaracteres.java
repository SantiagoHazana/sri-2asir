package clases.Sara.junio;

import java.util.Scanner;

public class ContarCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = scanner.nextLine();

        analizarFrase(frase);

    }

    public static void analizarFrase(String frase){
        int letras = 0;
        int numeros = 0;
        int vocales = 0;
        int especiales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i); // me devuelve el caracter que esta en esa posicion, sea lo que sea
            // compruebo si es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                vocales++;
            }else if (caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' || caracter == '6' || caracter == '7' || caracter == '8' || caracter == '9'){
                numeros++;
            }else if (caracter >= 65 && caracter <= 90 || caracter >= 97 && caracter <= 122){
                letras++;
            }else{
                especiales++;
            }


        }
        System.out.printf("Cantidad de letras: %d\n", letras+vocales);
        System.out.printf("Cantidad de numeros: %d\n", numeros);
        System.out.printf("Cantidad de vocales: %d\n", vocales);
        System.out.printf("Cantidad de especiales: %d\n", especiales);
    }

}
