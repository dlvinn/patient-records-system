
import java.util.Objects;

public class Doctor extends User {

	private int yearsOfExperience;
	private String qualifications, speciality;

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public Doctor(String name, Gender gender, Position position, int age, int id, int salary, int yearsOfExperience,
			String qualifications, String speciality) {
		super(name, gender, position, age, id, salary);
		this.yearsOfExperience = yearsOfExperience;
		this.qualifications = qualifications;
		this.speciality = speciality;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {

		return super.toString() + "Doctor [yearsOfExperience=" + yearsOfExperience + ", qualifications="
				+ qualifications + ", speciality="
				+ speciality + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(qualifications, speciality, yearsOfExperience);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(qualifications, other.qualifications) && Objects.equals(speciality, other.speciality)
				&& yearsOfExperience == other.yearsOfExperience;
	}

}
