public class DataEnterist extends User {

	private int yearsOfExperience;

	public DataEnterist(String name, Gender gender, Position position, int age, int id, int salary,
			int yearsOfExperience) {
		super(name, gender, position, age, id, salary);
		this.setYearsOfExperience(yearsOfExperience);
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {

		return super.toString() + "DataEnterist [yearsOfExperience=" + yearsOfExperience + "]";
	}

}
