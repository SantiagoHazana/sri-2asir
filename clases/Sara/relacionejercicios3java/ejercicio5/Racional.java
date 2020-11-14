class Racional {
    private int numerador;
    private int denominador;

    // contructores
    Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    Racional(int numerador, int denominador) {
        int maxcod = mcd(numerador, denominador);
        this.numerador = numerador / maxcod;
        this.denominador = denominador / maxcod;
    }

    // metodos
    // maximo comun divisor
    static int mcd(int a, int b) {
        int aux;
        while (b != 0) {
            aux = a % b;
            b = aux;
        }
        return a;

    }

    public Racional Suma(Racional b) {
        int numerador, denominador;
        denominador = this.denominador * b.denominador;
        numerador = this.numerador * b.denominador + b.numerador * this.denominador;
        return new Racional(numerador, denominador);
    }

    public Racional resta(Racional b) {
        int numerador, denominador;
        denominador = this.denominador * b.denominador;
        numerador = this.numerador * b.denominador - b.numerador * this.denominador;
        return new Racional(numerador, denominador);
    }

    public Racional multiplicacion(Racional b) {
        int numerador, denominador;
        numerador = this.numerador * b.numerador;
        denominador = this.denominador * b.denominador;
        return new Racional(numerador, denominador);
    }

    //Otra forma de hacerlo simplificando
    //public Racional multiplicacion(Racional b) {
    //    return new Racional(this.numerador * b.numerador, this.denominador*b.denominador);
    //}

    public Racional division(Racional b) {
        int numerador, denominador;
        numerador = this.numerador * b.denominador;
        denominador = this.denominador * b.nominador;
        return new Racional(numerador, denominador);
    }

    public float toFloat(){
        return this.numerados/(float)this.denominador;
    }

    public String toString() {
        return toString.format("%d / %d", numerador, denominador);
    }

}
