package Exercise01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseLambda {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Niroz", "Karki", 30),
				new Person("James", "Bond", 55), new Person("Sunny", "Chai", 50),
				new Person("Annette", "Schaetzle", 68));
		
		// Step 1: Sort list by Last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		
		
		// Step 2: Create method that prints all elements in the list
		System.out.println("\n ------------Printing All List values------------- ");
		printConditionally(people, p->true);

		System.out.println("\n ----Printing Lastname starting w/ C u/ Lamda Functional Interface---- ");
				


		// Step 3: Create method that prints all people with last name beginning with C
		// Inline method using Lamda Functional Interface
		printConditionally(people, p-> p.getLastName().startsWith("C"));

		System.out.println("\n -----------Printing Firstname begining with C-------------- ");
		printConditionally(people, p-> p.getFirstName().startsWith("C"));

	} // ends main

	public static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p);
		}

	}
	
	// Instead of this code, lambda expression with  functional interface used  
	/*	public static void printFirstNameBeginingwithC(List<Person> people) {
			for (Person p : people) {
				if (p.getFirstName().startsWith("C"))
					System.out.println(p);
			}

		}*/
	
	// We use lamda instead of this method and give condition behaviour true for every items.
	/*public void printAll(List<Person> ppl) {
		for (Person p : ppl) {
			System.out.println(p);
		}
	}
*/

}
