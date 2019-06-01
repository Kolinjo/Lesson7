package optional;

public class GeneralPractitioner extends Doctor {

	private String disease;

	public GeneralPractitioner(String name, String gender, int yearsOfWork, String disease) {
		super(name, gender, yearsOfWork);
		this.disease = disease;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	void makeHouseCalls() {
		System.out.println(getName()  +", "+ getGender() + " GP with " + getYearsOfWork()+ " years of work, mainly calls people to educate about the " + disease + ".");
	}
}
