package clases.Jorge;

public class Triangulo extends Figura {

    private float perimetro;
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo(String color, float base, float altura, float lado1, float lado2, float lado3) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public void calcularArea(){
        setArea(base*altura/2);
    }

    public void calcularPerimetro(){
        perimetro = lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
//        return "Triangulo{" + "color='" + getColor() + '\'' + ", area=" + getArea() +
//                ", perimetro=" + perimetro +
//                ", base=" + base +
//                ", altura=" + altura +
//                "} ";
        return String.format("Triangulo{color = %s, area = %2.2f, perimetro = %2.2f, base = %2.2f, altura = %2.2f}", getColor(), getArea(), perimetro, base, altura);
    }
}
