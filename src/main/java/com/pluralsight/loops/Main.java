package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        // Step 1: Create list of people
        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Emily", "Johnson", 31));
        people.add(new Person("Michael", "Williams", 19));
        people.add(new Person("Sarah", "Brown", 42));
        people.add(new Person("David", "Jones", 28));
        people.add(new Person("Jessica", "Garcia", 35));
        people.add(new Person("Daniel", "Miller", 22));
        people.add(new Person("Laura", "Davis", 27));
        people.add(new Person("James", "Martinez", 50));
        people.add(new Person("Sophia", "Lopez", 18));

        
    }
}
