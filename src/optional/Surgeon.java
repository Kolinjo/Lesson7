package optional;

public class Surgeon extends Doctor {
	
	private String specialties;

	public Surgeon(String name, String gender, int yearsOfWork, String specialties) {
		super(name, gender, yearsOfWork);
		this.specialties = specialties;
	}

	public String getSpecialties() {
		return specialties;
	}

	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}
	
	public void performSurgery () {
		if (getYearsOfWork()>10) {
			System.out.println(getName() + " you are qualified to specialies in " + specialties + " surgery.");
		}
		else 
			System.out.println(getName() + ", you need to get more practise and learn in order to become " + specialties + " surgeon.");
	}

}
