//import static UI.UIMenu.*;

import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Mostar menú de la UI
        //showMenu();
        Doctor myDoctor = new Doctor("Andrés López", "Psiquiatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        // Mostrar citas disponibles
        /*for (model.Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {

            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());

        }*/

        Patient patient = new Patient("Felipe Molina", "felipe@example.com");

        System.out.println(patient);
        System.out.println(myDoctor);

    }

}
