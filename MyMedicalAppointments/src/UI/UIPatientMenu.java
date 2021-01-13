package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() {

        int response = 0;
        do {

            // Mostar el menú del usuario
            System.out.println("\n\n");
            System.out.println("😷 Patient");
            System.out.println("Welcome " + UIMenu.patientLogged);

            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            // Obtener la opción elegida por el usuario
            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());

            // Evaluar la opción elegida por el usuario
            switch (response) {

                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;

            }

        } while (response != 0);

    }

    // Métodos
    private static void showBookAppointmentMenu() {

        int response = 0;
        do {

            System.out.println(":: 📝 Book an appointment");
            System.out.println(":: Select a date:");

            /*
            Map para mostrar los doctores que tienen citas disponibles
            Key Map externo → Numeración de la lista de fechas
            Key Map anidado → Indice de la fecha que seleccione el usuario
            Ejemplo:
            [doctors]
            Key1
            0.    doctor1
                      Key2
                      0.    fecha1
                      1.    fecha2
                      2.    fecha3
            1.    doctor2
            2.    doctor3
             */
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int auxIndex = 0;

            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {

                ArrayList<Doctor.AvailableAppointment> availableAppointments =
                        UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {

                    auxIndex++;
                    System.out.println(auxIndex + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(auxIndex), doctorAppointments);

                }

            }

            Scanner scanner = new Scanner(System.in);
            int responseDateSelected = Integer.parseInt(scanner.nextLine());

        } while (response != 0);

    }

}
