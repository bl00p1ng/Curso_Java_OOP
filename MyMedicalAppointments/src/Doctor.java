import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    // Atributos
    static int id = 0;
    private String name;
    private String speciality;

    // Métodos constructores

    Doctor() {

        System.out.println("Construyendo el Objeto Doctor");

    }

    Doctor(String name, String speciality) {

        id++;
        this.name = name;
        this.speciality = speciality;

    }

    // Métodos
    public void showName() {

        System.out.println("El nombre del Doctor asignado es " + name);

    }

    public void showId() {

        System.out.println("ID Doctor: " + id);

    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {

        availableAppointments.add(new AvailableAppointment(date, time));

    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {

        return availableAppointments;

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

        // Getters y Setters


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

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
    }

}
