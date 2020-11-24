package relaciones.relacion3;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void comprobarDia(){
        if (day > monthDays(month))
            day = 1;
    }

    public void comprobarMes(){
        if (month>12 || month<1)
            month = 1;
    }

    public String toString(){
        return String.format("Fecha[Dia: %d, Mes: %d, Año: %d]", day, month, year);
    }

    private int monthDays(int month){
        switch (month){
            case 2:
                return 28;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 0;
    }
}
