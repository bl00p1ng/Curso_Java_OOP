//import static UI.UIMenu.*;

import model.Doctor;
import model.Patient;
import model.User;

// import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*
        Mostar menú de la UI
        showMenu();
        Doctor myDoctor = new Doctor("Andrés López", "Psiquiatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        */

        User user = new Doctor("Anahí", "anahí@santaclara.health");
        user.showDataUser();

        User userPatient = new Patient("Andrés López", "andres@example.com");

        User user1 = new User("Felipe Molina", "felipe@example.com") {
            @Override
            public void showDataUser() {
                System.out.println("🩺 Doctor \n");
                System.out.println("🏥 Hospital: San Vicente de Paul");
                System.out.println("💉 Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        // Mostrar citas disponibles
        /* for (model.Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {

            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());

        }*/

        // Patient patient = new Patient("Felipe Molina", "felipe@example.com");

        // System.out.println(patient);
        // System.out.println(myDoctor);

    }

}
