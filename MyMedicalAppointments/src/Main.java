//import static UI.UIMenu.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Mostar menú de la UI
        //showMenu();
        Doctor myDoctor = new Doctor("Andrés López", "Psiquiatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        // Mostrar citas disponibles
        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {

            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());

        }

    }

}
