package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    // Atributos
    private String speciality;


    // Método constructor
    public Doctor(String name, String email) {

        super(name, email);

    }

    // Métodos

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {

        availableAppointments.add(new AvailableAppointment(date, time));

    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {

        return availableAppointments;

    }

    // Getters y Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Sobrescritura de métodos
    @Override
    public String toString() {

        return super.toString() +
            "\nSpeciality: " + speciality +
            "\nAvailable: " + availableAppointments.toString();

    }

    @Override
    public void showDataUser() {

        System.out.println("🏥 Empleado del Hospital: Santa Clara");
        System.out.println("🩺 Departamento: Oncología");

    }

    // Static Nested Class Available Appointment
    public static class AvailableAppointment {

        // Atributos
        private int id;
        private Date date;
        String time;


        // Constructor
        public AvailableAppointment(Date date, String time) {

            this.date = date;
            this.time = time;

        }

        // Getters y Setters Static Nested Class
        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        // Sobrescritura de métodos
        @Override
        public String toString() {

            return "AvailableAppointments: \n" +
                "\nDate: " + date +
                "\nTime: "+ time;

        }

    }

}
