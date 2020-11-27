package clases.Marine.ejercicioExamen;

public class Cifrador {

    public char hackLetter(char c){
        switch (c){
            case 'a':
            case 'A':
                return '4';
            case 'e':
            case 'E':
                return '3';
            case 'i':
            case 'I':
                return '1';
            case 'o':
            case 'O':
                return '0';
            default:
                return c;
        }
    }

    public char dehackLetter(char c){
        switch (c){
            case '4':
                return 'a';
            case '3':
                return 'e';
            case '1':
                return 'i';
            case '0':
                return 'o';
            default:
                return c;
        }
    }

}
