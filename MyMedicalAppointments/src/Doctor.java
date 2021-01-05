public class Doctor {

    // Atributos
    static int id = 0;
    String name;
    String speciality;

    // Método constructor
    Doctor(String name) {

        id++;
        this.name = name;

    }

    // Métodos
    public void showName() {

        System.out.println("El nombre del Doctor asignado es " + name);

    }

    public void showId() {

        System.out.println("ID Doctor: " + id);

    }

}
