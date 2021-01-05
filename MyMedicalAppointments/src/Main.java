import static UI.UIMenu.*;

public class Main {

    public static void main(String[] args) {

        // Mostar menú de la UI
        //showMenu();

        Doctor doctor1 = new Doctor("Andrés");
        Doctor doctor2 = new Doctor("Felipe");

        doctor1.showName();
        doctor2.showName();

        System.out.println("\n");

        doctor2 = doctor1;
        doctor1.showName();
        doctor2.showName();


    }

}
