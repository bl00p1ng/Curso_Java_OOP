import static UI.UIMenu.*;

public class Main {

    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Andrés López";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();

        // Mostar menú de la UI
        showMenu();

    }

}
