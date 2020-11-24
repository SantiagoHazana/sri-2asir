package relaciones.relacion3;

public class Reloj {
    private int hours;
    private int minutes;
    private int seconds;

    public Reloj(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Reloj(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getHour24(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String getHour(boolean mode12){
        if (mode12){
            int hour12 = hours%12;
            return String.format("%02d:%02d:%02d %s", hour12, minutes, seconds, hours<12||hours==24? "am":"pm");
        }else{
            return getHour24();
        }
    }

    public void setTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }

    public void setTime(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

}
