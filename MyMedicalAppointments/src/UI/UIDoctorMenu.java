package UI;

import UI.UIMenu;
import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {

        int response = 0;
        do {

            // Mostrar menú
            System.out.println("\n\n");
            System.out.println("🩺 Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());

            System.out.println("1. Add Available Appointment");
            System.out.println("2, My Schedule appointments");
            System.out.println("0. Logout");

            // Obtener la opción elegida por el doctor
            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());

            // Evaluar la opción elegida por el doctor
            switch (response) {
                case 1:
                    showAddAvailableAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        } while (response != 0);

    }

    private static void showAddAvailableAppointmentMenu() {

        int response = 0;
        do {

            System.out.println("\n");
            System.out.println(":: 📝 Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++) {

                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);

            }
            System.out.println("0. ↩ Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());

            if (response > 0 && response < 4) {

                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected - 1]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = scanner.nextLine();

                System.out.println("You date is: " + date + "\n1. Correct \n2. Change date");
                int responseDate = Integer.parseInt(scanner.nextLine());

                // Volver a mostrar el menú si se quiere cambiar la fecha de la cita
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {

                    System.out.println("Insert the time available for date: " + date + " [hh:mm]");
                    time = scanner.nextLine();
                    System.out.println("You time is: " + time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.parseInt(scanner.nextLine());

                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            } else if (response == 0) {

                showDoctorMenu();

            }

        } while (response != 0);

    }

    private static void checkDoctorAvailableAppointments(Doctor doctor) {

        // Verificar si un doctor tiene citas y no esta en el arrayList de doctores con citas
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {

            // Si sew cumplen ambas condiciones se añade el doctor al arrayList
            doctorsAvailableAppointments.add(doctor);

        }

    }

}
