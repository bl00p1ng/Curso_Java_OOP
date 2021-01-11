package model;

public class Patient extends User {

    // Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // Constructor
    public Patient(String name, String email) {

        super(name, email);

    }

    // Getters y Setters
    public String getWeight() { return this.weight + " Kg"; }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    // Sobrescritura de métodos
    @Override
    public String toString() {

        return super.toString() +
            "Age='" + birthday + '\'' +
            ", weight=" + getWeight() +
            ", height=" + getHeight() +
            ", blood='" + blood + '\'' +
            '}';

    }

    @Override
    public void showDataUser() {

        System.out.println("😷 Paciente: " + getName());
        System.out.println("📄 Historial completo desde nacimiento");

    }

}
