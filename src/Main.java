import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //UIMenu.showMenu();

        Doctor myDoctor = new Doctor("Ysnaldo Lopez", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), " 4pm");
        myDoctor.addAvailableAppointment(new Date(), " 5pm");
        myDoctor.addAvailableAppointment(new Date(), " 10am");
        myDoctor.addAvailableAppointment(new Date(), " 1pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()
             ) {
            System.out.println(availableAppointment.getDate()+ "" + availableAppointment.getTime());
        }

        //Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        //Patient patientNuevo = new Patient("Anahi","anahi@gmail.com");

    }
}
