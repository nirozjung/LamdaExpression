package Exercise01;

public class Person{
	private String firstName;
	private String lastName;
	private int age;

	public Person() {

	}


	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}  


	/*@Override
	public int compareTo(Person other) {
		int compareInt=this.lastName.compareTo(other.lastName);
		if(compareInt<0) return -1; // this.lastName is bigger
		if(compareInt>0) return 1; // other.lastName is bigger+
		return 0;                  // they are equal
	}*/

}
