package model;

public abstract class User {

    // Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    // Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Métodos
    public abstract void showDataUser();

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber.length() > 8) {

            System.err.println("⚠ El número de teléfono debe tener máximo 8 dígitos");

        } else if (phoneNumber.length() == 8) {

            this.phoneNumber = phoneNumber;

        }

    }

    // Sobrescritura de métodos
    @Override
    public String  toString() {

        return "model.User{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';

    }

}
