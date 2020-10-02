package intro;

import java.util.Scanner;

public class ExampleSwitch {

    enum Mes {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        // Ejemplo con nota
        System.out.printf("Ingrese su nota: ");
        nota = scanner.nextInt();

        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.printf("Suspenso");
                break;
            case 5:
                System.out.printf("Aprobado");
                break;
            case 6:
                System.out.printf("Bien");
                break;
            case 7:
            case 8:
                System.out.printf("Notable");
                break;
            case 9:
                System.out.printf("Sobresaliente");
                break;
            case 10:
                System.out.printf("Matricula de honor");
                break;
            default:
                System.out.printf("Ingrese una nota valida entre 0 y 10");
                break;
        }

        // Ejemplo con meses
        Mes mes = Mes.AGOSTO;
        int dias;

        switch (mes){
            case FEBRERO:
                dias = 28;
                break;

            case ENERO:
            case MARZO:
            case MAYO:
            case JULIO:
            case AGOSTO:
            case OCTUBRE:
            case DICIEMBRE:
                dias = 31;
                break;

            case ABRIL:
            case JUNIO:
            case NOVIEMBRE:
            case SEPTIEMBRE:
                dias = 30;
                break;
        }
    }
}
