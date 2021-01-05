public class Doctor {

    // Atributos
    static int id = 0;
    String name;
    String speciality;

    // Métodos constructores

    Doctor() {

        System.out.println("Construyendo el Objeto Doctor");

    }

    Doctor(String name, String speciality) {

        id++;
        this.name = name;
        this.speciality = speciality;

    }

    // Métodos
    public void showName() {

        System.out.println("El nombre del Doctor asignado es " + name);

    }

    public void showId() {

        System.out.println("ID Doctor: " + id);

    }

}
