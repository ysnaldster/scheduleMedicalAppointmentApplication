package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int id = 0; // Autoincrement -> El valor del dato prevalece mas allá
    // de las instancias del objeto
    private String name;
    private String speciality;

    public Doctor(){id++;}
    public Doctor(String nameDoctor, String specialityDoctor) {
        this.name = nameDoctor;
        this.speciality = specialityDoctor;
    }

    //Methods
    public void showName(){
        System.out.println(name);
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static String showFullDoctor(String name, String speciality){
        return name + speciality;
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments (){
        return availableAppointments;
    }
    //Available Appointment
    public static class AvailableAppointment {
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
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
