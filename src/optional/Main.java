package optional;

public class Main {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor("Mike", "male", 12);
		Doctor doctor1 = new Doctor("Lara", "female", 8);
		
		GeneralPractitioner generalPractitioner = new GeneralPractitioner("John", "male", 5, "malaria");
		GeneralPractitioner generalPractitioner1 = new GeneralPractitioner("Silvia", "female", 3, "heart attack");
		
		Surgeon surgeon = new Surgeon("Ivan", "male", 5, "dental");
		Surgeon surgeon1 = new Surgeon("Anna", "female", 12, "plastic");
		
		doctor.doMedicine();
		doctor1.doMedicine();
		
		generalPractitioner.doMedicine();
		generalPractitioner.makeHouseCalls();
		generalPractitioner1.makeHouseCalls();
		
		surgeon.performSurgery();
		surgeon1.performSurgery();
		
		

	}

}
