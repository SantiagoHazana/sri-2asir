package random.juegoDeLaVida;

public class Space {

    private boolean isEmpty;
    private String value;

    public Space() {
        isEmpty = true;
        value = "   ";
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
