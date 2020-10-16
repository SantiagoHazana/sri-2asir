package clases.Sara;

import java.util.Scanner;

//a :4 e:3 i :1 o:0 --> mayusculas y sin espacios, que haya otro mensaje donde lo metas

public class Replace {
    public static String cambio(String palabra){ 
        
        return palabra.toLowerCase().replace('a','4').replace('e','3').replace('i','1').replace('é','e').replace('o','0');
    } 

    public static void main (String[] args) {
        String palabra;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        palabra = scanner.nextLine();


        System.out.println(cambio(palabra));
    }
}



