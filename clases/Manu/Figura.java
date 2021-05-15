package clases.Manu;

public class Figura {

    private String color;

    public Figura(String color){
        this.color = color;
    }

    public Figura(){
        this.color = "Blanco";
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }

}
