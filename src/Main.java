import interfaces.ISchedulable;
import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //UIMenu.showMenu();

        Doctor myDoctor = new Doctor("Ysnaldo Lopez", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), " 4pm");
        myDoctor.addAvailableAppointment(new Date(), " 5pm");
        myDoctor.addAvailableAppointment(new Date(), " 10am");
        myDoctor.addAvailableAppointment(new Date(), " 1pm");
/*        System.out.println(myDoctor);
        System.out.println(myDoctor.getAvailableAppointments());*/
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()
             ) {
            System.out.println(availableAppointment.getDate()+ "" + availableAppointment.getTime());
        }

        //Aplicacion de Clases Abstractas (Pueden ser instanciadas a través de las subclases)
        // El objeto user esta adquiriendo la forma que le esta dando el objeto doctor
        User user = new Doctor("Pepito", "pepito@email.com");
        user.showDataUser();

        User userPa = new Patient("Pepito", "papito@gmail.com");
        userPa.showDataUser();

        // Clases Anónimas (Se crea el comportamiento solo para usarse acá)
        User user1 = new User("Anahi", "anhi@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();
    // Clase Anonima
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /*
        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        Patient patientNuevo = new Patient("Anahi","anahi@gmail.com");
        System.out.println(patient);*/
    }
}
