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

        //step 2: search by name
        String search = Console.promptForString("Enter a first or last name to search: ");

        List<Person> matches = new ArrayList<>();

        for (Person person : people){
            if (person.getFirstName().toLowerCase().contains(search)){
                matches.add(person);
            }
        }

        System.out.println("\n--- Search Results ---");
        if (matches.isEmpty()){
            System.out.println("No matches found.");
        }else{
            //almost forgot to add an else factor
            for (Person person: matches){
                System.out.println(person.getFullName());
            }
        }
        //Step 3: calculations
        int totalAge = 0;
        int oldest = people.get(0).getAge();
        int youngest = people.get(0).getAge();

        for(Person p : people){
            int age = p.getAge();

            totalAge += age;

            if(age > oldest){
                oldest = age;
            }
            if (age < youngest){
                youngest = age;
            }
        }
        double averageAge = (double) totalAge / people.size();
        
        System.out.println("\n--- Age Stats ---");
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

    }
}
