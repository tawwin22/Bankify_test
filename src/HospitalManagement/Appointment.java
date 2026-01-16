package HospitalManagement;

public class Appointment {
	Patient patient;
	Doctor doctor;
	String appointmentDate;
	
	public Appointment(Patient patient, Doctor doctor, String appointment) {
		this.patient = patient;
		this.doctor= doctor;
		this.appointmentDate= appointmentDate;
	}
	
	void displayAppointmentDetails()
	{
		System.out.println(" ");
	}
}
