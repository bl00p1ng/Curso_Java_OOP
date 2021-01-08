package model;

public
class Nurse extends User {

    // Atributos
    private String speciality;

    // Constructor
    public
    Nurse(String name, String email) {

        super(name, email);

    }

    // Getters y Setters
    public
    String getSpeciality() {
        return speciality;
    }

    public
    void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
