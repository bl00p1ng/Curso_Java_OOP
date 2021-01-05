public class Patient {

    // Atributos
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // Constructor
    Patient(String name, String email) {

        this.name = name;
        this.email = email;

    }

    // Getters y Setters
    public String getWeight() { return this.weight + " Kg"; }

    public String getHeight() {
        return height + " Mts";
    }

    public void setHeight(double height) {
        this.height = height;
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

    public void setWeight(double weight) {

        this.weight = weight;

    }

}
