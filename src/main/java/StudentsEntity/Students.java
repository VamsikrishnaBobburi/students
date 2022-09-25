package StudentsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Students {
	@Column(name="rollno")
	private long rollno;
	@Column(name="age")
	private int age;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	
	
	
	public Students(long rollno, int age, String name, String gender) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
