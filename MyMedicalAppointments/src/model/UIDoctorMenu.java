package model;

import UI.UIMenu;

import java.util.Scanner;

public class UIDoctorMenu {

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
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = scanner.nextLine();

                System.out.println("You date is: " + date + "\n1. Correct \n2. Change date");

            } else if (response == 0) {

                showDoctorMenu();

            }

        } while (response != 0);

    }

}
