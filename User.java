package SystemForPatients;

import java.util.Objects;

public class User {
	Gender gender;
	Position position;
	private String name ;
	private int age, id, salary;
	
	public User(String name, Gender gender, Position position, int age, int id, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.position = position;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getgender() {
		return gender;
	}
	public void setgender(Gender gender) {
		this.gender = gender;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", position=" + position + ", age=" + age + ", id=" + id
				+ ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, position, salary, gender);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(position, other.position) && salary == other.salary && Objects.equals(gender, other.gender);
	}

	
}
