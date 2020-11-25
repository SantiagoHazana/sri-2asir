package clases.Sara.examen2019;

public class Casa {

    Bombilla[] bombillas = new Bombilla[10];

    public Casa(){
        String[] lugares={"Salón","Cocina","Baño","Dormitorio 1","Dormitorio 2","Dormitorio 3","Entrada","Balcón"};

        for (int i = 0; i < bombillas.length; i++) {
            String lugar = lugares[(int)(Math.random()* lugares.length)];
            bombillas[i] = new Bombilla(lugar, false);
        }
    }

    public float consumoTotal(){
        float total = 0;
        for (int i = 0; i < bombillas.length; i++) {
            total += bombillas[i].coste();
        }
        return total;
    }

    public String toString(){
        String res = "Casa[";

        for (int i = 0; i < bombillas.length; i++) {
            res += "Bombilla " + (i+1) + ": " + bombillas[i].toString() + ", \n";
        }

        res += "Consumo: " + consumoTotal() + "€]";

        return res;
    }

}
