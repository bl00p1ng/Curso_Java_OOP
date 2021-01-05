//import static UI.UIMenu.*;

public class Main {

    public static void main(String[] args) {

        // Mostar menú de la UI
        //showMenu();
        Doctor myDoctor = new Doctor("Andrés López", "Psiquiatra");
        System.out.println("Doctor: " + myDoctor.name);
        System.out.println("Especialidad: " + myDoctor.speciality);

        Patient patient = new Patient("Felipe", "felipe@example.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");

    }

}
