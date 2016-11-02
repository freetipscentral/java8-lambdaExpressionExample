package com.freetipscentral.lambdaexpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.freetipscentral.utility.Person;
import com.freetipscentral.utility.PersonFactory;

public class Example3 {

	public static void main(String[] args) {
		List<Person> persons = PersonFactory.createPersons();
		//Collections.sort(persons, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		Collections.sort(persons, (o1, o2) -> o1.getGender().compareTo(o2.getGender()));
		
		persons.forEach(System.out::println);
	}

}
