package Exercise01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Niroz", "Karki", 30),
				new Person("James", "Bond", 55), new Person("Sunny", "Chai", 50),
				new Person("Annette", "Schaetzle", 68));

		// Step 1: Sort list by Last name
		// Step 2: Create method that prints all elements in the list
		// Step 3: Create method that prints all people with last name beginning
		// with C

		Unit1Exercise unit = new Unit1Exercise();
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		System.out.println("\n ------------Printing All List values------------- ");
		unit.printAll(people);
		
		System.out.println("\n ------------Printing Lastname begining with C using Lamda Functional Interface------------- ");
	
		// Inline method using Lamda Functional Interface 
		unit.printLastNameConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return (p.getLastName().startsWith("C"));
			}
		});

		System.out.println("\n -----------Printing Firstname begining with C-------------- ");
		printFirstNameBeginingwithC(people);

	} // ends main

	public void printAll(List<Person> ppl) {
		for (Person p : ppl) {
			System.out.println( p);
		}
	}

	public static void printFirstNameBeginingwithC(List<Person> people) {
		for (Person p : people) {
			if (p.getFirstName().startsWith("C"))
				System.out.println(p);
		}

	}

	public void printLastNameConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p);
		}

	}

}

interface Condition {
	boolean test(Person p);
}
