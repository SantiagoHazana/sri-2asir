package intro;

public class Persona {

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Persona persona){
        return this.name.equals(persona.name) && this.surname.equals(persona.surname) && this.age ==persona.age;
    }

    public static void main(String[] args) {
        Persona santiago = new Persona();
        Persona santiago2 = new Persona();
        Persona marina = new Persona();
        marina.setName("Marina");
        marina.setSurname("Moreno");
        marina.setAge(31);

        santiago.setName("Santiago");
        santiago.setSurname("Hazaña");
        santiago.setAge(25);
        santiago2.setName("Santiago");
        santiago2.setSurname("Hazaña");
        santiago2.setAge(25);
        System.out.println(santiago.equals(marina));
        System.out.println(santiago2.equals(santiago));
        System.out.println("Mi nombre es " + santiago.getName() + " " + santiago.getSurname() + " y tengo " + santiago.getAge() + " años");
    }
}
