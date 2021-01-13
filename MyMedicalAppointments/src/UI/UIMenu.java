package UI;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    // Métodos
        // Mostrar menú
        public static void showMenu() {
            System.out.println("Welcome to My Appointments");
            System.out.println("Selecciona la opción deseada");

            int response = 0;
            do {
                System.out.println("1. Doctor");
                System.out.println("2. Patient");
                System.out.println("0. Salir");

                Scanner sc = new Scanner(System.in);
                response = Integer.parseInt(sc.nextLine());

                switch (response){
                    case 1:
                        System.out.println("Doctor");
                        authUser(1);
                        response = 0;
                        break;
                    case 2:
                        authUser(2);;
                        response = 0;
                        break;
                    case 0:
                        System.out.println("Thank you for you visit");
                        break;
                    default:
                        System.out.println("Please select a correct answer");
                }
            }while (response != 0);
        }

        public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {

        /*
        userType = 1 → Doctor
        userType = 2 → Paciente
         */

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Julian Duque", "julian@santaclara.health"));
        doctors.add(new Doctor("Karen Sosa", "karen@santaclara.health"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@santaclara.health"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Andrés López", "andres@example.com"));
        patients.add(new Patient("David Guzmán", "david@example.com"));
        patients.add(new Patient("Manuela Ortiz", "manuela@example.com"));

        boolean isEmailCorrect = false;
        do {

            System.out.println("Insert your Email: [user@example.com]");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();

            if (userType == 1) {

                for (Doctor doctor : doctors) {

                    if (doctor.getEmail().equals(email)) {

                        isEmailCorrect = true;

                        // Obtener el usuario logueado.
                        doctorLogged = doctor;

                        // Mostrar menú del Doctor
                        UIDoctorMenu.showDoctorMenu();

                    }

                }

            } else if (userType == 2) {

                for (Patient patient : patients) {

                    if (patient.getEmail().equals(email)) {

                        isEmailCorrect = true;

                        // Obtener el usuario logueado.
                        patientLogged = patient;

                        // Mostrar menú del paciente

                    }

                }

            }

        } while (!isEmailCorrect);

    }

}
