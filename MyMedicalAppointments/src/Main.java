//import static UI.UIMenu.*;

public class Main {

    public static void main(String[] args) {

        // Mostar menú de la UI
        //showMenu();
        Doctor myDoctor = new Doctor("Andrés López", "Psiquiatra");
        System.out.println("Doctor: " + myDoctor.name);
        System.out.println("Especialidad: " + myDoctor.speciality);

    }

}
