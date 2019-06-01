package optional;

public class Doctor {

	private  String name;
	private  String gender;
	private  int yearsOfWork;

	public  Doctor(String name, String gender, int yearsOfWork) {
		
		this.name = name;
		this.gender = gender;
		this.yearsOfWork = yearsOfWork;
	}

	public  String getName() {
		return name;
	}

	public  String getGender() {
		return gender;
	}

	public  int getYearsOfWork() {
		return yearsOfWork;
	}
	
	public  void doMedicine () {
		System.out.println(name +", " + gender +  " doctor with " + yearsOfWork + " years of experience " + "makes diagnose and try to cure patients.");
	}
	
	
	
}
